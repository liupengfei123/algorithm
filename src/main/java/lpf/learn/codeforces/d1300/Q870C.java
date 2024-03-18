package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/870/C
 */
public class Q870C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            out.println(solve(sc.nextInt()));
        }
        out.close();
    }

    private static int solve(int value) {
        if (value < 4 || value == 5 || value == 7 || value == 11) return -1;
        return (value / 4) - (value % 2);
    }
}
