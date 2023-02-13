package lpf.learn.acwing.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** 3956. 截断数组
 */
public class Q3959 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();

        out.println(run(n));
        out.flush();
    }

    private static long run(int n) {
        int[] preSum = new int[n + 1];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + sc.nextInt();
            map.merge(preSum[i + 1], 1, Integer::sum);
        }
        map.merge(preSum[n], -1, Integer::sum);

        long res = 0;
        for (int i = 0; i < n - 1; i++) {
            int t = preSum[i + 1];
            map.merge(t, -1, Integer::sum);

            if (preSum[n] != t * 3) continue;

            Integer v = map.getOrDefault(t << 1, 0);
            res += v;
        }
        return res;
    }
}
