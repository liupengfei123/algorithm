package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

public class Q1790E {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc.nextInt());
        }
        out.close();
    }

    private static void solve(int x) {
        int a = x, b = 0;
        for (int i = 29; i >= 0; i--) {
            if ((x & (1 << i)) != 0) continue;

            if ((x << 1) - a - b >= 2 << i) {
                a += 1 << i;
                b += 1 << i;
            }
        }
        if (a + b == x << 1 && (a ^ b) == x) {
            out.println(a + " " + b);
        } else {
            out.println(-1);
        }
    }
}
