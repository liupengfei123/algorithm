package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

public class Q1838C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            solve(n, m);
            out.println();
        }
        out.close();
    }

    private static void solve(int n, int m) {
        for (int i = 1; i < n; i += 2) {
            int val = i * m + 1;
            for (int j = 0; j < m; j++, val++) out.print(val + " ");
            out.println();
        }
        for (int i = 0; i < n; i += 2) {
            int val = i * m + 1;
            for (int j = 0; j < m; j++, val++) out.print(val + " ");
            out.println();
        }
    }
}
