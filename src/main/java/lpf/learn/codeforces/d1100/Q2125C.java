package lpf.learn.codeforces.d1100;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/2125/C
 */
public class Q2125C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            long L = sc.nextLong(), R = sc.nextLong();

            out.println(solve3(R) - solve3(L - 1));
        }
        out.close();
    }

    private static long solve3(long n) {
        int[] ps = new int[]{2, 3, 5, 7};

        long res = 0;
        // 计算 [1, 2^len) 的值，即遍历 ps 中元素的所有组合
        for (int i = 0; i < (1 << ps.length); i++) {
            int mul = 1;
            for (int temp = i; temp > 0; temp &= temp - 1) {
                // 计算 i 的二进制中，为 1 位置对应 ps 值的 乘积
                mul *= ps[Integer.numberOfTrailingZeros(temp)];
            }
            // 计算 符号
            int sign = 1 - (Integer.bitCount(i) % 2) * 2;
            res += (n / mul) * sign;
        }
        return res;
    }

    private static long solve2(long n) {
        int[] ps = new int[]{2, 3, 5, 7};

        long res = 0;
        // 计算 [1, 2^len) 的值，即遍历 ps 中元素的所有组合
        for (int i = 1; i < (1 << ps.length); i++) {
            int mul = 1;
            for (int temp = i; temp > 0; temp &= temp - 1) {
                // 计算 i 的二进制中，为 1 位置对应 ps 值的 乘积
                mul *= ps[Integer.numberOfTrailingZeros(temp)];
            }
            // 计算 符号
            int sign = 1 - ((Integer.bitCount(i) + 1) % 2) * 2;
            res += (n / mul) * sign;
        }
        return n - res;
    }

    private static long solve(long n) {
        if (n == 0) return 0;

        long temp = f(n, 2) + f(n, 3) + f(n, 5) + f(n, 7)
                - f(n, 2 * 3) - f(n, 2 * 5) - f(n, 2 * 7) - f(n, 3 * 5) - f(n, 3 * 7) - f(n, 5 * 7)
                + f(n, 2 * 3 * 5) + f(n, 2 * 3 * 7) + f(n, 3 * 5 * 7) + f(n, 2 * 5 * 7)
                - f(n, 2 * 3 * 5 * 7);
        temp++;
        return n - temp;
    }

    private static long f(long n, long k) {
        return n / k;
    }


}
