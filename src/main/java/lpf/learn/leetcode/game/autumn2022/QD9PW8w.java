package lpf.learn.leetcode.game.autumn2022;

import java.util.HashSet;
import java.util.Set;

public class QD9PW8w {
    public int transportationHub(int[][] path) {

        // [i][0] 表示 多少个点到 i， [i][1]表示有i
        int[][] pointCount = new int[1000][2];
        Set<Integer> set = new HashSet<>();
        for (int[] ints : path) {
            pointCount[ints[1]][0]++;
            pointCount[ints[0]][1]++;

            set.add(ints[0]);
            set.add(ints[1]);
        }

        for (int i = 0; i < pointCount.length; i++) {
            if (pointCount[i][0] == set.size() - 1 && pointCount[i][1] == 0) {
                return i;
            }
        }
        return -1;
    }
}
