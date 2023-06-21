package lpf.learn.codeforces.game.round881.div3;

import java.io.*;
import java.util.StringTokenizer;

public class QE {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] lrs = new int[m][2];

            for (int i = 0; i < m; i++) {
                lrs[i][0] = sc.nextInt() - 1;
                lrs[i][1] = sc.nextInt() - 1;
            }

            int q = sc.nextInt();
            int[] x = new int[q];
            for (int i = 0; i < q; i++) x[i] = sc.nextInt() - 1;

            out.println(run(n, lrs, q, x));
        }
        out.flush();
    }

    private static int run(int n, int[][] lrs, int q, int[] x) {
        int[] preSum = buildPreSum(n, q - 1, x);
        if (!check(preSum, lrs)) return -1;

        int l = 0, r = q - 1;

        while (l < r) {
            int mid = (r + l) >> 1;
            preSum = buildPreSum(n, mid, x);
            if (check(preSum, lrs)) r = mid;
            else l = mid + 1;
        }
        return l + 1;
    }

    private static int[] buildPreSum(int n, int k, int[] x) {
        int[] a = new int[n];

        for (int j = 0; j <= k; j++) a[x[j]]++;

        int[] preSum = new int[n + 1];
        for (int i = 0; i < n; i++) preSum[i + 1] = preSum[i] + a[i];

        return preSum;
    }

    private static boolean check(int[] preSum, int[][] lrs) {
        for (int[] lr : lrs) {
            if ((preSum[lr[1] + 1] - preSum[lr[0]]) << 1 > lr[1] - lr[0] + 1) return true;
        }
        return false;
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
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
