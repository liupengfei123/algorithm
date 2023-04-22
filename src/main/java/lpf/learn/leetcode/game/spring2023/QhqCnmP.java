package lpf.learn.leetcode.game.spring2023;

import java.util.Map;
import java.util.TreeMap;

public class QhqCnmP {
    public int[] supplyWagon(int[] supplies) {
        int n = supplies.length;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < n; i++) treeMap.put(i, supplies[i]);

        int t = n - (n >> 1);

        while (t-- > 0) {
            Map.Entry<Integer, Integer> entry1 = null;
            int min = Integer.MAX_VALUE;

            for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                Map.Entry<Integer, Integer> entry2 = treeMap.ceilingEntry(entry.getKey() + 1);
                if (entry2 == null) {
                    continue;
                }
                int temp = entry.getValue() + entry2.getValue();
                if (min > temp) {
                    entry1 = entry;
                    min = temp;
                }
            }
            entry1.setValue(min);
            treeMap.remove(treeMap.ceilingEntry(entry1.getKey() + 1).getKey());
        }




        int[] res = new int[n >> 1];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) res[i++] = entry.getValue();

        return res;
    }
}
