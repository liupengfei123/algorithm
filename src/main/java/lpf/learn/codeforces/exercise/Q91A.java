package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 *  https://codeforces.com/contest/91/problem/A
 */
public class Q91A {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        out.println(run(s1, s2));
        out.flush();
    }

    private static long run(String s1, String s2) {
        int n = s1.length();
        int[][] nextIndex = new int[n][26];
        int[] index = new int[26];
        boolean[] flags = new boolean[26];
        Arrays.fill(index, n);
        for (int i = n - 1; i >= 0; i--) {
            System.arraycopy(index, 0, nextIndex[i], 0, 26);

            index[s1.charAt(i) - 'a'] = i;
            flags[s1.charAt(i) - 'a'] = true;
        }
        int i = 0, j = 0, m = s2.length();
        int res = 0;
        while (i < m) {
            int k = s2.charAt(i) - 'a';
            if (!flags[k]) return -1;

            j %= n;
            if (j == 0) res++;

            if (s1.charAt(j) != s2.charAt(i) && (j = nextIndex[j][k]) == n) continue;

            j++;
            i++;
        }
        return res;
    }
}
