package lpf.learn.acwing.exercise;

import java.util.Scanner;

/** 800. 数组元素的目标和
 给定两个升序排序的有序数组 A 和 B，以及一个目标值 x。
 数组下标从 0 开始。
 请你求出满足 A[i]+B[j]=x 的数对 (i,j)。
 数据保证有唯一解。

 输入格式
 第一行包含三个整数 n,m,x，分别表示 A 的长度，B 的长度以及目标值 x。
 第二行包含 n 个整数，表示数组 A。
 第三行包含 m 个整数，表示数组 B。
 输出格式
 共一行，包含两个整数 i 和 j。

 数据范围
 数组长度不超过 105。
 同一数组内元素各不相同。
 1≤数组元素≤109
 输入样例：
 4 5 6
 1 2 4 7
 3 4 6 8 9
 输出样例：
 1 1
 */
public class Q802 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();

        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) B[i] = sc.nextInt();


        int left = 0, right = m - 1;
        while (left < n && right >= 0) {
            int value = A[left] + B[right];
            if (value == x) {
                System.out.println(left++ + " " + right--);
            } else if (value > x) {
                right--;
            } else {
                left++;
            }
        }
    }
}
