package dynamicProgramming;

import java.util.Scanner;

public class P2225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberAndSizeText = scanner.nextLine();
        scanner.close();

        int number = Integer.parseInt(numberAndSizeText.split(" ")[0]);
        int size = Integer.parseInt(numberAndSizeText.split(" ")[1]);
        int[][] dp = new int[number + 1][size + 1];
        dp[0][0] = 1;

        for (int i = 0; i <= number; i++) {
            for (int j = 1; j <= size; j++) {
                for (int k = 0; k <= i; k++) {
                    dp[i][j] = (dp[i][j] + dp[i - k][j - 1]) % 1000000000;
                }
            }
        }

        System.out.println(dp[number][size]);
    }
}
