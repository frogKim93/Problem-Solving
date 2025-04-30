package inputoutput;

import java.util.Scanner;

public class P2522 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int lastCount = count * 2 - 1;
        boolean isReverse = false;

        for (int i = 1; i <= lastCount; i++) {
            int currentStarCount = i;

            if (isReverse) {
                currentStarCount = count * 2 - i;
            }

            int currentBlankCount = count - currentStarCount;

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
