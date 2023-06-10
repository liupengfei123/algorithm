package lpf.learn.codeforces.game.round878.div2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class QD {
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
        int l = 0,  r = a[n - 1] - a[0];

        while (l < r) {
            int mid = (r + l) / 2;
            if (check(n, a, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private static boolean check(int n, int[] a, int t) {
        int i = 0;
        for (int k = 0; k < 3 && i < n; k++) {
            int temp = a[i] + t;
            while (i < n && Math.abs(a[i] - temp) <= t) i++;
        }
        return i == n;
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
