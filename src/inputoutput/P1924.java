package inputoutput;

import java.util.List;
import java.util.Scanner;

public class P1924 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] monthDay = scanner.nextLine().split(" ");
        scanner.close();

        int month = Integer.parseInt(monthDay[0]);
        int day = Integer.parseInt(monthDay[1]);

        List<Integer> monthOf31Days = List.of(1, 3, 5, 7, 8, 10, 12);
        List<Integer> monthOf30Days = List.of(4, 6, 9, 11);
        List<String> months = List.of("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT");

        int different = 0;

        while (month != 1) {
            if (monthOf31Days.contains(month - 1)) {
                different += 31;
            } else if (monthOf30Days.contains(month - 1)) {
                different += 30;
            } else {
                different += 28;
            }

            month--;
        }

        different += day;
        System.out.println(months.get(different % 7));
    }
}
