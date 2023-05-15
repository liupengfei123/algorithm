package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;


public class Q1714E {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            out.println(run(n) ? "Yes" : "No");
        }
        out.close();
    }

    private static boolean run(int n) {
        int z = -1, m = 0;

        while (n-- > 0) {
            int v = sc.nextInt();
            if (v % 5 == 0) {
                v = v + v % 10;
                if (z == -1) {
                    z = v;
                } else if (z != v) {
                    z = -2;
                }
            } else {
                m |= 1 << (v % 20);
            }
        }
        return m > 0 ? z == -1 && ((m & 729366) == 0 || (m & 729366) == m) : z != -2;
    }
}
