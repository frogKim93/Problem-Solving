package inputOutput;

import java.util.Scanner;

public class P10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String caseText = scanner.nextLine();
            String[] split = caseText.split(" ");

            if (split.length == 1) {
                break;
            }

            int sum = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);

            if (sum == 0) {
                break;
            }

            System.out.println(sum);
        }

        scanner.close();
    }
}
