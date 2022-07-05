package lpf.learn.codeforces.dp;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *  https://codeforces.com/problemset/problem/166/E
 */
public class ETetrahedron {
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static int mod = 1000000007;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());

        out.print((run(n) + mod) % mod);
        out.close();
    }

    private static int run(int n) {
        int dV = 1;
        int oV = 0;

        for (int i = 1; i <= n; i++) {
            int nDV = 0;
            nDV = (nDV + oV) % mod;
            nDV = (nDV + oV) % mod;
            nDV = (nDV + oV) % mod;

            int nOV = 0;
            nOV = (nOV + dV) % mod;
            nOV = (nOV + oV) % mod;
            nOV = (nOV + oV) % mod;

            dV = nDV;
            oV = nOV;
        }
        return dV;
    }
}
