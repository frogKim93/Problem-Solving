package dataStructure;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class P1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int count = Integer.parseInt(reader.readLine());
        Deque<Character> front = new ArrayDeque<>();
        Deque<Character> back = new ArrayDeque<>();

        for (int i = 0; i < text.length(); i++) {
            front.addLast(text.charAt(i));
        }

        for (int i = 0; i < count; i++) {
            String command = reader.readLine();

            if (command.equals("L")) {
                if (!front.isEmpty()) {
                    back.addFirst(front.pollLast());
                }
            } else if (command.equals("D")) {
                if (!back.isEmpty()) {
                    front.addLast(back.pollFirst());
                }
            } else if (command.equals("B")) {
                if (!front.isEmpty()) {
                    front.pollLast();
                }
            } else {
                front.addLast(command.charAt(2));
            }
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        while (!front.isEmpty()) {
            writer.write(front.pollFirst());
        }

        while (!back.isEmpty()) {
            writer.write(back.pollFirst());
        }

        writer.flush();
        reader.close();
    }
}
