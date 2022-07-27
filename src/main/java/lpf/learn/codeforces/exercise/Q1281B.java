package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1281B {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            String c = sc.next();
            out.println(run(s, c));
        }

        out.close();
    }

    private static String run(String s, String c) {
        int[] charIndex = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            charIndex[chars[i] - 'A'] = i;
        }

        int j = 0;
        out:
        for (int i = 0; i < chars.length; i++) {
            for (; j < chars[i] - 'A'; j++) {
                if (charIndex[j] > i) {
                    char temp = chars[i];
                    chars[i] = chars[charIndex[j]];
                    chars[charIndex[j]] = temp;
                    break out;
                }
            }
        }
        s = new String(chars);
        return s.compareTo(c) < 0 ? s : "---";
    }
}
