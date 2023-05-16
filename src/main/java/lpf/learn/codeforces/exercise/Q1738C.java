package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class Q1738C {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static boolean[][] FLAGS = new boolean[][]{{true, true},{false, true},{false, false},{true, true}};

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            out.println(run(n) ? "Alice" : "Bob");
        }
        out.close();
    }

    private static boolean run(int n) {
        int odd = 0, even = 0;
        for (int i = 0; i < n; i++) {
            if ((sc.nextInt() & 1) == 1) odd++;
            else even++;
        }
        return FLAGS[odd % 4][even % 2];
    }
}
