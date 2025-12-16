package lpf.learn.luogu.exercise;

import java.io.*;
import java.util.*;

/**
 * https://www.luogu.com.cn/problem/P1627
 */
public class P1627 {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        out.println(solve(n, b, a));
        out.close();
    }

    private static int solve(int n, int b, int[] a) {
        int bi = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                bi = i;
                break;
            }
        }

        Map<Integer, Integer> sufSumCount = new HashMap<>();
        sufSumCount.put(0, 1);
        int sufSum = 0;
        for (int i = bi + 1; i < a.length; i++) {
            sufSum += (a[i] > b ? 1 : -1);
            sufSumCount.merge(sufSum, 1, Integer::sum);
        }

        int res = sufSumCount.get(0);
        int preSum = 0;
        for (int i = bi - 1; i >= 0; i--) {
            preSum += (a[i] > b ? 1 : -1);
            res += sufSumCount.getOrDefault(-preSum, 0);
        }
        return res;
    }
}
