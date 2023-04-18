package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q1444E {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            out.println(run(sc.nextLong(), sc.nextLong()));
        }
        out.close();
    }

    private static long run(long p, long q) {
        if (p % q != 0) return p;

        Map<Long, Integer> map = new HashMap<>();

        for (long i = 2; i * i <= q; i++) {
            if (q % i != 0) continue;

            int c = 0;
            while (q % i == 0) {
                q /= i;
                c++;
            }

            map.put(i, c);
        }
        if (q != 1) map.put(q, 1);

        PriorityQueue<Long> queue = new PriorityQueue<>();

        long temp = p;
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            long i = entry.getKey();
            int c = 0;
            while (temp % i == 0) {
                temp /= i;
                c++;
            }
            if (c >= entry.getValue()) queue.offer(pow(i, c - entry.getValue() + 1));
        }

        return p / queue.poll();
    }

    private static long pow(long value, int b) {
        long res = 1;
        while (b-- > 0) {
            res *= value;
        }
        return res;
    }
}
