package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 *  https://codeforces.com/contest/991/problem/D
 */
public class Q991D {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static final int[][] shapes = new int[][]{{3, 2},{3, 1},{1, 3},{2, 3}};

    public static void main(String[] args) {
        char[][] chars = new char[2][];
        chars[0] = sc.nextLine().toCharArray();
        chars[1] = sc.nextLine().toCharArray();

        out.println(solve2(chars));
        out.flush();
    }

    private static long solve2(char[][] chars) {
        int n = chars[0].length;

        int[] f = new int[]{-1, -1, -1, 0};

        for (int i = 0; i < n; i++) {
            int cur = (chars[0][i] == 'X' ? 1 : 0) | (chars[1][i] == 'X' ? 2 : 0);
            int[] nf = new int[]{-1, -1, -1, -1};
            nf[cur] = Math.max(f[0], Math.max(f[1], Math.max(f[2], f[3])));
            for (int[] p : shapes) {
                for (int pre = 0; pre < 4; pre++) {
                    if ((cur & p[1]) == 0 && ((pre & p[0]) == 0)) {
                        nf[cur | p[1]] = Math.max(nf[cur | p[1]], f[pre] + 1);
                    }
                }
            }
            f = nf;
        }

        return Math.max(f[0], Math.max(f[1], Math.max(f[2], f[3])));
    }


    private static long solve(char[][] chars) {
        int n = chars[0].length, res = 0;

        for (int i = 0; i < n - 1; i++) {
            if (chars[0][i] == 'X' && chars[1][i] == 'X') continue;

            if (chars[0][i] == '0' && chars[1][i] == '0') {
                if (chars[0][i + 1] == '0') {
                    res++;
                    chars[0][i + 1] = 'X';
                } else if (chars[1][i + 1] == '0') {
                    res++;
                    chars[1][i + 1] = 'X';
                }
                continue;
            }
            if (chars[0][i + 1] == '0' && chars[1][i + 1] == '0') {
                res++;
                i++;
            }
        }
        return res;
    }
}
