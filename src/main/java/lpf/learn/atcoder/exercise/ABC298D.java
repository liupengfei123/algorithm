package lpf.learn.atcoder.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc298/tasks/abc298_d
 */
public class ABC298D {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    private static final long MOD = 998244353;
    private static final long inv10 =  299473306;

    private static final LinkedList<Integer> queue = new LinkedList<>();

    private static long cur = 0;
    private static long pow10 = 1;

    public static void main(String[] args) {
        solve(sc.nextInt());
        out.flush();
    }

    private static void solve(int q) {
        queue.offer(1);
        cur = 1;

        while (q-- > 0) {
            int i = sc.nextInt();
            if (i == 1) {
                int v = sc.nextInt();
                queue.offer(v);
                cur = (cur * 10 + v) % MOD;
                pow10 = (pow10 * 10) % MOD;

            } else if (i == 2) {
                Integer v = queue.poll();
                cur = (cur - v * pow10) % MOD;
                pow10 = (pow10 * inv10) % MOD;
            } else {
                out.println((cur + MOD) % MOD);
            }
        }
    }
}
