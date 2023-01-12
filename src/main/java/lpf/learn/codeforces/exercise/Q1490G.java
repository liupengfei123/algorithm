package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q1490G {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long[] s = new long[n + 1];
            List<Integer> p = new ArrayList<>();
            p.add(0);
            for (int i = 1; i <= n; i++) {
                s[i] = s[i - 1] + sc.nextInt();
                if (s[i] > s[p.get(p.size() - 1)]) p.add(i);
            }

            while (m-- > 0) {
                out.print(run(n, s, p, sc.nextInt()) + " ");
            }

            out.println();
        }
        out.close();
    }

    private static long run(int n, long[] s, List<Integer> p, int x) {
        if (x <= s[p.get(p.size() - 1)]) {
            int i = Collections.binarySearch(p, x, (a, o) -> Long.compare(s[a], o));
            if (i < 0) i = -i - 1;
            return p.get(i) - 1;
        } else if (s[n] < 1) {
            return -1;
        } else {
            long loop = (x - s[p.get(p.size() - 1)] - 1) / s[n] + 1;
            x -= loop * s[n];

            int i = Collections.binarySearch(p, x, (a, o) -> Long.compare(s[a], o));
            if (i < 0) i = -i - 1;
            return p.get(i) - 1 + loop * n;
        }
    }
}
