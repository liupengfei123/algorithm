package lpf.learn.codeforces.game.round806.div4;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class QF {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = sc.nextInt();
            }
            System.out.println(run(n, array));
        }
    }

    private static long run(int n, int[] array) {
        long result = 0L;
        int count = 0;
        Queue<Integer> queue = new PriorityQueue<>( (a, b) -> b - a);

        for (int i = n; i > 0; i--) {
            if (array[i - 1] >= i) {
                continue;
            }
            while (!queue.isEmpty()) {
                if (queue.peek() > i) {
                    count++;
                    queue.poll();
                } else {
                    break;
                }
            }
            queue.add(array[i - 1]);
            result += count;
        }
        return result;
    }
}
