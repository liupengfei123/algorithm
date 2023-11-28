package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1443/C
 */
public class Q1009B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        out.println(solve(sc.next()));
        out.close();
    }

    private static String solve(String line) {
        int len = line.length();
        line = line.replaceAll("1*", "");

        int cnt = len - line.length();
        StringBuilder oneStr = new StringBuilder(cnt);
        for (int i = 0; i < cnt; i++) oneStr.append('1');

        int i = line.indexOf('2');
        return i < 0 ? line + oneStr : line.substring(0, i) + oneStr + line.substring(i);
    }
}
