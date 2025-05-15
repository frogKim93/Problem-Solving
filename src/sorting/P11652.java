package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        Map<Long, Integer> numbers = new HashMap<>();
        long minNumber = Long.MAX_VALUE;
        int maxCount = 0;

        for (int i = 0; i < count; i++) {
            Long number = Long.parseLong(reader.readLine());
            numbers.put(number, numbers.getOrDefault(number, 0) + 1);

            int currentCount = numbers.get(number);

            if (maxCount < currentCount) {
                maxCount = currentCount;
                minNumber = number;
            } else if (maxCount == currentCount && minNumber > number) {
                minNumber = number;
            }
        }

        System.out.println(minNumber);
        reader.close();
    }
}
