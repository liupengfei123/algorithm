package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1304/D
 */
public class Q1304D {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            char[] chars = sc.next().toCharArray();

            run1(n, chars);
            run2(n, chars);
        }
        out.flush();
    }

    private static void run1(int n, char[] chars) {
        int[] res = new int[n];

        int up = n;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '>') res[i] = up--;
        }

        int down = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (res[i] > 0) continue;

            int k = i;
            while (i >= 0 && res[i] == 0) i--;

            i++;
            for (int j = i; j <= k; j++) res[j] = down++;
        }

        for (int i = 0; i < n; i++) {
            out.print(res[i]);
            out.print(" ");
        }
        out.println();
    }

    private static void run2(int n, char[] chars) {
        int[] res = new int[n];

        int up = 1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '<') res[i] = up++;
        }
        int down = n;
        for (int i = 0; i < n; i++) {
            if (res[i] > 0) continue;

            int k = i;
            while (i < n && res[i] == 0) i++;

            for (int j = k; j < i; j++) res[j] = down--;
        }

        for (int i = 0; i < n; i++) {
            out.print(res[i]);
            out.print(" ");
        }
        out.println();
    }
}
