package inputOutput;

import java.util.Scanner;

public class P10991 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxStarCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < maxStarCount; i++) {
            for (int j = 0; j < maxStarCount - 1 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                if (j != 0) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
