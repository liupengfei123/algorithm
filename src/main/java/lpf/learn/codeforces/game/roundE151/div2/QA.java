package lpf.learn.codeforces.game.roundE151.div2;

import java.io.*;
import java.util.*;

public class QA {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt(), x = sc.nextInt();

            if (x == 1 && k == 1) {
                out.println("NO");
                continue;
            }
            if (x == 1 && k == 2 && (n & 1) != 0) {
                out.println("NO");
                continue;
            }
            out.println("YES");
            if (x == 1 && k >= 2) {
                out.println(n / 2);
                for (int i = 1; i < n / 2; i++) out.print(2 + " ");
                out.print(((n & 1) != 0 ? 3 : 2) + " ");
            } else {
                out.println(n);
                for (int i = 0; i < n; i++) out.print(1 + " ");
            }
            out.println();
        }
        out.flush();
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
