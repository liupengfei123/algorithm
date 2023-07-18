package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q191A {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();

        // dp[i][j] 以 i 开头 j 结尾的字符串子序列的最长长度
        int[][] dp = new int[26][26];

        for (int z = 0; z < n; z++) {
            String s = sc.next();
            int i = s.charAt(0) - 'a';
            int j = s.charAt(s.length() - 1) - 'a';

            for (int k = 0; k < 26; k++) {
                if (dp[k][i] == 0) continue;
                dp[k][j] = Math.max(dp[k][j], dp[k][i] + s.length());
            }
            dp[i][j] = Math.max(dp[i][j], s.length());
        }

        int res = 0;
        for (int i = 0; i < 26; i++) res = Math.max(res, dp[i][i]);
        out.println(res);
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
