package lpf.learn.codeforces.d1200;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1354/B
 */
public class Q1354B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            out.println(solve2(sc.next().toCharArray()));
        }
        out.close();
    }


    private static int solve2(char[] c) {
        int n = c.length;
        int[] cnt = new int[3];

        int res = Integer.MAX_VALUE;
        for (int i = 0, j = 0; i < n; i++) {
            cnt[c[i] - '1']++;

            while (cnt[0] > 0 && cnt[1] > 0 && cnt[2] > 0) {
                res = Math.min(res, i - j + 1);
                cnt[c[j++] - '1']--;
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }

    private static int solve(char[] chars) {
        int n = chars.length;
        int[] index = new int[3];
        Arrays.fill(index, -1);

        int[][] a = new int[n][3];
        for (int i = n - 1; i >= 0; i--) {
            System.arraycopy(index, 0, a[i], 0, 3);

            index[chars[i] - '1'] = i;
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            boolean f = true;
            for (int j = 0; j < 3; j++) {
                if (chars[i] - '1' == j) continue;

                if (a[i][j] < 0) {
                    f = false;
                    break;
                }
                temp = Math.max(temp, a[i][j] - i + 1);
            }
            if (f) res = res == 0 ? temp : Math.min(res, temp);
        }
        return res;
    }
}
