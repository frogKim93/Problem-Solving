package dynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class P9461 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        ArrayList<Long> lineSizes = new ArrayList<>();
        lineSizes.add(1L);
        lineSizes.add(1L);
        lineSizes.add(1L);
        lineSizes.add(2L);
        lineSizes.add(2L);

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (lineSizes.size() >= number) {
                System.out.println(lineSizes.get(number - 1));
                continue;
            }

            for (int j = lineSizes.size(); j <= number; j++) {
                lineSizes.add(lineSizes.get(j - 1) + lineSizes.get(j - 5));
            }

            System.out.println(lineSizes.get(number - 1));
        }

        scanner.close();
    }
}
