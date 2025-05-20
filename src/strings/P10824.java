package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = reader.readLine().split(" ");
        reader.close();
        long[] numbers = new long[2];

        numbers[0] = Long.parseLong(words[0] + words[1]);
        numbers[1] = Long.parseLong(words[2] + words[3]);

        System.out.println(numbers[0] + numbers[1]);
    }
}
