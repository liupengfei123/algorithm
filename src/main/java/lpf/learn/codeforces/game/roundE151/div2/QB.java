package lpf.learn.codeforces.game.roundE151.div2;

import java.io.*;
import java.util.StringTokenizer;

public class QB {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int xa = sc.nextInt(), ya = sc.nextInt();
            int xb = sc.nextInt(), yb = sc.nextInt();
            int xc = sc.nextInt(), yc = sc.nextInt();

            int res = solve(xa, xb, xc) + solve(ya, yb, yc) + 1;
            out.println(res);
        }
        out.flush();
    }

    private static int solve(int a, int b, int c) {
        if (((a - b) ^ (a - c)) < 0) return 0;
        return Math.min(Math.abs(a - b), Math.abs(a - c));
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
