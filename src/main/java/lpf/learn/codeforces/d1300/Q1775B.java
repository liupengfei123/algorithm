package lpf.learn.codeforces.d1300;


import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1775/B
 */
public class Q1775B {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            out.println(solve(sc.nextInt()) ? "YES" : "NO");
        }
        out.close();
    }

    private static boolean solve(int n) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int[][] a = new int[n][];

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            a[i] = new int[k];
            for (int j = 0; j < k; j++) {
                a[i][j] = sc.nextInt();
                cnt.merge(a[i][j], 1, Integer::sum);
            }
        }
        out:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (cnt.get(a[i][j]) == 1) {
                    continue out;
                }
            }
            return true;
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
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
