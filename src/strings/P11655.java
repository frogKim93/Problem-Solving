package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        reader.close();

        String rot13 = "";

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);

            if (Character.isUpperCase(current)) {
                int currentValue = (int) current;
                int rot13Value = currentValue + 13;

                if (rot13Value > (int) 'Z') {
                    rot13Value = (int) 'A' + rot13Value - (int) 'Z' - 1;
                }

                rot13 += Character.toString(rot13Value);
            } else if (Character.isLowerCase(current)) {
                int currentValue = (int) current;
                int rot13Value = currentValue + 13;

                if (rot13Value > (int) 'z') {
                    rot13Value = (int) 'a' + rot13Value - (int) 'z' - 1;
                }

                rot13 += Character.toString(rot13Value);
            } else {
                rot13 += current;
            }
        }

        System.out.println(rot13);
    }
}
