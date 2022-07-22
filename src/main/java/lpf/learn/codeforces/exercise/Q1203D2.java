package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1203D2 {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        while (sc.hasNext()) {
            String s = sc.next();
            String t = sc.next();
            out.println(run(s, t));
        }
        out.close();
    }

    private static int run(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        int[] dp1 = new int[tl + 1];
        int[] dp2 = new int[tl + 1];

        for (int i = 0, j = 0; i < tl; i++) {
            while (s.charAt(j) != t.charAt(i)) j++;
            dp1[i + 1] = j++;
        }
        for (int i = tl - 1, j = sl - 1; i >= 0; i--) {
            while (s.charAt(j) != t.charAt(i)) j--;
            dp2[i + 1] = j--;
        }

        int result = Math.max(sl - dp1[tl] - 1, dp2[1] - dp1[0]);
        for (int i = 1; i < tl; i++) {
            result = Math.max(result, dp2[i + 1] - dp1[i] - 1);
        }
        return result;
    }
}
