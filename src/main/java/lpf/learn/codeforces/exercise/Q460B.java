package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/460/B
 */
public class Q460B {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        List<Long> res = new ArrayList<>();

        for (int i = 1; i <= 81; i++) {
            long x = b * pow(i, a) + c;

            if (x <= 0 || x >= 1000_000_000) continue;

            long temp = x;
            int bitSum = 0;
            while (temp > 0) {
                bitSum += temp % 10;
                temp /= 10;
            }
            if (bitSum == i) res.add(x);
        }
        out.println(res.size());
        for (Long v : res) out.print(v + " ");
        out.close();
    }


    private static long pow(int base, int a) {
        long res = 1;
        for (int i = 0; i < a; i++) res *= base;
        return res;
    }

}
