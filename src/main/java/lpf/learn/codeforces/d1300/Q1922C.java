package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1922/C
 */
public class Q1922C {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            solve(n, a);
        }
        out.close();
    }

    private static void solve(int n, int[] a) {
        int[] dict1 = new int[n];
        dict1[1] = 1;
        for (int i = 2; i < n; i++) {
            dict1[i] = a[i] - a[i - 1] > a[i - 1] - a[i - 2] ? a[i] - a[i - 1] : 1;
            dict1[i] += dict1[i - 1];
        }

        int[] dict2 = new int[n];
        dict2[n - 2] = 1;
        for (int i = n - 3; i >= 0; i--) {
            dict2[i] = a[i + 1] - a[i] > a[i + 2] - a[i + 1] ? a[i + 1] - a[i] : 1;
            dict2[i] += dict2[i + 1];
        }

        int m = sc.nextInt();
        while (m-- > 0) {
            int i = sc.nextInt() - 1, j = sc.nextInt() - 1;

            int[] res = i > j ? dict2 : dict1;
            out.println(res[j] - res[i]);
        }
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
                } catch (IOException ignore) {}
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
