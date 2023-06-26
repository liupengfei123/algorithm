package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

public class Q987C {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));


    public static void main(String[] args) {
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int[] b = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) dp[i] = b[i] = sc.nextInt();


        for (int i = 1; i < 3; i++) {
            int[] ndp = new int[n];
            Arrays.fill(ndp, Integer.MAX_VALUE >> 1);

            for (int j = i; j < n; j++) {
                for (int z = 0; z < j; z++) {
                    if (a[z] < a[j]) ndp[j] = Math.min(ndp[j], dp[z] + b[j]);
                }
            }
            dp = ndp;
        }

        int res = (Integer.MAX_VALUE >> 1);
        for (int i = 0; i < n; i++) res = Math.min(res, dp[i]);

        out.println(res >= (Integer.MAX_VALUE >> 1) ? -1 : res);
        out.close();
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
