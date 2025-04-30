package inputoutput;

import java.util.Scanner;

public class P2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dan = Integer.parseInt(scanner.nextLine());
        String format = "%d * %d = %d";

        for (int i = 1; i <= 9; i++) {
            System.out.println(String.format(format, dan, i, dan * i));
        }

        scanner.close();
    }
}
