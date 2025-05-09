package dynamicProgramming;

import java.util.Scanner;

public class P2579 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int[] dp = new int[count];
        int[] stairs = new int[count];

        for (int i = 0; i < count; i++) {
            stairs[i] = Integer.parseInt(scanner.nextLine());
        }

        dp[0] = stairs[0];

        if (count > 1) {
            dp[1] = dp[0] + stairs[1];
        }

        for (int i = 2; i < count; i++) {
            int case1 = dp[i - 2] + stairs[i];
            int case2 = stairs[i - 1] + stairs[i];
            if (i > 2) {
                case2 += dp[i - 3];
            }

            dp[i] = Math.max(case1, case2);
        }

        System.out.println(dp[count - 1]);

        scanner.close();
    }
}
