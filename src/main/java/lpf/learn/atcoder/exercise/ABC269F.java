package lpf.learn.atcoder.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ABC269F {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private final static int MOD = 998244353;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();

            long value = (run(m, r1, r2, c1, c2) + run(m, r1 + 1, r2, c1, c2)) % MOD;
            out.println(value);
        }
        out.flush();
    }

    private static int run(long m, int r1, int r2, int c1, int c2) {
        if (r1 > r2 || (c1 == c2 && ((c1 + r1) & 1) == 1)) return 0;

        long res;
        long cn = c2 - c1 + 1, temp = (r1 - 1) * m + c1;

        if (((c1 + r1) & 1) == 1) {
            temp++;
        } else if ((cn & 1) == 1) {
            cn++;
        }
        temp %= MOD;
        cn = cn >> 1;
        res = ((temp * cn) % MOD + (cn * (cn - 1)) % MOD) % MOD;

        long rn = (r2 - r1 + 2) >> 1;
        res = ((res * rn) % MOD + (((rn * (rn - 1)) % MOD * m) % MOD * cn) % MOD) % MOD;
        return (int) ((res) % MOD);
    }
}

