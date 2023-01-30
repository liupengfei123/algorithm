package lpf.learn.atcoder.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ABC270E {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] array = new long[n];

        PriorityQueue<long[]> index = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
            if (array[i] != 0) index.offer(new long[]{array[i], i});
        }

        run(index, array, k);

        for (int i = 0; i < n; i++) out.print(array[i] + " ");

        out.println();
        out.flush();
    }

    private static void run(PriorityQueue<long[]> index, long[] array, long k) {
        long base = 0;
        while (!index.isEmpty()) {
            long[] poll = index.peek();
            long temp = (poll[0] - base) * index.size();
            if (temp >= k) break;

            base += (poll[0] - base);
            array[(int) poll[1]] = 0;
            k -= temp;

            index.poll();
        }

        base += k / index.size();
        k -= index.size() * (k / index.size());
        while (!index.isEmpty()) {
            long[] poll = index.poll();
            array[(int) poll[1]] = poll[0] - base;
        }

        for (int i = 0; k > 0; k--, i++) {
            while (i < array.length && array[i] == 0) i++;
            array[i]--;
        }
    }
}

