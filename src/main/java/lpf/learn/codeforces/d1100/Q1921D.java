package lpf.learn.codeforces.d1100;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * https://codeforces.com/problemset/problem/2019/B
 */
public class Q1921D {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();

            out.println(solve(n, m, a, b));
        }
        out.close();
    }

    private static long solve(int n, int m, int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        long[] suffSum = new long[n + 1];
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            suffSum[i] = suffSum[i + 1] + Math.abs(a[i] - b[j]);
        }

        long res = suffSum[0], sum = 0;
        for (int i = 0, j = m - 1; i < n; i++, j--) {
            sum = sum + Math.abs(a[i] - b[j]);
            res = Math.max(res, sum + suffSum[i + 1]);
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
                } catch (IOException e) {}
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
