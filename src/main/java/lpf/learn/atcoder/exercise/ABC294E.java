package lpf.learn.atcoder.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc294/tasks/abc294_e
 */
public class ABC294E {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        long L = sc.nextLong();
        int n1 = sc.nextInt(), n2 = sc.nextInt();

        long[][] v1 = new long[n1][2];
        long[][] v2 = new long[n2][2];

        for (int i = 0; i < n1; i++) {
            v1[i][0] = sc.nextLong();
            v1[i][1] = sc.nextLong();
        }
        for (int i = 0; i < n2; i++) {
            v2[i][0] = sc.nextLong();
            v2[i][1] = sc.nextLong();
        }

        out.println(solve(L, n1, n2, v1, v2));
        out.flush();
    }

    private static long solve(long L, int n1, int n2, long[][] v1, long[][] v2) {
        long res = 0;
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            long temp = Math.min(v1[i][1], v2[j][1]);

            if (v1[i][0] == v2[j][0]) res += temp;

            v1[i][1] -= temp;
            v2[j][1] -= temp;

            if (v1[i][1] == 0) i++;
            if (v2[j][1] == 0) j++;
        }
        return res;
    }
}
