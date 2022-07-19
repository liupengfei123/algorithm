package lpf.learn.codeforces.game.round809.div2;

import java.util.Scanner;

public class QA {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = sc.nextInt();
            }
            run(m, array);
        }
    }

    private static void run(int m, int[] array) {
        boolean[] bp = new boolean[m];

        for (int i : array) {
            int value = Math.min(i, m + 1 - i);
            if (!bp[value - 1]) {
                bp[value - 1] = true;
            } else {
                bp[Math.max(i, m + 1 - i) - 1] = true;
            }
        }
        for (boolean b : bp) {
            System.out.print(b ? "A" : "B");
        }
        System.out.println();
    }
}
