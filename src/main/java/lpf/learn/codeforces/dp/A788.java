package lpf.learn.codeforces.dp;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/788/A
 */
public class A788 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(run(n, array));
    }

    private static long run(int n, int[] array) {
        long max1 = 0;
        long sum1 = 0;
        long max2 = 0;
        long sum2 = 0;

        for (int i = 1; i < n; i++) {
            int value = Math.abs(array[i] - array[i - 1]);

            if ((i & 1) == 0) {
                sum1 = Math.max(0, sum1 - value);
                sum2 = Math.max(0, sum2 + value);
            } else {
                sum1 = Math.max(0, sum1 + value);
                sum2 = Math.max(0, sum2 - value);
            }

            max1 = Math.max(max1, sum1);
            max2 = Math.max(max2, sum2);
        }
        return Math.max(max1, max2);
    }
}
