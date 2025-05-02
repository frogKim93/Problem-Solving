package inputOutput;

import java.util.Scanner;

public class P2442 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int maxStarCount = count * 2 - 1;

        for (int i = 1; i <= count; i++) {
            int currentStarCount = i * 2 - 1;
            int currentBlankCount = (maxStarCount - currentStarCount) / 2;

            for (int j = 0; j < currentBlankCount; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < currentStarCount; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
