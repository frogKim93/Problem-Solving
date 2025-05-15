package sorting;

import java.io.*;
import java.util.Arrays;

public class P10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(numbers);

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int number : numbers) {
            writer.write(number + "\n");
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
