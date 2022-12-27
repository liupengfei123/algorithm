package lpf.learn.acwing.exercise;

import java.util.Arrays;
import java.util.Scanner;

/** 799. 最长连续不重复子序列
 给定一个长度为 n 的整数序列，请找出最长的不包含重复的数的连续区间，输出它的长度。
 输入格式
 第一行包含整数 n。
 第二行包含 n 个整数（均在 0∼105 范围内），表示整数序列。
 输出格式
 共一行，包含一个整数，表示最长的不包含重复的数的连续区间的长度。

 数据范围
 1≤n≤105
 输入样例：
 5
 1 2 2 3 5
 输出样例：
 3
 */
public class Q801 {
    private static Scanner sc = new Scanner(System.in);
    private static int[] count = new int[100010];

    public static void main(String[] args) {
        Arrays.fill(count, 0);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = sc.nextInt();

        int res = 0;
        for (int j = 0, i = 0; i < n; i++) {
            count[array[i]]++;

            while (count[array[i]] > 1) count[array[j++]]--;

            res = Math.max(res, i - j + 1);
        }
        System.out.println(res);
    }
}
