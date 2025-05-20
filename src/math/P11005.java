package math;

import java.io.*;
import java.util.Stack;

public class P11005 {
    static String convertNumberToString(int number) {
        if (number < 10) {
            return Integer.toString(number);
        }

        int aValue = 'A';
        return Character.toString((char) (aValue - 10 + number));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] conditions = reader.readLine().split(" ");
        int number = Integer.parseInt(conditions[0]);
        int jinbub = Integer.parseInt(conditions[1]);
        Stack<String> stack = new Stack<>();

        if (jinbub == 10) {
            System.out.println(number);
        } else {
            while (number != 0) {
                stack.push(convertNumberToString(number % jinbub));
                number /= jinbub;
            }
        }

        while (!stack.isEmpty()) {
            writer.write(stack.pop());
        }

        writer.flush();

        reader.close();
        writer.close();
    }
}
