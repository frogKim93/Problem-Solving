package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String condition = reader.readLine();
        ArrayList<Character> stack = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < condition.length(); i++) {
            Character currentChar = condition.charAt(i);

            if (currentChar == '(') {
                stack.add('(');
            } else {
                stack.remove(stack.size() - 1);

                if (condition.charAt(i - 1) == '('){
                    count += stack.size();
                } else{
                    count++;
                }
            }
        }

        System.out.println(count);
        reader.close();
    }
}
