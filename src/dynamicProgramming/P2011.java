package dynamicProgramming;

import java.util.Scanner;

public class P2011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        int[] numbers = new int[text.length()];
        boolean hasError = false;

        if (text.startsWith("0")) {
            hasError = true;
        } else {
            for (int i = 0; i < text.length(); i++) {
                numbers[i] = Integer.parseInt(text.charAt(i) + "");

                if (numbers[i] == 0 && (numbers[i - 1] > 2 || numbers[i - 1] == 0)) {
                    hasError = true;
                    break;
                }
            }
        }

        if (hasError) {
            System.out.println(0);
            return;
        }

        //dp[i][j] : i자리까지 암호 조합 수(j=0 : 마지막수가 한자리로 끝남, j=1 : 마지막수가 2자리로 끝남)
        int[][] dp = new int[text.length()][2];
        dp[0][0] = 1;
        dp[0][1] = 0;

        for (int i = 1; i < text.length(); i++) {
            if (numbers[i] > 0) {
                dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]) % 1000000;
            } else {
                dp[i][0] = 0;
            }

            if (numbers[i - 1] == 1 || (numbers[i - 1] == 2 && numbers[i] < 7)) {
                dp[i][1] = dp[i - 1][0];
            } else {
                dp[i][1] = 0;
            }
        }

        System.out.println((dp[text.length() - 1][0] + dp[text.length() - 1][1]) % 1000000);
    }
}
