package lpf.learn.leetcode.game.spring2023;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q0Zeoeg {
    public int adventureCamp(String[] expeditions) {
        Set<String> set = new HashSet<>();
        set.add("");

        String[] split = expeditions[0].split("->");
        set.addAll(Arrays.asList(split));

        int res = -1;
        int max = 0;
        for (int i = 1; i < expeditions.length; i++) {
            split = expeditions[i].split("->");

            int count = 0;
            for (String s : split) {
                if (set.add(s)) count++;
            }
            if (max < count) {
                res = i;
                max = count;
            }
        }
        return res;
    }
}
