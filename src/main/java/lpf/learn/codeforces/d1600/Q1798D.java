package lpf.learn.codeforces.d1600;

import java.io.*;
import java.util.*;

public class Q1798D {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            solve(n, a);
        }
        out.close();
    }

    private static void solve(int n, int[] a) {
        Arrays.sort(a);

        if (a[0] == a[n - 1]) {
            out.println("No");
            return;
        }

        int[] res = new int[n];

        int sum = 0;
        for (int i = 0, l = 0, r = n - 1; i < n; i++) {
            if (sum < 0) {
                res[i] = a[r--];
            } else {
                res[i] = a[l++];
            }
            sum += res[i];
        }

        out.println("Yes");
        for (int i = 0; i < n; i++) out.print(res[i] + " ");
        out.println();
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
