package math;

import java.io.*;

public class P1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            String text = reader.readLine();
            int numberA = Integer.parseInt(text.split(" ")[0]);
            int numberB = Integer.parseInt(text.split(" ")[1]);
            int biggerNumber = Math.max(numberA, numberB);
            int smallerNumber = Math.min(numberA, numberB);

            for (int j = 1; j <= numberA * numberB; j++) {
                if (j * biggerNumber % smallerNumber == 0) {
                    writer.write(j * biggerNumber + "\n");
                    writer.flush();
                    break;
                }
            }
        }

        reader.close();
        writer.close();
    }
}
