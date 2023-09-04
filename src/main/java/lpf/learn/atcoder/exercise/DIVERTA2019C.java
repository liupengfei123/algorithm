package lpf.learn.atcoder.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/diverta2019/tasks/diverta2019_c
 */
public class DIVERTA2019C {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) strs[i] = sc.next();


        out.println(solve(n, strs));
        out.flush();
    }

    private static int solve(int n, String[] strs) {
        int res = 0;
        int bothBACnt = 0, aCnt = 0, bCnt = 0;

        for (String str : strs) {
            int sl = str.length();
            char[] chars = str.toCharArray();
            if (chars[0] == 'B' || chars[sl - 1] == 'A') {
                if (chars[0] == 'B' && chars[sl - 1] == 'A') bothBACnt++;
                else if (chars[0] == 'B') bCnt++;
                else aCnt++;
            }
            for (int i = 1; i < sl; i++) {
                if (chars[i - 1] == 'A' && chars[i] == 'B') res++;
            }
        }

        if (bothBACnt == 0) {
            res += Math.min(aCnt, bCnt);
        } else {
            if (aCnt == 0 && bCnt == 0) {
                res += bothBACnt - 1;
            } else {
                res += Math.min(aCnt + bothBACnt, bCnt + bothBACnt);
            }
        }
        return res;
    }
}
