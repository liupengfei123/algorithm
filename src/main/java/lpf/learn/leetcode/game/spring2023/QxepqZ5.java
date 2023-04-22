package lpf.learn.leetcode.game.spring2023;

import java.util.*;

public class QxepqZ5 {

    public int fieldOfGreatestBlessing(int[][] forceField) {
        int n = forceField.length;

        Arrays.sort(forceField, Comparator.comparing(a -> a[0] + a[2] / 2.0));

        int max = 0;
        for (int i = 0; i < n; i++) {
            double xValue = forceField[i][0] + forceField[i][2] / 2.0;

            List<double[]> temp  = new ArrayList<>();
            temp.add(new double[]{forceField[i][1] - forceField[i][2] / 2.0, forceField[i][1] + forceField[i][2] / 2.0});

            for (int j = i + 1; j < n; j++) {
                if (forceField[j][0] - forceField[j][2] / 2.0 <= xValue) {
                    temp.add(new double[]{forceField[j][1] - forceField[j][2] / 2.0, forceField[j][1] + forceField[j][2] / 2.0});
                }
            }
            int count = 1;
            if (temp.size() > 1) {
                count = test(temp);
            }
            max = Math.max(max, count);
        }

        return max;
    }

    private int test( List<double[]> list) {
        list.sort(Comparator.comparing(a -> a[1]));

        int n = list.size();
        int max = 0;
        for (int i = 0; i < n; i++) {
            double value = list.get(i)[1];

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j)[0] <= value) count++;
            }
            max = Math.max(max, count);
        }

        return max;
    }
}
