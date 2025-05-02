package dynamicProgramming;

import java.util.Scanner;

public class P11726 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] dp = new int[Math.max(3, number + 1)];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= number; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2])% 10007;
        }

        System.out.println(dp[number] );
        scanner.close();
    }
}
