package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

public class Q1837D {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            solve(n, s);
        }
        out.close();
    }


    private static void solve(int n, String m) {
        char[] chars = m.toCharArray();
        int[] ans = new int[n];
        int cnt = 0, k = 0;
        for (int i = 0, lst = cnt; i < n; i++, lst = cnt) {
            if (chars[i] == chars[0]) cnt++;
            else cnt--;

            if (lst + cnt > 0) ans[i] = 1;
            else ans[i] = 2;

            k = Math.max(k, ans[i]);
        }
        if (cnt != 0) {
            out.println(-1);
            return;
        }
        out.println(k);
        for (int i = 0; i < n; i++) out.print(ans[i] + " ");
        out.println();
    }

    private static void solve2(int n, String m) {
        char[] chars = m.toCharArray();
        int c = 0;
        for (int i = 0; i < n; i++) if (chars[i] == ')') c++;
        if (c << 1 != n) {
            out.println(-1);
            return;
        }
        int[] ans = new int[n];

        int lc = 0, rc = 0;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] == ')') {
                if (lc > 0) {
                    ans[i] = 1;
                    lc--;
                } else {
                    ans[i] = 2;
                    rc++;
                }
            } else {
                if (rc > 0) {
                    ans[i] = 2;
                    rc--;
                } else {
                    ans[i] = 1;
                    lc++;
                }
            }
            flag |= ans[i];
        }
        if (flag == 3) {
            out.println(2);
        } else {
            out.println(1);
            Arrays.fill(ans, 1);
        }
        for (int i = 0; i < n; i++) out.print(ans[i] + " ");
        out.println();
    }
}
