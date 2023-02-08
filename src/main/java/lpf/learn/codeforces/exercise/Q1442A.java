package lpf.learn.codeforces.exercise;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://codeforces.com/contest/1442/problem/A
 */
public class Q1442A {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) array[i ] = sc.nextInt();

            out.println(run(n, array) ? "YES" : "NO");
        }
        out.close();
    }

    private static boolean run(int n, int[] array) {
        int min = array[0], rem = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] <= min && rem == 0) {
                min = array[i];
                continue;
            }
            min = Math.min(min, array[i] - rem);
            rem = Math.max(rem, array[i] - min);

            if (rem > array[i]) return false;
        }
        return true;
    }

}
