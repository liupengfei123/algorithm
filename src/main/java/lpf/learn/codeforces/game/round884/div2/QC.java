package lpf.learn.codeforces.game.round884.div2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class QC {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            out.println(solve(n, a));
        }
        out.flush();
    }

    private static long solve(int n, int[] a) {
        long[] dp = new long[2];
        Arrays.fill(dp, Long.MIN_VALUE >> 1);
        long res = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int j = i & 1;

            dp[j] = Math.max(dp[j], Math.max(a[i], dp[j] + a[i]));
            res = Math.max(res, dp[j]);
        }
        return res;
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
