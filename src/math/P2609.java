package math;

import java.io.*;
import java.util.ArrayList;

public class P2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        reader.close();

        int numberA = Integer.parseInt(text.split(" ")[0]);
        int numberB = Integer.parseInt(text.split(" ")[1]);

        int biggerNumber = Math.max(numberA, numberB);
        int smallerNumber = Math.min(numberA, numberB);
        int greatestCommonDivisor = 1;
        ArrayList<Integer> smallerNumberDivisors = new ArrayList<>();

        for (int i = 1; i <= smallerNumber; i++) {
            if (smallerNumber % i == 0) {
                smallerNumberDivisors.add(i);
            }
        }

        for (int i = smallerNumberDivisors.size() - 1; i >= 0; i--) {
            if (biggerNumber % smallerNumberDivisors.get(i) == 0) {
                greatestCommonDivisor = smallerNumberDivisors.get(i);
                break;
            }
        }

        int leastCommonMultiple = biggerNumber * smallerNumber;

        for (int i = 1; i < biggerNumber * smallerNumber; i++) {
            if (i * biggerNumber % smallerNumber == 0) {
                leastCommonMultiple = i * biggerNumber;
                break;
            }
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        writer.write(greatestCommonDivisor + "\n");
        writer.write(leastCommonMultiple + "\n");
        writer.flush();
        writer.close();
    }
}
