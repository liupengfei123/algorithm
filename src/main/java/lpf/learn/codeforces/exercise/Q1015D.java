package lpf.learn.codeforces.exercise;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1015/D
 */
public class Q1015D {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long s = sc.nextLong();
        if (!canSuccess(n, k, s)) {
            System.out.println("no");
            return;
        }

        System.out.println("yes");
        run(n, k, s, 1);
        System.out.println();
    }

    private static void run(int n, long k, long s, int index) {

        while (canSuccess(n, k - 1, s - n + 1) && k > 0) {
            index = nextIndex(n ,index, n - 1);
            System.out.print(index + " ");
            s = s - n + 1;
            k--;
        }
        if (k < 1) {
            return;
        }

        index = nextIndex(n ,index, (int) (s - k + 1));
        System.out.print(index + " ");

        for (long l = k - 1; l > 0; l--) {
            index = nextIndex(n ,index, 1);
            System.out.print(index + " ");
        }
    }

    private static int nextIndex(int n, int index, int step) {
        if (index + step > n) {
            return index - step;
        } else {
            return index + step;
        }
    }

    private static boolean canSuccess(int n, long k, long s) {
        return k<=s && s<=(n - 1) * k;
    }
}
