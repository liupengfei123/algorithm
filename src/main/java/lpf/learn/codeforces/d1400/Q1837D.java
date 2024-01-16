package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1837/D
 */
public class Q1837D {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc.nextInt(), sc.next().toCharArray());
        }
        out.close();
    }

    private static void solve(int n, char[] chars) {
        int cnt = 0;
        for (char aChar : chars) cnt += aChar == '(' ? 1 : -1;
        if (cnt != 0) {
            out.println(-1);
            return;
        }

        int[] value = new int[n];
        Arrays.fill(value, 2);

        for (int i = 0; i < n; i++) {
            if (chars[i] == '(') {
                if (cnt >= 0) value[i] = 1;
                cnt++;
            } else {
                if (cnt > 0) value[i] = 1;
                cnt--;
            }
        }

        int temp = 0;
        for (int i = 0; i < n; i++) temp |= value[i];

        if (temp == 3) {
            out.println(2);
            for (int i = 0; i < n; i++) out.print(value[i] + " ");
        } else {
            out.println(1);
            for (int i = 0; i < n; i++) out.print("1 ");
        }
        out.println();
    }


    private static void solve2(int n, char[] chars) {
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

}
