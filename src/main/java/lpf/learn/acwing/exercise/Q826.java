package lpf.learn.acwing.exercise;

import java.util.*;

/** 826. 单链表
 实现一个单链表，链表初始为空，支持三种操作：

 向链表头插入一个数；
 删除第 k 个插入的数后面的数；
 在第 k 个插入的数后插入一个数。
 现在要对该链表进行 M 次操作，进行完所有操作后，从头到尾输出整个链表。

 注意:题目中第 k 个插入的数并不是指当前链表的第 k 个数。例如操作过程中一共插入了 n 个数，则按照插入的时间顺序，这 n 个数依次为：第 1 个插入的数，第 2 个插入的数，…第 n 个插入的数。

 输入格式
 第一行包含整数 M，表示操作次数。

 接下来 M 行，每行包含一个操作命令，操作命令可能为以下几种：

 H x，表示向链表头插入一个数 x。
 D k，表示删除第 k 个插入的数后面的数（当 k 为 0 时，表示删除头结点）。
 I k x，表示在第 k 个插入的数后面插入一个数 x（此操作中 k 均大于 0）。
 输出格式
 共一行，将整个链表从头到尾输出。

 数据范围
 1≤M≤100000
 所有操作保证合法。

 输入样例：
 10
 H 9
 I 1 1
 D 1
 D 0
 H 6
 I 3 6
 I 4 5
 I 4 5
 I 3 4
 D 6
 输出样例：
 6 4 6 5
 */
public class Q826 {
    private static Scanner sc = new Scanner(System.in);

    private static int N = 100010;
    private static int idx = 1;
    private static int[] e = new int[N], ne = new int[N];

    private static void add(int k, int v) {
        e[idx] = v;
        ne[idx] = ne[k];
        ne[k] = idx++;
    }
    private static void delete(int k) {
        ne[k] = ne[ne[k]];
    }

    public static void main(String[] args) {
        int m = sc.nextInt();
        Arrays.fill(ne, -1);

        while (m-- > 0) {
            char opt = sc.next().charAt(0);

            if (opt == 'H') {
                add(0, sc.nextInt());
            } else if (opt == 'I') {
                add(sc.nextInt(), sc.nextInt());
            } else {
                delete(sc.nextInt());
            }
        }

        for (int i = ne[0]; i != -1; i = ne[i]) System.out.print(e[i] + " ");
    }
}
