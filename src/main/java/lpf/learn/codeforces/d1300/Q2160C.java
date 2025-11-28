package lpf.learn.codeforces.d1300;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/870/C
 */
public class Q2160C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            out.println(solve(sc.nextInt()) ? "YES" : "NO");
        }
        out.close();
    }

    private static boolean solve(int n) {
        if (n > 0) {
            n /= (n & -n); //计算 n /= lowbit(n)，可以去掉 n 的尾零。
        }
        int m = 32 - Integer.numberOfLeadingZeros(n);
        if (m % 2 > 0 && (1 & (n >> (m / 2))) > 0) {//长度为奇数，正中间需要为0
            return false;
        }
        int rev = Integer.reverse(n) >>> Integer.numberOfLeadingZeros(n);
        return n == rev;
    }
}
