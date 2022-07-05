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

    public static void main(String[] args) throws IOException {
        int mod = 1000000007;
        int n = Integer.parseInt(in.readLine());

        int dV = 1;
        int oV = 0;

        for (int i = 1; i <= n; i++) {
            int ndv = 0;
            ndv = (ndv + oV) % mod;
            ndv = (ndv + oV) % mod;
            ndv = (ndv + oV) % mod;

            int nov = 0;
            nov = (nov + dV) % mod;
            nov = (nov + oV) % mod;
            nov = (nov + oV) % mod;

            dV = ndv;
            oV = nov;
        }
        out.print((dV + mod) % mod);
        out.close();
    }
}
