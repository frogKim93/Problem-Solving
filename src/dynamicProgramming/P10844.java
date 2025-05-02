package dynamicProgramming;

import java.util.Scanner;

public class P10844 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int[][] dp = new int[count + 1][10];

        for (int i = 1; i <= count; i++) {
            if (i == 1) {
                for (int j = 1; j <= 9; j++) {
                    dp[i][j] = 1;
                }
            } else {
                for (int j = 0; j <= 9; j++) {
                    if (j == 0) {
                        dp[i][j] = dp[i - 1][1];
                    } else if (j == 9) {
                        dp[i][j] = dp[i - 1][8];
                    } else {
                        dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
                    }
                }
            }
        }

        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += dp[count][i];
            sum %= 1000000000;
        }

        System.out.println(sum);
        scanner.close();
    }
}
