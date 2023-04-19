package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://codeforces.com/problemset/problem/1344/A
 */
public class Q1344A {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) array[j] = sc.nextInt() % n;

            out.println(run(n, array));
        }

        out.close();
    }

    private static String run(int n, int[] array) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int v = (array[i] + i + n) % n;

            if (set.contains(v)) return "No";

            set.add(v);
        }
        return "Yes";
    }
}
