package lpf.learn.acwing.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/** 830. 单调栈
 给定一个长度为 N 的整数数列，输出每个数左边第一个比它小的数，如果不存在则输出 −1。
 输入格式
 第一行包含整数 N，表示数列长度。
 第二行包含 N 个整数，表示整数数列。
 输出格式
 共一行，包含 N 个整数，其中第 i 个数表示第 i 个数的左边第一个比它小的数，如果不存在则输出 −1。

 数据范围
 1≤N≤105
 1≤数列中元素≤109
 输入样例：
 5
 3 4 2 7 5
 输出样例：
 -1 3 -1 2 2
 */
public class Q832 {
    private static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            while (!queue.isEmpty() && i - queue.getFirst() >= k) queue.removeFirst();
            while (!queue.isEmpty() && nums[queue.getLast()] >= nums[i]) queue.removeLast();
            queue.addLast(i);
            if (i >= k - 1) out.print(nums[queue.getFirst()] + " ");
        }
        queue.clear();
        out.println();

        for (int i = 0; i < n; i++) {
            while (!queue.isEmpty() && i - queue.getFirst() >= k) queue.removeFirst();
            while (!queue.isEmpty() && nums[queue.getLast()] <= nums[i]) queue.removeLast();
            queue.addLast(i);
            if (i >= k - 1) out.print(nums[queue.getFirst()] + " ");
        }
        out.flush();
    }
}
