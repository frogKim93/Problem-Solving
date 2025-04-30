package inputoutput;

import java.util.Scanner;

public class P10953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < caseCount; i++) {
            String caseText = scanner.nextLine();
            String[] split = caseText.split(",");
            System.out.println(Integer.parseInt(split[0]) + Integer.parseInt(split[1]));
        }

        scanner.close();
    }
}
