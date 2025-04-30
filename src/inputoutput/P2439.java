package inputoutput;

import java.util.Scanner;

public class P2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count; i++) {
            for (int j = 0; j < count - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
