package lpf.learn.codeforces.game.roundE151.div2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class QC {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static int[][] indexs;
    private static Boolean[][] dp;

    private static char[] lower, upper;

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            char[] s = sc.next().toCharArray();
            int m = sc.nextInt();
            lower = sc.next().toCharArray();
            upper = sc.next().toCharArray();

            int n = s.length;
            // 记录从 i 开始 第一个出现字符的索引
            indexs = new int[n + 1][10];
            Arrays.fill(indexs[n], -1);
            dp = new Boolean[n + 1][10];

            out.println(solve(n, s) ? "YES" : "NO");
        }
        out.flush();
    }

    private static boolean solve(int n, char[] s) {
        for (int i = n - 1; i >= 0; i--) {
            System.arraycopy(indexs[i + 1], 0, indexs[i], 0, 10);
            indexs[i][s[i] - '0'] = i + 1;
        }
        return dfs(0, 0);
    }

    private static boolean dfs(int i, int j) {
        if (j >= lower.length) return false;

        if (dp[i][j] != null) return dp[i][j];

        int l = lower[j] - '0', r = upper[j] - '0';
        boolean res = false;
        for (int k = l; k <= r; k++) {
            if (indexs[i][k] == -1 || dfs(indexs[i][k], j + 1)) {
                res = true;
                break;
            }
        }
        return dp[i][j] = res;
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
