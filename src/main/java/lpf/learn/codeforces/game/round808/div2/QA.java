package lpf.learn.codeforces.game.round808.div2;

import java.util.Scanner;

public class QA {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = sc.nextInt();
            }
            System.out.println(run(n, array) ? "YES" : "NO");
        }
    }


    private static boolean run(int n, int[] array) {
        for (int i = 1; i < n; i++) {
            if (array[i] % array[0] != 0) return false;
        }
        return true;
    }
}
