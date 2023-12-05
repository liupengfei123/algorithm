package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q1236B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private final static int MOD = 1000_000_007;


    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();

        out.println(pow(pow(2, m) - 1, n));
        out.close();
    }

    public static long pow(long x, int a) {
        long res = 1;
        while (a > 0) {
            if ((a & 1) == 1) {
                res = (res * x) % MOD;
            }
            x = (x * x) % MOD;
            a >>= 1;
        }
        return res;
    }
}
