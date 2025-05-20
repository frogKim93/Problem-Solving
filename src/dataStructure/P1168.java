package dataStructure;

import java.io.*;
import java.util.ArrayList;

public class P1168 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        reader.close();

        int person = Integer.parseInt(text.split(" ")[0]);
        int count = Integer.parseInt(text.split(" ")[1]);

        ArrayList<Integer> persons = new ArrayList<>();

        for (int i = 0; i < person; i++) {
            persons.add(i + 1);
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write("<");

        int lastIndex = 0;
        while (!persons.isEmpty()) {
            int removeIndex = lastIndex + count - 1;

            if (removeIndex >= persons.size()) {
                removeIndex %= persons.size();
            }

            writer.write(Integer.toString(persons.remove(removeIndex)));

            if (!persons.isEmpty()) {
                writer.write(", ");
            }

            lastIndex = removeIndex;

            if (lastIndex == persons.size()) {
                lastIndex = 0;
            }
        }

        writer.write(">");
        writer.flush();
    }
}
