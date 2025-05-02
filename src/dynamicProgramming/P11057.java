package dynamicProgramming;

import java.util.Scanner;

public class P11057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[][] dp = new int[number + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= number; i++) {
            for (int j = 0; j < 10; j++) {
                dp[i][j] = 0;

                for (int k = 0; k <= j; k++) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][k]) % 10007;
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = (sum + dp[number][i]) % 10007;
        }

        System.out.println(sum);
        scanner.close();
    }
}
