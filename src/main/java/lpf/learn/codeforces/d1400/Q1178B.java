package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

public class Q1178B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        System.out.println(solve(sc.next().toCharArray()));
        out.close();
    }

    private static long solve(char[] chars) {
        int n = chars.length;
        long res = 0;
        int[] cnt = new int[n];

        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            int temp = 0;
            while (i >= 0 && chars[i] == 'v') {
                i--;
                temp++;
            }

            if (i < 0) continue;

            if (temp > 0) sum += (temp - 1);
            cnt[i] = sum;
        }

        sum = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            while (i < n && chars[i] == 'v') {
                i++;
                temp++;
            }

            if (i >= n) continue;
            if (temp > 0) sum += (temp - 1);

            res += 1L * sum * cnt[i];
        }
        return res;
    }
}
