package math;

import java.io.*;

public class P9613 {
    static int getGCD(int numberA, int numberB) {
        while (numberB != 0) {
            int temp = numberA % numberB;
            numberA = numberB;
            numberB = temp;
        }

        return numberA;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            String text = reader.readLine();
            int[] numbers = new int[Integer.parseInt(text.split(" ")[0])];
            long sum = 0;

            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = Integer.parseInt(text.split(" ")[j + 1]);
            }

            for (int j = 0; j < numbers.length; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    sum += getGCD(numbers[j], numbers[k]);
                }
            }

            System.out.println(sum);
        }

        reader.close();
        writer.close();
    }
}
