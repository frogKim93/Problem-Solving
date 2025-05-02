package inputOutput;

import java.util.Scanner;

public class P2440 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = count; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
