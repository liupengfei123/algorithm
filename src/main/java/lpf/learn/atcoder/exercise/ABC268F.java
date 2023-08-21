package lpf.learn.atcoder.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ABC268F {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println(run(n));
        out.flush();
    }

    private static long run(int n) {
        PriorityQueue<long[]> queue = new PriorityQueue<>((a, b) -> Long.compare(a[1] * b[0], a[0] * b[1]));

        for (int i = 0; i < n; i++) queue.add(countHelp(sc.nextLine()));

        long res = 0, xCount = 0;
        while (!queue.isEmpty()) {
            long[] poll = queue.poll();

            res += xCount * poll[1] +  poll[2];
            xCount += poll[0];
        }
        return res;
    }

    // array[0] x 个数，array[1] 数字之和，array[2] 自身计算结果
    private static long[] countHelp(String value) {
        long[] result = new long[3];
        char[] chars = value.toCharArray();

        for (char c : chars) {
            if (c == 'X') {
                result[0]++;
            } else {
                result[1] += c - '0';
            }
        }
        long xCount = result[0];
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == 'X') {
                xCount--;
            } else {
                result[2] += (chars[i] - '0') * xCount;
            }
        }
        return result;
    }
}
