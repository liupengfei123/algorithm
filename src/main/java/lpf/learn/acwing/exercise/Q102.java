package lpf.learn.acwing.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 100. 增减序列
 */
public class Q102 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] diff = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            diff[i] += value;
            diff[i + 1] -= value;
        }
        diff[n] = 0;
        long c1 = 0, c2 = 0;
        for (int i = 1; i < n; i++) {
            if (diff[i] > 0) c1 += diff[i];
            else c2 += diff[i];
        }
        out.println(Math.max(c1, -c2));
        out.println(Math.abs(c1 + c2) + 1);
        out.flush();
    }
}
