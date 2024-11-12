package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q204A {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        long L = sc.nextLong(), R = sc.nextLong();

        out.println(solve2(R) - solve2(L - 1));
        out.close();
    }


    private static long solve2(long value) {
        if (value < 10) return value;

        long last = value % 10;
        long first = value;
        for (; first > 9 ; first /= 10);

        long res = 9 + value / 10;

        if (first > last) res--;
        return res;
    }


    private static long solve(long value) {
        if (value < 10) return value + 1;

        int bit = 0;
        for (long temp = value; temp > 0 ; temp /= 10) bit++;

        long res = 10;
        for (int i = 2; i < bit; i++) {
            res += 9L * power(10, i - 2);
        }

        long base = power(10, bit - 1);
        long first = value / base, last = value % 10;

        res += (first - 1) * (base / 10);
        res += (value - first * base) / 10;

        if (first <= last) res++;

        return res;
    }


    // 快速幂算法
    private static long power(long base, int exponent) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {  // 如果指数是奇数
                result *= base;
            }
            base *= base;  // 每次将底数平方
            exponent /= 2;  // 将指数减半
        }
        return result;
    }
}
