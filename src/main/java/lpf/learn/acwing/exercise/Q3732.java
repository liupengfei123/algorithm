package lpf.learn.acwing.exercise;

import java.io.*;
import java.util.*;

/** 3729. 改变数组元素
 给定一个空数组 V 和一个整数数组 a1,a2,…,an。
 现在要对数组 V 进行 n 次操作。
 第 i 次操作的具体流程如下：
 从数组 V 尾部插入整数 0。
 将位于数组 V 末尾的 ai 个元素都变为 1（已经是 1 的不予理会）。
 注意：
 ai 可能为 0，即不做任何改变。
 ai 可能大于目前数组 V 所包含的元素个数，此时视为将数组内所有元素变为 1。
 请你输出所有操作完成后的数组 V。

 输入格式
 第一行包含整数 T，表示共有 T 组测试数据。
 每组数据第一行包含整数 n。
 第二行包含 n 个整数 a1,a2,…,an。
 输出格式
 每组数据输出一行结果，表示所有操作完成后的数组 V，数组内元素之间用空格隔开。

 数据范围
 1≤T≤20000,
 1≤n≤2×105,
 0≤ai≤n,
 保证一个测试点内所有 n 的和不超过 2×105。

 输入样例：
 3
 6
 0 3 0 0 1 3
 10
 0 0 0 1 0 5 0 0 0 2
 3
 0 0 0
 输出样例：
 1 1 0 1 1 1
 0 1 1 1 1 1 0 0 1 1
 0 0 0
 */
public class Q3732 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            run();
        }
        out.flush();
    }


    private static void run() {
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) array[i] = sc.nextInt();

        for (int i = n - 1, val = 0; i >= 0; i--, val--) {
            val = Math.max(val, array[i]);

            if (val > 0) array[i] = 1;
        }

        for (int i = 0; i < n; i++) out.print(array[i] + " ");
        out.println();
    }
}
