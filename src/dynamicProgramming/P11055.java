package dynamicProgramming;

import java.util.Scanner;

public class P11055 {
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
            dp[i] = numbers[i];

            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i] && dp[i] < dp[j] + numbers[i]) {
                    dp[i] = dp[j] + numbers[i];
                }
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < count; i++) {
            if (dp[maxIndex] < dp[i]) {
                maxIndex = i;
            }
        }

        System.out.println(dp[maxIndex]);
        scanner.close();
    }
}
