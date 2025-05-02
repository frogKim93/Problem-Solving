package inputOutput;

import java.util.Scanner;

public class P10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String caseText = scanner.nextLine();
            String[] split = caseText.split(" ");

            if (split.length == 1) {
                scanner.close();
                break;
            }

            int firstNumber = Integer.parseInt(split[0]);
            int secondNumber = Integer.parseInt(split[1]);
            System.out.println(firstNumber + secondNumber);
        }
    }
}
