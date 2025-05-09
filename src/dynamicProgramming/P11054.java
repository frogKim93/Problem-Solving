package dynamicProgramming;

import java.util.Scanner;

public class P11054 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[count];
        String numbersText = scanner.nextLine();

        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(numbersText.split(" ")[i]);
        }

        int[] dp = new int[count];

        for (int i = 0; i < count; i++) {
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }

        int[] reverseDp = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            reverseDp[i] = 1;

            for (int j = count - 1; j > i; j--) {
                if (numbers[j] < numbers[i]) {
                    reverseDp[i] = Math.max(reverseDp[j] + 1, reverseDp[i]);
                }
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < count; i++) {
            if (dp[maxIndex] + reverseDp[maxIndex] < dp[i] + reverseDp[i]) {
                maxIndex = i;
            }
        }

        System.out.println(dp[maxIndex] + reverseDp[maxIndex] - 1);
        scanner.close();
    }
}
