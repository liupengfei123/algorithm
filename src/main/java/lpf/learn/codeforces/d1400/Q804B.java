package lpf.learn.codeforces.d1400;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q804B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    private final static int MOD = 1_000_000_007;


    public static void main(String[] args) {
        char[] chars = sc.next().toCharArray();
        out.println(solve(chars, chars.length));
        out.close();
    }

    private static int solve(char[] chars, int n) {
        int res = 0, temp = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (chars[i] == 'b') {
                temp = (temp + 1) % MOD;
            } else {
                res = (res + temp) % MOD;
                temp = (temp + temp) % MOD;
            }
        }
        return res;
    }
}
