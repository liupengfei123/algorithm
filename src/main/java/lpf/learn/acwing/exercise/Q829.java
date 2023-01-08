package lpf.learn.acwing.exercise;

import java.util.Arrays;
import java.util.Scanner;

/** 827. 双链表
 实现一个双链表，双链表初始为空，支持 5 种操作：
 在最左侧插入一个数；
 在最右侧插入一个数；
 将第 k 个插入的数删除；
 在第 k 个插入的数左侧插入一个数；
 在第 k 个插入的数右侧插入一个数
 现在要对该链表进行 M 次操作，进行完所有操作后，从左到右输出整个链表。
 注意:题目中第 k 个插入的数并不是指当前链表的第 k 个数。例如操作过程中一共插入了 n 个数，则按照插入的时间顺序，这 n 个数依次为：第 1 个插入的数，第 2 个插入的数，…第 n 个插入的数。

 输入格式
 第一行包含整数 M，表示操作次数。
 接下来 M 行，每行包含一个操作命令，操作命令可能为以下几种：
 L x，表示在链表的最左端插入数 x。
 R x，表示在链表的最右端插入数 x。
 D k，表示将第 k 个插入的数删除。
 IL k x，表示在第 k 个插入的数左侧插入一个数。
 IR k x，表示在第 k 个插入的数右侧插入一个数。
 输出格式
 共一行，将整个链表从左到右输出。

 数据范围
 1≤M≤100000
 所有操作保证合法。

 输入样例：
 10
 R 7
 D 1
 L 3
 IL 2 10
 D 3
 IL 2 7
 L 8
 R 9
 IL 4 7
 IR 2 2
 输出样例：
 8 7 7 3 2 9
 */
public class Q829 {
    private static Scanner sc = new Scanner(System.in);

    private static int N = 100010;
    private static int idx = 2;
    private static int[] e = new int[N], pre = new int[N], ne = new int[N];

    private static void add(int k, int v) {
        e[idx] = v;

        pre[ne[k]] = idx;
        pre[idx] = k;

        ne[idx] = ne[k];
        ne[k] = idx++;
    }
    private static void delete(int k) {
        ne[pre[k]] = ne[k];
        pre[ne[k]] = pre[k];
    }

    public static void main(String[] args) {
        int m = sc.nextInt();
        Arrays.fill(ne, -1);
        Arrays.fill(pre, -1);

        ne[0] = 1;
        pre[1] = 0;

        while (m-- > 0) {
            String opt = sc.next();

            if (opt.charAt(0) == 'L') {
                add(0, sc.nextInt());
            } else if (opt.charAt(0) == 'R') {
                add(pre[1], sc.nextInt());
            } else if (opt.charAt(0) == 'D'){
                delete(sc.nextInt() + 1);

            } else if (opt.charAt(1) == 'L'){
                add(pre[sc.nextInt() + 1], sc.nextInt());
            } else if (opt.charAt(1) == 'R'){
                add(sc.nextInt() + 1, sc.nextInt());
            }
        }

        for (int i = ne[0]; i != 1; i = ne[i]) System.out.print(e[i] + " ");
    }
}
