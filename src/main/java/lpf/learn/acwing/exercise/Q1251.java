package lpf.learn.acwing.exercise;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 1249. 亲戚
 */
public class Q1251 {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static int[] p;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        p = new int[n + 1];
        Arrays.setAll(p, i -> i);

        while (m-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            p[find(a)] = find(b);
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            int c = sc.nextInt();
            int d = sc.nextInt();

            out.println(find(c) == find(d) ? "Yes" : "No");
        }
        out.flush();
    }

    private static int find(int x) {
        if (p[x] != x) p[x] = find(x);
        return p[x];
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
