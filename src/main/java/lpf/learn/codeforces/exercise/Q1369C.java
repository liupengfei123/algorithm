package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *  https://codeforces.com/problemset/problem/1369/C
 */
public class Q1369C {
    public static MyScanner sc = new MyScanner();
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));


    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            Integer[] a = new Integer[n];
            int[] w = new int[k];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < k; i++) w[i] = sc.nextInt();

            out.println(solve(n, k, a, w));

        }
        out.flush();
    }

    private static long solve(int n, int k, Integer[] a, int[] w) {
        Arrays.sort(a);
        Arrays.sort(w);

        int al = 0, ar = n - 1;
        int wl = 0, wr = k - 1;
        long res = 0;

        while (wl <= wr && w[wl] == 1) {
            res += (((long) a[ar--]) << 1);
            wl++;
        }

        for (int i = wr; i >= wl; i--) {
            int c = w[i] - 1;
            res += a[al++];
            al += c - 1;
            res += a[ar--];
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
