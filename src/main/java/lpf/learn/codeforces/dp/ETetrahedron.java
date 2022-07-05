package lpf.learn.codeforces.dp;

import java.util.Scanner;

/**
 *  https://codeforces.com/problemset/problem/166/E
 */
public class ETetrahedron {
    public static Scanner sc = new Scanner(System.in);
    public static int mod = 1000000007;

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println((run(n) + mod) % mod);
    }

    private static int run(int n) {
        long dV = 1;
        long oV = 0;

        for (int i = 1; i <= n; i++) {
            long nDV = (oV * 3) % mod;
            long nOV = (dV + oV * 2) % mod;

            dV = nDV;
            oV = nOV;
        }
        return (int) dV;
    }
}
