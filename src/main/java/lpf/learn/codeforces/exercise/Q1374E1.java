package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q1374E1 {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        out.println(run(n, k));
        out.close();
    }

    private static int run(int n, int k) {
        PriorityQueue<Integer> onlyA = new PriorityQueue<>();
        PriorityQueue<Integer> onlyB = new PriorityQueue<>();
        PriorityQueue<Integer> aAndB = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();

            if (a == 1 && b == 1) aAndB.offer(t);
            else if (a == 1) onlyA.offer(t);
            else if (b == 1) onlyB.offer(t);
        }
        while (!onlyA.isEmpty() && !onlyB.isEmpty()) {
            aAndB.offer(onlyA.poll() + onlyB.poll());
        }

        if (aAndB.size() < k) return -1;

        int t = 0;
        while (k-- > 0) t += aAndB.poll();
        return t;
    }


}
