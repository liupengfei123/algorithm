package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

public class Q1102D {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        char[] chars = sc.next().toCharArray();

        int k = n / 3;
        int[] cnt = new int[3];
        for (char c : chars) cnt[c - '0']++;

        for (int i = 0; i < n; i++) {
            int v = chars[i] - '0';
            if (v == 0 || cnt[v] <= k) continue;

            int j = cnt[0] < k ? 0 : 1;
            chars[i] = (char) (j + '0');
            cnt[j]++;
            cnt[v]--;
        }

        for (int i = n - 1; i >= 0; i--) {
            int v = chars[i] - '0';
            if (v == 2 || cnt[v] <= k) continue;

            int j = cnt[2] < k ? 2 : 1;
            chars[i] = (char) (j + '0');
            cnt[j]++;
            cnt[v]--;
        }
        out.println(new String(chars));
        out.flush();
    }
}
