package lpf.learn.codeforces.d1200;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1730/C
 */
public class Q1730C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            out.println(solve(sc.next().toCharArray()));
        }
        out.close();
    }

    private static String solve(char[] chars) {
        int[] count = new int[10];
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            while (!stack.isEmpty() && c < stack.peek()) {
                count[Math.min(9, stack.pop() - '0' + 1)]++;
            }
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            count[Math.min(9, stack.pop() - '0')]++;
        }
        int i = 0;
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < count[j]; k++) chars[i++] = (char) ('0' + j);
        }
        return new String(chars);
    }
}
