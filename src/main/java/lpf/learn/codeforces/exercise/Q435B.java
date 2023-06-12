package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/435/B
 */
public class Q435B {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));


    public static void main(String[] args) {
        char[] chars = sc.next().toCharArray();
        int n = chars.length, k = sc.nextInt();


        for (int i = 0; i < n; i++) {
            int z = i;
            for (int j = i + 1; j < n && j <= i + k; j++) {
                if (chars[z] < chars[j]) z = j;
            }
            char temp = chars[z];
            System.arraycopy(chars, i, chars, i + 1, z - i);
            chars[i] = temp;
            k -= z - i;
        }

        out.print(new String(chars));
        out.flush();
    }
}
