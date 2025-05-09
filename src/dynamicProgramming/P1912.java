package dynamicProgramming;

import java.util.Scanner;

public class P1912 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int[] dp = new int[count];
        int[] numbers = new int[count];
        int index = 0;

        for (String text : scanner.nextLine().split(" ")) {
            numbers[index] = Integer.parseInt(text);
            index++;
        }

        dp[0] = numbers[0];
        int maxSum = dp[0];

        for (int i = 1; i < count; i++) {
            dp[i] = Math.max(numbers[i], dp[i - 1] + numbers[i]);
            maxSum = Math.max(maxSum, dp[i]);
        }

        System.out.println(maxSum);
        scanner.close();
    }
}
