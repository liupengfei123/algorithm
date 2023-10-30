package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/26/B
 */
public class Q26B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        char[] line = sc.next().toCharArray();
        int i = 0, res = 0;
        for (char c : line) {
            if (c == '(') {
                i = Math.max(0, i);
                i++;
            } else {
                if (i > 0) res += 2;
                i--;
            }
        }
        out.println(res);
        out.close();
    }
}
