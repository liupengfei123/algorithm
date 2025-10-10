package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1999/E
 */
public class Q1999E {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));


    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int L = sc.nextInt(), R = sc.nextInt();
            out.println(solve(L, R));
            out.println(solve2(L, R));
        }
        out.close();
    }


    private final static TreeMap<Integer, Integer> TREE_MAP = new TreeMap<>();
    static {
        int c = 1, v = 3;
        TREE_MAP.put(1, c++);
        while (v <= 200000) {
            TREE_MAP.put(v, c++);
            v *= 3;
        }
    }
    private static int solve(int L, int R) {
        Map.Entry<Integer, Integer> entry = TREE_MAP.floorEntry(L);
        int k = entry.getKey(), v = entry.getValue(), nk = k * 3;

        int res = v;
        while (k <= R) {
            int c = Math.min(nk - 1, R) - Math.max(k, L) + 1;
            res += c * v;

            k = nk;
            nk = k * 3;
            v++;
        }
        return res;
    }

    private final static int[] preA = new int[200001];
    private final static int[] preSum = new int[200001];
    static {
        int c = 1, nk = 3;
        for (int i = 1; i < preA.length; i++) {
            if (i == nk) {
                nk *= 3;
                c++;
            }
            preA[i] = c;
            preSum[i] = preSum[i - 1] + preA[i];
        }
    }

    private static int solve2(int L, int R) {
        // return preSum[L] - preSum[L - 1]  + preSum[R] - preSum[L - 1] ;
        // preA = preSum[L] - preSum[L - 1]
        return preA[L] + preSum[R] - preSum[L - 1];
    }


}
