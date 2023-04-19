package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1344/A
 */
public class Q1344A {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) array[j] = sc.nextInt() % n;

            out.println(run(n, array));
        }
        out.close();
    }

    private static String run(int n, int[] array) {
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            int value = (array[i] + i + n) % n;

            if (check[value]) return "No";

            check[value] = true;
        }
        return "Yes";
    }
}
