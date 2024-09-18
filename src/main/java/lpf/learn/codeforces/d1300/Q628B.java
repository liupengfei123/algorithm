package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/628/B
 */
public class Q628B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        char[] chars = sc.next().toCharArray();
        int n = chars.length;

        long res = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] % 4 == 0) {
                res++;
            }
            if (i > 0 && (chars[i - 1] * 2 + chars[i]) % 4 == 0) {
                res += i;
            }
        }
        out.println(res);
        out.close();
    }
}
