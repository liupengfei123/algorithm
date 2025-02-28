package lpf.learn.atcoder.exercise;

import java.io.*;
import java.util.*;

public class ABC371E {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        out.println(solve(n, a));
        out.flush();
    }


    private static long solve(int n, int[] a) {
        Map<Integer, Integer> map = new HashMap<>();

        long res = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            int k = map.getOrDefault(a[i], -1);

            sum += i - k;
            res += sum;

            map.put(a[i], i);
        }
        return res;
    }

}
