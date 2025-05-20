package math;

import java.io.*;

public class P1850 {
    static long getGCD(long numberA, long numberB) {
        while (numberB != 0) {
            long temp = numberA % numberB;
            numberA = numberB;
            numberB = temp;
        }

        return numberA;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String text = reader.readLine();
        long numberA = Long.parseLong(text.split(" ")[0]);
        long numberB = Long.parseLong(text.split(" ")[1]);
        long gcd = getGCD(numberA, numberB);

        for (int i = 0; i < gcd; i++) {
            writer.write("1");
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
