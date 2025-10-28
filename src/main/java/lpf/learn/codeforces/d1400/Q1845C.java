package lpf.learn.codeforces.d1400;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * https://codeforces.com/problemset/problem/1845/C
 *
 * @see lpf.learn.codeforces.game.roundE151.div2.QC
 */
public class Q1845C {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            char[] s = sc.next().toCharArray();
            int m = sc.nextInt();
            char[] l = sc.next().toCharArray(), r = sc.next().toCharArray();

            out.println(solve(s, m, l, r) ? "YES" : "NO");
        }
        out.close();
    }

    /**
    预处理 s 的 子序列自动机 nxt。
    密码的第一个数字，在 s 中的位置越靠右越好。利用 nxt 可以快速求出。设这个下标为 cur。
    密码的第二个数字，从 cur+1 往右看，在 s 中的位置越靠右越好。做法同理。求出后，更新 cur。
    如果 cur >= n，那么密码可以不是 s 的子序列。
     */
    private static boolean solve(char[] s, int m, char[] l, char[] r) {
        int[] temp = new int[10];
        Arrays.fill(temp, s.length + 10);

        int[][] nextChar = new int[s.length + 1][10];

        for (int i = s.length; i > 0; i--) {
            System.arraycopy(temp, 0, nextChar[i], 0, 10);

            temp[s[i - 1] - '0'] = i;
        }
        nextChar[0] = temp;

        int cur = 0;

        for (int i = 0; i < m; i++) {
            if (cur > s.length) break;

            int ncur = cur;
            for (int j = l[i]; j <= r[i]; j++) {
                int v = j - '0';
                ncur = Math.max(ncur, nextChar[cur][v]);
            }
            cur = ncur;
        }

        return cur > s.length;
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
