package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1759/G
 */
public class Q1759G {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int[] res = run(n);
            if (res == null) {
                out.println(-1);
            } else {
                for (int v : res) out.print(v + " ");
                out.println();
            }
            out.flush();
        }
    }

    private static int[] run(int n) {
        int[] a = new int[n];
        int[] pos = new int[n + 1];

        for (int i = 1; i <= n; i+=2) {
            a[i] = sc.nextInt();
            pos[a[i]] = i;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = n; i > 0; i--) {
            if (pos[i] > 0) queue.add(pos[i]);
            else if (!queue.isEmpty()) a[queue.poll() - 1] = i;
            else return null;
        }
        return a;
    }
}
