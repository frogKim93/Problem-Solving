package inputOutput;

import java.util.Scanner;

public class P10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String[] numberTexts = scanner.nextLine().split(" ");
        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < number; i++) {
            max = Math.max(max, Integer.parseInt(numberTexts[i]));
            min = Math.min(min, Integer.parseInt(numberTexts[i]));
        }

        scanner.close();

        System.out.println(min + " " + max);
    }
}
