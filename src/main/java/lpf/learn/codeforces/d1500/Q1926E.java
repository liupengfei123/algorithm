package lpf.learn.codeforces.d1500;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1926E {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            out.println(solve(n, k));
        }
        out.close();
    }

    private static int solve(int n, int k) {
        int res = 0;

        for (int c = 1; k > 0; c++) {
            int temp = n >> c, flag = 1 << (c - 1);

            if ((n & flag) != 0) temp++;

            if (k <= temp) {
                res = ((k - 1) << c) | flag;
            }
            k -= temp;
        }
        return res;
    }
}
