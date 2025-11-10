package lpf.learn.codeforces.d1200;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/2000/D
 */
public class Q2000D {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] scope = new int[n];
            for (int i = 0; i < n; i++) scope[i] = sc.nextInt();
            char[] chars = sc.next().toCharArray();

            out.println(solve2(n, scope, chars));
        }
        out.close();
    }

    private static long solve2(int n, int[] scope, char[] chars) {
        long[] preSum = new long[n + 1];
        for (int i = 0; i < n; i++) preSum[i + 1] = preSum[i] + scope[i];

        long res = 0;
        for (int l = 0, r = n - 1; l < r; l++, r--) {
            while (l < n && chars[l] != 'L') l++;
            while (r >= 0 && chars[r] != 'R') r--;

            if (l < r)
                res += preSum[r + 1] - preSum[l];
        }
        return res;
    }

    private static long solve(int n, int[] scope, char[] chars) {
        long[] preSum = new long[n + 1];
        for (int i = 0; i < n; i++) preSum[i + 1] = preSum[i] + scope[i];

        Queue<Integer> leftIndex = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (chars[i] == 'L') leftIndex.add(i);
        }

        long res = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (chars[i] == 'L') continue;

            if (leftIndex.isEmpty()) break;

            Integer lIndex = leftIndex.poll();

            if (lIndex >= i) break;
            res += preSum[i + 1] - preSum[lIndex];
        }
        return res;
    }
}
