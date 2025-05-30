package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        reader.close();
        int[] alphabets = new int[26];
        int aValue = Character.getNumericValue('a');

        for (int i = 0; i < word.length(); i++) {
            int alphabetIndex = Character.getNumericValue(word.charAt(i)) - aValue;
            alphabets[alphabetIndex]++;
        }

        String result = "";
        for (int i = 0; i < alphabets.length; i++) {
            result += alphabets[i] + " ";
        }

        System.out.println(result.trim());
    }
}
