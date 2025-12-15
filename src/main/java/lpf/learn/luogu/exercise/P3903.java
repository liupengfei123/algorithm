package lpf.learn.luogu.exercise;

import java.io.*;
import java.util.*;

/**
 * https://www.luogu.com.cn/problem/P3903
 */
public class P3903 {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        out.println(solve(n, a));
        out.close();
    }

    private static int solve(int n, int[] a) {
        int res = 1, last = a[0];;
        boolean flag = true;

        for (int i : a) {
            if (flag ? last > i : last < i) {
                flag = !flag;
                res++;
            }
            last = i;
        }
        return res;
    }

}
