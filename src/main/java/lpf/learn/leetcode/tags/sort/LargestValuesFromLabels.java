package lpf.learn.leetcode.tags.sort;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LargestValuesFromLabels {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparing((int[] a) -> a[0]).reversed());
        for (int i = 0; i < values.length; i++) queue.add(new int[]{values[i], labels[i]});

        int res = 0;
        int[] visit = new int[20010];
        while (numWanted > 0 && !queue.isEmpty()) {
            int[] poll = queue.poll();
            if (visit[poll[1]]++ < useLimit) {
                numWanted--;
                res += poll[0];
            }
        }
        return res;
    }
}
