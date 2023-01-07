package lpf.learn.acwing.exercise;

import java.util.Scanner;

/** 801. 二进制中1的个数
 给定一个长度为 n 的数列，请你求出数列中每个数的二进制表示中 1 的个数。
 输入格式
 第一行包含整数 n。
 第二行包含 n 个整数，表示整个数列。

 输出格式
 共一行，包含 n 个整数，其中的第 i 个数表示数列中的第 i 个数的二进制表示中 1 的个数。
 数据范围
 1≤n≤100000,
 0≤数列中元素的值≤109
 输入样例：
 5
 1 2 3 4 5
 输出样例：
 1 1 2 1 2
 */
public class Q803 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            int res = 0;
            while (value != 0) {
                value ^= value & -value;
                res++;
            }
            System.out.print(res + " ");
        }
    }
}
