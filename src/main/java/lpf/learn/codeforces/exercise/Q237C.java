package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/contest/237/problem/C
 */
public class Q237C {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static final TreeSet<Integer> TREE_SET = new TreeSet<>();

    static {
        boolean[] flags = new boolean[1000010];
        for (int i = 2; i <= 1000000; i++) {
            if (flags[i]) continue;

            for (int j = i + i; j <= 1000000L; j += i) flags[j] = true;

            if (!flags[i])  TREE_SET.add(i);

            for (Integer v : TREE_SET) {
                if (v > 1000000 / i) break;

                flags[v * i] = true;
                if (i % v == 0) break;
            }
        }
    }

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
        int l1 = 1, l2 = b - a + 2;
        while (l1 < l2) {
            int mid = (l1 + l2) >> 1;
            if (check(a, b - mid + 1, k, mid)) {
                l2 = mid;
            } else {
                l1 = mid + 1;
            }
        }
        out.println(l1 > b - a + 1 ? -1 : l1);
        out.close();
    }


    public static boolean check(int a, int b, int k, int l) {
        LinkedList<Integer> queue = new LinkedList<>();
        int last = a;
        for (Integer i : TREE_SET) {
            if (i < a) continue;

            queue.offer(i);

            if (queue.size() == k)  {
                if (queue.getLast() - last + 1 > l) return false;
                if ((last = queue.poll() + 1) > b) return true;
            }
        }
        return false;
    }
}
