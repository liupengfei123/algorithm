package lpf.learn.codeforces.d1400;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Q1989C {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[2][n];

            for (int i = 0; i < n; i++) arr[0][i] = sc.nextInt();
            for (int i = 0; i < n; i++) arr[1][i] = sc.nextInt();

            out.println(solve(n, arr));
        }
        out.close();
    }


    private static int solve(int n, int[][] arr) {
        int s1 = 0, s2 = 0, dec = 0, inc = 0;
        for (int i = 0; i < n; i++) {
            int v1 = arr[0][i], v2 = arr[1][i];

            if (v1 == -1 && v2 == -1) dec++;
            else if (v1 == 1 && v2 == 1) inc++;
            else {
                if (v1 > v2) s1 += v1;
                else s2 += v2;
            }
        }
        int max = Math.max(s1, s2), min = Math.min(s1, s2);

        if (max - dec >= min + inc) return min + inc;

        return (max + min - dec + inc) >> 1;
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
