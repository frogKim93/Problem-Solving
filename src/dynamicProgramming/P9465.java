package dynamicProgramming;

import java.util.Scanner;

public class P9465 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            int size = Integer.parseInt(scanner.nextLine());
            String[] upperLine = scanner.nextLine().split(" ");
            String[] lowerLine = scanner.nextLine().split(" ");
            int[][] scores = new int[2][size];

            for (int j = 0; j < size; j++) {
                scores[0][j] = Integer.parseInt(upperLine[j]);
                scores[1][j] = Integer.parseInt(lowerLine[j]);
            }

            int[][] dp = new int[size][2];
            dp[0][0] = scores[0][0];
            dp[0][1] = scores[1][0];

            for (int j = 1; j < size; j++) {
                if (j == 1) {
                    dp[j][0] = dp[j - 1][1] + scores[0][j];
                    dp[j][1] = dp[j - 1][0] + scores[1][j];
                } else {
                    dp[j][0] = Math.max(dp[j - 1][1], dp[j - 2][1]) + scores[0][j];
                    dp[j][1] = Math.max(dp[j - 1][0], dp[j - 2][0]) + scores[1][j];
                }
            }

            System.out.println(Math.max(dp[size - 1][0], dp[size - 1][1]));
        }
        scanner.close();
    }
}
