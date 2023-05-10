package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

public class Q1118D2 {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = sc.nextInt();

        out.println(run(n, m, array));
        out.flush();
    }

    private static int run(int n, int m, int[] array) {
        long sum = 0;
        for (int i : array) sum += i;

        if (sum < m) return -1;

        Arrays.sort(array);

        int l = 1, r = n;

        while (l < r) {
            int mid = (r + l) >> 1;
            if (check(mid, n, m, array)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private static boolean check(int x, int n, int m, int[] array) {
        int temp = -1;
        long sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            if ((n - i - 1) % x == 0) temp++;

            if (array[i] - temp <= 0) break;

            sum += array[i] - temp;
        }
        return sum >= m;
    }
}
