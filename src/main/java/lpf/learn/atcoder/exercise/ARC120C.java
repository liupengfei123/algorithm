package lpf.learn.atcoder.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ARC120C {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt() + i;
        for (int i = 0; i < n; i++) b[i] = sc.nextInt() + i;

        out.println(run(n, a, b));

        out.flush();
    }


    private static long run(int n, int[] a, int[] b) {
        long[] tree = new long[n + 1];

        Map<Integer, List<Integer>> pos = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int v = a[i];

            List<Integer> list = pos.getOrDefault(v, new LinkedList<>());
            pos.putIfAbsent(v, list);

            list.add(i);
        }
        long res = 0;
        for (int i = 0; i < b.length; i++) {
            int v = b[i];

            List<Integer> list = pos.getOrDefault(v, new LinkedList<>());
            if (list.size() == 0) {
                return -1;
            }
            Integer j = list.remove(0);
            res += i - sum(j, tree);
            add(j, n, tree);
        }

        return res;
    }

    private static void add(int i, int n, long[] tree) {
        for (i++; i <= n; i += i & -i) {
            tree[i]++;
        }
    }

    private static long sum(int i, long[] tree) {
        int res = 0;
        for (; i > 0; i &= i - 1) {
            res += tree[i];
        }
        return res;
    }
}
