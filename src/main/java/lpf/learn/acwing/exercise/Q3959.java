package lpf.learn.acwing.exercise;

import java.io.*;
import java.util.*;

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

        for (int i = 0; i < n; i++) preSum[i + 1] = preSum[i] + sc.nextInt();

        if (preSum[n] % 3 != 0) return 0;

        int t = preSum[n] / 3, cnt = 0;
        long res = 0;
        // i 为 后面一个分隔点， cnt 为 i 之前的有多少个分隔点数量
        for (int i = 1; i < n - 1; i++) {
            if (preSum[i] == t) cnt++;
            if (preSum[i + 1] == t << 1) res += cnt;
        }
        return res;
    }
}
