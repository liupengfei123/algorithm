package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/2145/C
 */
public class Q2145C {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            char[] a = sc.next().toCharArray();

            out.println(solve(n, a));
        }
        out.close();
    }

    private static int solve(int n, char[] a) {
        int ac = 0, bc = 0;
        for (char c : a) {
            if (c == 'a') ac++;
            else bc++;
        }

        int d = ac - bc;

        int res = n;
        int[] preSum = new int[n + 1];
        Map<Integer, Integer> sumToIndex = new HashMap<>();
        sumToIndex.put(0, 0);

        for (int i = 1; i <= n; i++) {
            preSum[i] = preSum[i - 1] + (a[i - 1] == 'a' ? 1 : -1);

            sumToIndex.put(preSum[i], i);

            int sumJ = preSum[i] - d;
            Integer j = sumToIndex.get(sumJ);
            if (j != null) res = Math.min(res, i - j);
        }
        return res == n ? -1 : res;
    }

    private static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
