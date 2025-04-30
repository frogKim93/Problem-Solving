package inputoutput;

import java.util.Scanner;

public class P10992 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineCount = Integer.parseInt(scanner.nextLine());
        int maxStarCount = lineCount * 2 - 1;

        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < lineCount - 1 - i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i != 0) {
                if (i == lineCount - 1) {
                    for (int j = 0; j < maxStarCount - 1; j++) {
                        System.out.print("*");
                    }
                } else {
                    int innerBlankCount = (i - 1) * 2 + 1;
                    
                    for (int j = 0; j < innerBlankCount; j++) {
                        System.out.print(" ");
                    }

                    System.out.print("*");
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}
