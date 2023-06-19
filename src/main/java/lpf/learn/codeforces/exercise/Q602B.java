package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/602/B
 */
public class Q602B {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = sc.nextInt();

        int res = 1, l = 0, r = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (r < n) {
            map.merge(array[r], 1, Integer::sum);

            while (map.size() > 2) map.merge(array[l++], -1, (ov, v)-> (ov += v) == 0 ? null : ov);

            res = Math.max(res, r - l + 1);
            r++;
        }
        out.println(res);
        out.flush();
    }
}
