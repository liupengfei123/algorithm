package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/contest/318/problem/B
 */
public class Q318B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        out.println(solve(sc.next()));
        out.close();
    }


    private static long solve(String s) {
        int len = s.length();
        long res = 0, cnt = 0;

        for (int i = 5; i <= len; i++) {
            String sub = s.substring(i - 5, i);

            if ("heavy".equals(sub)) {
                cnt++;
            } else if ("metal".equals(sub)) {
                res += cnt;
            }
        }
        return res;
    }

    private static long solve2(String s) {
        Queue<Integer> queue = new LinkedList<>();
        int i = -1;
        while ((i = s.indexOf("metal", i + 1)) > -1) {
            queue.add(i);
        }

        long res = 0;
        i = -1;
        while ((i = s.indexOf("heavy", i + 1)) > -1) {
            while (!queue.isEmpty() && queue.peek() < i) queue.remove();

            res += queue.size();
        }
        return res;
    }
}
