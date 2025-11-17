package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1857/E
 */
public class Q1857E {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            long[] res = solve2(n, a);
            for (long v : res) out.print(v + " ");
            out.println();
        }
        out.close();
    }


    private static long[] solve2(int n, int[] a) {
        Integer[] indexs = new Integer[n];
        Arrays.setAll(indexs, i -> i);

        Arrays.sort(indexs, Comparator.comparingInt(i -> a[i]));

        long g = n;
        for (int i = 0; i < n; i++) g += a[indexs[i]] - a[indexs[0]];


        long[] res = new long[n];
        res[indexs[0]] = g;
        for (int i = 1; i < n; i++) {
            g -= (a[indexs[i]] - a[indexs[i - 1]]) * (n - 2L * i);

            res[indexs[i]] = g;
        }
        return res;
    }


    private static long[] solve(int n, int[] a) {
        TreeMap<Integer, List<Integer>> valueToIndex = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            List<Integer> indexs = valueToIndex.computeIfAbsent(a[i], (k) -> new ArrayList<>());
            indexs.add(i);
        }

        long g = g0(n, valueToIndex);
        long lastValue = valueToIndex.firstKey();
        long[] res = new long[n];
        int r = n, l = 0;
        for (Map.Entry<Integer, List<Integer>> entry : valueToIndex.entrySet()) {
            int value = entry.getKey();
            List<Integer> indexs = entry.getValue();

            g -= ((value - lastValue) * (r - l));

            lastValue = value;
            r -= indexs.size();
            l += indexs.size();

            for (Integer i : indexs) res[i] = g;
        }
        return res;
    }
    private static long g0(int n, TreeMap<Integer, List<Integer>> valueToIndex) {
        Map.Entry<Integer, List<Integer>> firstEntry = valueToIndex.firstEntry();
        long lastKey = firstEntry.getKey();
        int firstCount = firstEntry.getValue().size();

        long r = n - firstCount;
        long g = n;
        for (Map.Entry<Integer, List<Integer>> entry : valueToIndex.entrySet()) {
            long value = entry.getKey();
            if (lastKey == value) continue;

            g += (value - lastKey) * r;

            lastKey = value;
            r -= entry.getValue().size();
        }
        return g;
    }

}
