package lpf.learn.codeforces.game.round884.div2;

import java.io.*;
import java.util.*;

public class QD {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            out.println(new String(solve(n)));
        }
        out.flush();
    }

    private static char[] solve(int n) {
        int a = 1;
        for (; a <= n; a++) if (n % a != 0) break;
        char[] res = new char[n];
        for (int i = 0; i < n; i++) res[i] = (char) ('a' + (i % a));
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
