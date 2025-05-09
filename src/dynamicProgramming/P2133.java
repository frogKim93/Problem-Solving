package dynamicProgramming;

import java.util.Scanner;

public class P2133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        scanner.close();

        if (size % 2 != 0) {
            System.out.println(0);
            return;
        }

        int[] dp = new int[size + 1];
        dp[2] = 3;

        for (int i = 4; i <= size; i += 2) {
            dp[i] = dp[i - 2] * dp[2];
            dp[i] += 2;

            for (int j = i - 4; j >= 2; j -= 2) {
                dp[i] += dp[j] * 2;
            }
        }

        System.out.println(dp[size]);
    }
}
