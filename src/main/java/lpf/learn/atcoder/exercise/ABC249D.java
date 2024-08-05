package lpf.learn.atcoder.exercise;


import java.io.*;
import java.util.*;

public class ABC249D {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        out.println(solve(n, a));
        out.close();
    }

    private static long solve(int n, int[] a) {
        int max = 20_0000;

        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) count[a[i]]++;

        long res = 0;
        for (int i = 1; i <= max; i++) {
            for (int j = 1; i * j <= max; j++) {
                res += (long) count[i] * count[j] * count[i * j];
            }
        }
        return res;
    }
}

