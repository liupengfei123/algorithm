package lpf.learn.codeforces.d1400;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1833D {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            solve(n, a);

        }
        out.close();
    }


    private static void solve(int n, int[] a) {
        int t = a[0] == n ? n - 1 : n;
        int r = 0;
        while (r < n && a[r] != t) r++;
        r = r == n - 1 ? r : r - 1;

        int ai = 0;
        int[] ans = new int[n];

        for (int i = r + 1; i < n; i++) ans[ai++] = a[i];
        ans[ai++] = a[r];

        for (int i = r - 1; i >= 0; i--) {
            if (a[i] >= a[0]) {
                ans[ai++] = a[i];
            } else {
                for (int j = 0; j <= i; j++) ans[ai++] = a[j];
                break;
            }
        }
        for (int v : ans) out.print(v + " ");
        out.println();
    }

}
