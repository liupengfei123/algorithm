package lpf.learn.acwing.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 3768. 字符串删减
 */
public class Q3771 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();sc.nextLine();
        char[] chars = sc.nextLine().toCharArray();
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 'x') continue;

            int j = i;
            while (j < n && chars[j] == 'x') j++;

            if (j - i > 2) res += j - i - 2;
            i = j - 1;
        }
        out.println(res);
        out.flush();
    }
}