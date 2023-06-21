package lpf.learn.codeforces.game.round881.div3;

import java.io.*;
import java.util.*;

public class QA {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            out.println(run(n, a));
        }
        out.flush();
    }

    private static int run(int n, int[] a) {
        Arrays.sort(a);
        int l = 0, r = n - 1;

        int res = 0;
        while (l < r) res += a[r--] - a[l++];
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
