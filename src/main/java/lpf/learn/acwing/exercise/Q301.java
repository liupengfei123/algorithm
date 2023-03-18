package lpf.learn.acwing.exercise;

import java.io.*;
import java.util.*;

/** 299. 裁剪序列
 */
public class Q301 {
    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {
        int n = sc.nextInt();
        long m = sc.nextLong();
        int[] array = new int[n];
        long[] preSum = new long[n + 1];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            preSum[i + 1] = preSum[i] + array[i];
        }

        long[] dp = new long[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        LinkedList<Integer> queue = new LinkedList<>();
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();

        for (int i = 0, l = 0; i < n; i++) {
            while ((preSum[i + 1] - preSum[l]) > m) {
                l++;
                if (!queue.isEmpty() && queue.peek() < l) {
                    Integer poll = queue.poll();
                    if (!queue.isEmpty()) priorityQueue.remove(dp[poll + 1] + array[queue.peek()]);
                }
            }

            while (!queue.isEmpty() && array[queue.peekLast()] <= array[i]) {
                Integer pollLast = queue.pollLast();
                if (!queue.isEmpty()) priorityQueue.remove(dp[queue.peekLast() + 1] + array[pollLast]);
            }

            if (!queue.isEmpty()) priorityQueue.add(dp[queue.peekLast() + 1] + array[i]);

            queue.offer(i);
            dp[i + 1] = dp[l] + array[queue.peek()];

            if (!priorityQueue.isEmpty()) dp[i + 1] = Math.min(dp[i + 1], priorityQueue.peek());
        }
        System.out.println(dp[n]);
    }



    private static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
