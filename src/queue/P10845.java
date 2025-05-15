package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        Queue<Integer> queue = new LinkedList<>();
        Integer lastInput = null;

        for (int i = 0; i < count; i++) {
            String command = reader.readLine();

            if (command.contains("push")) {
                lastInput = Integer.parseInt(command.split(" ")[1]);
                queue.offer(lastInput);
            } else if (command.equals("pop")) {
                Integer out = queue.poll();
                System.out.println(out == null ? -1 : out);
            } else if (command.equals("size")) {
                System.out.println(queue.size());
            } else if (command.equals("empty")) {
                System.out.println(queue.isEmpty() ? 1 : 0);
            } else if (command.equals("front")) {
                Integer first = queue.peek();
                System.out.println(first == null ? -1 : first);
            } else if (command.equals("back")) {
                System.out.println(queue.isEmpty() ? -1 : lastInput);
            }
        }

        reader.close();
    }
}
