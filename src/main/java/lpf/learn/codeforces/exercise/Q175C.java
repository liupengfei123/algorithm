package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q175C {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] array = new int[n][2];

        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }

        int t = sc.nextInt();
        long[] p = new long[t + 2];
        for (int i = 1; i <= t; i++) {
            p[i] = sc.nextLong();
        }
        p[0] = 0;
        p[t + 1] = Long.MAX_VALUE;

        out.println(run(n, array, p));
        out.close();
    }

    private static long run(int n, int[][] array, long[] p) {
        Arrays.sort(array, Comparator.comparing(a -> a[1]));

        long result = 0;
        int pi = 1;
        long count = 0;
        for (int i = 0; i < n; i++) {
            long useCount;

            if (count + array[i][0] > p[pi]) {
                useCount = p[pi] - count;
                array[i][0] -= useCount;
                result += useCount * array[i][1] * pi;
                i--;
                pi++;
            } else {
                useCount = array[i][0];
                result += useCount * array[i][1] * pi;
            }
            count += useCount;
        }
        return result;
    }
}
