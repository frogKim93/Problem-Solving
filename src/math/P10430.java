package math;

import java.io.*;

public class P10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        reader.close();

        int numberA = Integer.parseInt(text.split(" ")[0]);
        int numberB = Integer.parseInt(text.split(" ")[1]);
        int numberC = Integer.parseInt(text.split(" ")[2]);

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        writer.write((numberA + numberB) % numberC + "\n");
        writer.write(((numberA % numberC) + (numberB % numberC)) % numberC + "\n");
        writer.write(((numberA * numberB) % numberC) + "\n");
        writer.write(((numberA % numberC) * (numberB % numberC)) % numberC + "\n");

        writer.flush();
        writer.close();
    }
}
