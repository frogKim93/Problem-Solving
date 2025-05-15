package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int[][] numbers = new int[count][2];

        for (int i = 0; i < count; i++) {
            String[] point = reader.readLine().split(" ");
            numbers[i][0] = Integer.parseInt(point[0]);
            numbers[i][1] = Integer.parseInt(point[1]);
        }

        Arrays.sort(numbers, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }

            return o1[1] - o2[1];
        });

        for (int[] number : numbers) {
            System.out.println(number[0] + " " + number[1]);
        }

        reader.close();
    }
}
