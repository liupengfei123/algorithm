package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1032C {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (n == 1) {
            out.println(1);
        } else {
            run(n, a);
        }
        out.close();
    }

    private static void run(int n, int[] a) {
        int[] b = new int[n];
        if (a[1] > a[0]) {
            b[0] = 1;
        } else {
            b[0] = 5;
        }

        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                if (i > 1 && a[i - 1] <= a[i - 2]) {
                    b[i - 1] = 1;
                    if (b[i - 2] == 1)
                        b[i - 1] = 2;
                }
                b[i] = b[i - 1] + 1;
            } else if (a[i] < a[i - 1]) {
                if (i > 1 && a[i - 1] >= a[i - 2]) {
                    b[i - 1] = 5;
                    if (b[i - 2] == 5)
                        b[i - 1] = 4;
                }
                b[i] = b[i - 1] - 1;
            } else {
                b[i] = (b[i - 1] - 1) % 3 + 2;
            }
            if (b[i] < 1 || b[i] > 5) {
                out.println(-1);
                return;
            }
        }
        for (int i : b) {
            out.print(i + " ");
        }
    }
}
