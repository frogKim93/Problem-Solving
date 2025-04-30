package inputoutput;

import java.util.Scanner;

public class P2741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
