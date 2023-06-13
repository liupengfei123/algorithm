package lpf.learn.acwing.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 89. a^b
 */
public class Q91 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        out.println(run(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        out.flush();
    }

    private static long run(long a, int b, int p) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % p;
            }
            a = (a * a) % p;
            b >>= 1;
        }
        return ((res % p) + p) % p;
    }
}
