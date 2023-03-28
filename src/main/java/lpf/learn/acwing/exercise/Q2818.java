package lpf.learn.acwing.exercise;

import java.util.*;

/** 2816. 判断子序列
 给定一个长度为 n 的整数序列 a1,a2,…,an 以及一个长度为 m 的整数序列 b1,b2,…,bm。
 请你判断 a 序列是否为 b 序列的子序列。
 子序列指序列的一部分项按原有次序排列而得的序列，例如序列 {a1,a3,a5} 是序列 {a1,a2,a3,a4,a5} 的一个子序列。

 输入格式
 第一行包含两个整数 n,m。
 第二行包含 n 个整数，表示 a1,a2,…,an。
 第三行包含 m 个整数，表示 b1,b2,…,bm。
 输出格式
 如果 a 序列是 b 序列的子序列，输出一行 Yes。
 否则，输出 No。

 数据范围
 1≤n≤m≤105,
 −109≤ai,bi≤109
 输入样例：
 3 5
 1 3 5
 1 2 3 4 5
 输出样例：
 Yes
 */
public class Q2818 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();

        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) B[i] = sc.nextInt();

        int j = 0;
        for (int i = 0; i < m & j < n; i++) {
            if (A[j] == B[i]) j++;
        }
        System.out.println(j == n ? "Yes" : "No");
    }
}
