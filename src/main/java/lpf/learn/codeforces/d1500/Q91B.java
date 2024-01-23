package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q91B {
    private final static Scanner sc = new Scanner(new BufferedInputStream(System.in));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int[] res = solve(n, a);

        for (int i = 0; i < n; i++) out.print(res[i] + " ");
        out.println();
        out.close();
    }
    private static int[] solve(int n, int[] a) {
        Integer[] stack = new Integer[n];
        int index = -1;

        for (int i = n - 1; i >= 0; i--) {
            if (index == -1 || a[stack[index]] > a[i]) stack[++index] = i;
        }

        int[] res = new int[n];
        Arrays.fill(res, -1);

        for (int i = 0; i < n; i++) {
            if (a[stack[index]] >= a[i]) continue;

            int v = Arrays.binarySearch(stack, 0, index + 1, i, Comparator.comparing((Integer k) -> a[k]).reversed());
            if (v >= 0 && stack[v] != i) v++;
            if (v < 0) v = -v - 1;
            res[i] = Math.max(stack[v] - i - 1, -1);
        }
        return res;
    }
}
