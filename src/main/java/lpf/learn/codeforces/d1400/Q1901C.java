package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1901/C
 */
public class Q1901C {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            List<Integer> res = solve(n, a);
            out.println(res.size());
            if (res.size() <= n) {
                for (Integer i : res) out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }

    private static List<Integer> solve(int n, int[] a) {
        List<Integer> res = new ArrayList<>(32);

        int min = Integer.MAX_VALUE, max = 0;
        for (int i : a) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        while (max != min) {
            int v = (min & 1) != 0 && (max & 1) == 0 ? 1 : 0;
            res.add(v);
            max = (max + v) >> 1;
            min = (min + v) >> 1;
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
