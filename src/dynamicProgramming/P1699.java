package dynamicProgramming;

import java.util.Scanner;

public class P1699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] dp = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            dp[i] = i;

            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        System.out.println(dp[number]);
        scanner.close();
    }
}
