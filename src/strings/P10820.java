package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = null;
        int valueOfa = 'a';
        int valueOfA = 'A';
        int valueOf0 = '0';

        while ((text = reader.readLine()) != null) {
            int upperCases = 0;
            int lowerCases = 0;
            int numbers = 0;
            int blanks = 0;

            for (int i = 0; i < text.length(); i++) {
                int value = text.charAt(i);

                if (value >= valueOfa) {
                    lowerCases++;
                } else if (value >= valueOfA) {
                    upperCases++;
                } else if (value >= valueOf0) {
                    numbers++;
                } else {
                    blanks++;
                }
            }

            System.out.println(lowerCases + " " + upperCases + " " + numbers + " " + blanks);
        }

        reader.close();
    }
}
