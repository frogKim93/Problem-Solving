package inputoutput;

import java.util.Scanner;

public class P2742 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = count; i >= 1; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
