package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String countAndIndex = reader.readLine();
        int count = Integer.parseInt(countAndIndex.split(" ")[0]);
        int index = Integer.parseInt(countAndIndex.split(" ")[1]);
        long[] numbers = new long[count];

        String[] totalNumberTexts = reader.readLine().split(" ");

        for (int i = 0; i < count; i++) {
            numbers[i] = Long.parseLong(totalNumberTexts[i]);
        }

        Arrays.sort(numbers);
        System.out.println(numbers[index - 1]);
        reader.close();
    }
}
