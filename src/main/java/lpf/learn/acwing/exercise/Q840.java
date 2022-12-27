package lpf.learn.acwing.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/** 838. 堆排序
 输入一个长度为 n 的整数数列，从小到大输出前 m 小的数。

 输入格式：
 第一行包含整数 n 和 m。
 第二行包含 n 个整数，表示整数数列。
 输出格式：
 共一行，包含 m 个整数，表示整数数列中前 m 小的数。

 数据范围
 1≤m≤n≤10^5，
 1≤数列中元素≤10^9
 输入样例：
 5 3
 4 5 1 3 2
 输出样例：
 1 2 3
 */
public class Q840 {
    private static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static int[] array;
    private static int size = 0;

    public static void main(String[] args) {
        size = sc.nextInt();
        int m = sc.nextInt();
        array = new int[size + 1];

        for (int i = 1; i <= size; i++) array[i] = sc.nextInt();

        for (int i = size / 2; i > 0; i--) dowm(i);

        for (int i = 0; i < m; i++) {
            out.print(array[1] + " ");
            array[1] = array[size--];
            dowm(1);
        }
        out.flush();
    }

    private static void dowm(int k) {
        int t = k;
        if (k << 1 <= size && array[k << 1] < array[t]) t = k << 1;
        if ((k << 1) + 1 <= size && array[(k << 1) + 1] < array[t]) t = (k << 1) + 1;

        if (t != k) {
            swap(k, t);
            dowm(t);
        }
    }

    private static void swap(int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
