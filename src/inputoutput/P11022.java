package inputoutput;

import java.util.Scanner;

public class P11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseCount = Integer.parseInt(scanner.nextLine());
        String format = "Case #%d: %d + %d = %d";

        for (int i = 1; i <= caseCount; i++) {
            String caseText = scanner.nextLine();
            String[] split = caseText.split(" ");
            int firstNumber = Integer.parseInt(split[0]);
            int secondNumber = Integer.parseInt(split[1]);

            System.out.println(String.format(format, i, firstNumber, secondNumber, firstNumber + secondNumber));
        }

        scanner.close();
    }
}
