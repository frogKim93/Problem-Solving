package inputoutput;

import java.util.Scanner;

public class P10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int caseCount = Integer.parseInt(scanner.nextLine());
        int[][] cases = new int[caseCount][2];

        for (int i = 0; i < caseCount; i++) {
            String caseText = scanner.nextLine();
            String[] split = caseText.split(" ");
            cases[i][0] = Integer.parseInt(caseText.split(" ")[0]);
            cases[i][1] = Integer.parseInt(caseText.split(" ")[1]);
        }

        scanner.close();

        for (int i = 0; i < caseCount; i++) {
            System.out.println(cases[i][0] + cases[i][1]);
        }
    }
}
