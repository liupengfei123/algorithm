package lpf.learn.codeforces.game.round881.div3;

import java.io.*;
import java.util.StringTokenizer;

public class QB {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            run(n, a);
        }
        out.flush();
    }

    private static void run(int n, int[] a) {
        long sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) sum += Math.abs(a[i]);

        int l = 0;
        while (l < n) {
            while (l < n && a[l] >= 0) l++;

            if (l == n) continue;

            count++;

            while (l < n && a[l] <= 0) l++;
        }
        out.println(sum + " " + count);
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
