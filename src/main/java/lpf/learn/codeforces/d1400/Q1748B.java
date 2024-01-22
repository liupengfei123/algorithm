package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1748/B
 */
public class Q1748B {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            out.println(solve(sc.nextInt(), sc.next().toCharArray()));
        }
        out.close();
    }

    private static long solve(int n, char[] s) {
        long res = 0;
        for (int i = 0; i < n; i++) {
            int[] cnt = new int[10];
            int c = 0, mv = 0;
            for (int j = i; j < n; j++) {
                int v = s[j] - '0';
                if (cnt[v] == 0) c++;

                mv = Math.max(mv, ++cnt[v]);
                if (mv > 10) break;
                if (mv <= c) res++;
            }
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
