package deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class P10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < count; i++) {
            String command = reader.readLine();

            if (command.contains("push")) {
                Integer number = Integer.parseInt(command.split(" ")[1]);

                if (command.contains("front")) {
                    deque.addFirst(number);
                } else {
                    deque.addLast(number);
                }
            } else if (command.contains("pop")) {
                if (deque.size() == 0) {
                    System.out.println(-1);
                } else if (command.contains("front")) {
                    System.out.println(deque.pollFirst());
                } else {
                    System.out.println(deque.pollLast());
                }
            } else if (command.contains("size")) {
                System.out.println(deque.size());
            } else if (command.contains("empty")) {
                System.out.println(deque.size() == 0 ? 1 : 0);
            } else if (command.contains("front")) {
                System.out.println(deque.size() == 0 ? -1 : deque.peekFirst());
            } else if (command.contains("back")) {
                System.out.println(deque.size() == 0 ? -1 : deque.peekLast());
            }
        }

        reader.close();
    }
}
