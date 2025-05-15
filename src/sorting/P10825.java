package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int[][] scores = new int[count][4];
        String[] names = new String[count];

        for (int i = 0; i < count; i++) {
            String[] info = reader.readLine().split(" ");
            names[i] = info[0];
            scores[i][0] = i;
            scores[i][1] = Integer.parseInt(info[1]);
            scores[i][2] = Integer.parseInt(info[2]);
            scores[i][3] = Integer.parseInt(info[3]);
        }

        Arrays.sort(scores, (o1, o2) -> {
            if (o1[1] != o2[1]) {
                return o2[1] - o1[1];
            } else if (o1[2] != o2[2]) {
                return o1[2] - o2[2];
            } else if (o1[3] != o2[3]) {
                return o2[3] - o1[3];
            }

            return names[o1[0]].compareTo(names[o2[0]]);
        });

        for (int[] score : scores) {
            System.out.println(names[score[0]]);
        }

        reader.close();
    }
}
