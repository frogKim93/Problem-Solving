package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int[][] ages = new int[count][2];
        String[] names = new String[count];

        for (int i = 0; i < count; i++) {
            String[] info = reader.readLine().split(" ");
            ages[i][0] = i;
            ages[i][1] = Integer.parseInt(info[0]);
            names[i] = info[1];
        }

        Arrays.sort(ages, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }

            return o1[1] - o2[1];
        });

        for (int[] indexAndAge : ages) {
            System.out.println(indexAndAge[1] + " " + names[indexAndAge[0]]);
        }

        reader.close();
    }
}
