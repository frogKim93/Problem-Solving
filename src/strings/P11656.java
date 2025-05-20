package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        reader.close();
        String[] words = new String[word.length()];

        for (int i = 0; i < word.length(); i++) {
            words[i] = word.substring(i);
        }

        Arrays.sort(words);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
