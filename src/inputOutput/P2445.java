package inputOutput;

import java.util.Scanner;

public class P2445 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int lastCount = count * 2 - 1;
        int maxStarCount = count * 2;
        boolean isReverse = false;

        for (int i = 1; i <= lastCount; i++) {
            int currentStarCount = i;

            if (isReverse) {
                currentStarCount = maxStarCount - i;
            }

            int currentBlankCount = maxStarCount - currentStarCount * 2;

            for (int j = 0; j < currentStarCount; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < currentBlankCount; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < currentStarCount; j++) {
                System.out.print("*");
            }

            if (i == count) {
                isReverse = true;
            }

            System.out.println();
        }

        scanner.close();
    }
}
