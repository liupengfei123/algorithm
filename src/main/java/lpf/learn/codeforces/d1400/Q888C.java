package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/contest/888/problem/C
 */
public class Q888C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        out.println(solve(sc.next().toCharArray()));
        out.close();
    }

    private static int solve(char[] chars) {
        int n = chars.length;
        int[] index = new int[26], dist = new int[26];
        Arrays.fill(index, -1);

        for (int i = 0; i < n; i++) {
            int j = chars[i] - 'a';
            dist[j] = Math.max(i - index[j], dist[j]);
            index[j] = i;
        }

        int res = Integer.MAX_VALUE;
        for (int j = 0; j < 26; j++) {
            dist[j] = Math.max(n - index[j], dist[j]);
            res = Math.min(res, dist[j]);
        }
        return res;
    }
}
