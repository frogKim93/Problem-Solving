package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        ArrayList<Integer> stack = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String command = reader.readLine();

            if (command.contains("push")) {
                stack.add(Integer.parseInt(command.split(" ")[1]));
            } else {
                switch (command) {
                    case "top":
                        if (stack.size() > 0) {
                            System.out.println(stack.get(stack.size() - 1));
                        } else {
                            System.out.println(-1);
                        }
                        break;
                    case "pop":
                        if (stack.size() > 0) {
                            System.out.println(stack.get(stack.size() - 1));
                            stack.remove(stack.size() - 1);
                        } else {
                            System.out.println(-1);
                        }
                        break;
                    case "size":
                        System.out.println(stack.size());
                        break;
                    case "empty":
                        System.out.println(stack.isEmpty() ? 1 : 0);
                        break;
                }
            }
        }

        reader.close();
    }
}
