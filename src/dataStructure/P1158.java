package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1158 {
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

        String result = "<";

        int lastIndex = 0;
        while (!persons.isEmpty()) {
            int removeIndex = lastIndex + count - 1;

            if (removeIndex >= persons.size()) {
                removeIndex %= persons.size();
            }

            int removedPerson = persons.remove(removeIndex);
            result += removedPerson;

            if (!persons.isEmpty()) {
                result += ", ";
            }

            lastIndex = removeIndex;

            if (lastIndex == persons.size()) {
                lastIndex = 0;
            }
        }

        result += ">";

        System.out.println(result);
    }
}
