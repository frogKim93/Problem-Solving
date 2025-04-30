package inputoutput;

import java.util.Scanner;

public class P2446 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int maxStarCount = count * 2 - 1;
        boolean isReverse = false;

        for (int i = 0; i < maxStarCount; i++) {
            int currentStarCount = maxStarCount - (i * 2);

            if (isReverse) {
                currentStarCount = 1 + (i - count + 1) * 2;
            }

            int currentBlankCount = (maxStarCount - currentStarCount) / 2;

            for (int j = 0; j < currentBlankCount; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < currentStarCount; j++) {
                System.out.print("*");
            }

            if (i + 1 == count) {
                isReverse = true;
            }

            System.out.println();
        }

        scanner.close();
    }
}
