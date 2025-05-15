package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            ArrayList<Integer> stack = new ArrayList<>();
            String text = reader.readLine();
            boolean isVPS = true;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == '(') {
                    stack.add(1);
                } else if (text.charAt(j) == ')') {
                    if (stack.size() == 0) {
                        isVPS = false;
                        break;
                    }

                    stack.remove(stack.size() - 1);
                }
            }


            System.out.println(isVPS && stack.size() == 0 ? "YES" : "NO");
        }

        reader.close();
    }
}
