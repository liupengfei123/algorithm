package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1156B {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            char[] chars = sc.next().toCharArray();
            out.println(run(chars));
        }

        out.close();
    }

    private static String run(char[] chars) {
        int[] count = new int[26];
        for (char aChar : chars) count[aChar - 'a']++;

        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        for (int i = 0; i < 26; i += 2) {
            while (count[i]-- != 0) x.append((char) (i + 'a'));
        }
        for (int i = 1; i < 26; i += 2){
            while (count[i]-- != 0) y.append((char) (i + 'a'));
        }

        if (x.length() == 0 || y.length() == 0) return x.toString() + y;
        if (Math.abs(x.charAt(x.length() - 1) - y.charAt(0)) != 1) return x.toString() + y;
        if (Math.abs(x.charAt(0) - y.charAt(y.length() - 1)) != 1) return y.toString() + x;
        return "No answer";
    }
}
