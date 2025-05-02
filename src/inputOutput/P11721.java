package inputOutput;

import java.util.Scanner;

public class P11721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i += 10) {
            int lastIndex = Math.min(i + 10, text.length());
            System.out.println(text.substring(i, lastIndex));
        }

        scanner.close();
    }
}
