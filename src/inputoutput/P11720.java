package inputoutput;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String numbersText = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += Integer.parseInt("" + numbersText.charAt(i));
        }

        System.out.println(sum);

        scanner.close();
    }
}
