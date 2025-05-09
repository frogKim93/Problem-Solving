package dynamicProgramming;

import java.util.Scanner;

public class P11052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String[] packTexts = scanner.nextLine().split(" ");
        int[] packPrices = new int[packTexts.length];

        for (int i = 0; i < packPrices.length; i++) {
            packPrices[i] = Integer.parseInt(packTexts[i]);
        }

        int[] dp = new int[count];
        dp[0] = packPrices[0];

        for (int i = 1; i < count; i++) {
            dp[i] = packPrices[i];

            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i], dp[j] + dp[i - j - 1]);
            }
        }

        System.out.println(dp[count - 1]);
        scanner.close();
    }
}
