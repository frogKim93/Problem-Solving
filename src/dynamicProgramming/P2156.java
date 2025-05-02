package dynamicProgramming;

import java.util.Scanner;

public class P2156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int[] amounts = new int[count];

        for (int i = 0; i < count; i++) {
            amounts[i] = Integer.parseInt(scanner.nextLine());
        }

        int[] dp = new int[count];

        dp[0] = amounts[0];

        if (count > 1) {
            dp[1] = dp[0] + amounts[1];
        }

        for (int i = 2; i < count; i++) {
            int case1 = dp[i - 2] + amounts[i];
            int case2 = amounts[i - 1] + amounts[i];

            if (i > 2) {
                case2 += dp[i - 3];
            }

            int case3 = dp[i - 1];

            dp[i] = Math.max(case1, Math.max(case2, case3));
        }

        System.out.println(dp[count - 1]);
        scanner.close();
    }
}
