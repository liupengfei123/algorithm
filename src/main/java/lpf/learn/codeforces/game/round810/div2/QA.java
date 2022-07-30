package lpf.learn.codeforces.game.round810.div2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class QA {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            run(n);
            System.out.println();
        }
    }

    private static void run(int n) {
        if (n == 1) {
            System.out.print("1");
            return;
        }
        int i;
        if ((n & 1) == 1) {
            System.out.print("2 3 1 ");
            i = 3;
        } else {
            System.out.print("2 1 ");
            i = 2;
        }

        while (i + 2 <= n) {
            System.out.print(i + 2 + " ");
            System.out.print(i + 1 + " ");
            i += 2;
        }
    }
}
