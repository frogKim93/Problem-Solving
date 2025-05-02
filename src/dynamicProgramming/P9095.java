package dynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class P9095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(1);
        results.add(1 + results.get(1));
        results.add(1 + results.get(2) + results.get(1));

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < results.size()) {
                System.out.println(results.get(number));
            } else {
                for (int j = Math.max(4, results.size()); j <= number; j++) {
                    results.add(results.get(j - 1) + results.get(j - 2) + results.get(j - 3));
                }

                System.out.println(results.get(number));
            }

        }

        scanner.close();
    }
}
