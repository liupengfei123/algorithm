package lpf.learn.codeforces.d1500;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1800E2 {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            String s = sc.next(), t = sc.next();
            out.println(solve(n, k, s, t) ? "YES" : "NO");
        }
        out.close();
    }

    private static boolean solve(int n, int k, String s, String t) {
        int[] p = new int[n];
        Arrays.setAll(p, i -> i);

        for (int i = 0; i + k < n; i++) {
            p[find(p, i + k)] = find(p, i);
            if (i + k + 1< n)  p[find(p, i + k + 1)] = find(p, i);
        }

        Map<Integer, int[]> map1 = new HashMap<>();
        Map<Integer, int[]> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int j = find(p, i);

            int[] cnt1 = map1.computeIfAbsent(j, key -> new int[26]);
            cnt1[s.charAt(i) - 'a']++;

            int[] cnt2 = map2.computeIfAbsent(j, key -> new int[26]);
            cnt2[t.charAt(i) - 'a']++;
        }

        for (Integer j : map1.keySet()) {
            int[] cnt1 = map1.get(j);
            int[] cnt2 = map2.get(j);

            if (!Arrays.equals(cnt1, cnt2)) return false;
        }
        return true;
    }

    private static int find(int[] p, int x) {
        if (p[x] != x) p[x] = find(p, p[x]);
        return p[x];
    }
}
