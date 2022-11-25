package lpf.learn.atcoder.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ARC119B {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();

        out.println(run(n, sc.nextLine(), sc.nextLine()));
        out.flush();
    }


    private static long run(int n, String s, String t) {
        int notEqualCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            boolean notEqual = s.charAt(i) != t.charAt(i);

            if ((notEqualCount != 0 || notEqual) && s.charAt(i) == '0') zeroCount++;

            if (notEqual) notEqualCount += (s.charAt(i) == '0' ? 1 : -1);
        }
        return notEqualCount != 0 ? -1 : zeroCount;
    }
}
