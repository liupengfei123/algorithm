package lpf.learn.acwing.exercise;

import java.util.Scanner;

/** 829. 模拟队列
 实现一个队列，队列初始为空，支持四种操作：
 push x – 向队尾插入一个数 x；
 pop – 从队头弹出一个数；
 empty – 判断队列是否为空；
 query – 查询队头元素。
 现在要对队列进行 M 个操作，其中的每个操作 3 和操作 4 都要输出相应的结果。
 输入格式
 第一行包含整数 M，表示操作次数。
 接下来 M 行，每行包含一个操作命令，操作命令为 push x，pop，empty，query 中的一种。
 输出格式
 对于每个 empty 和 query 操作都要输出一个查询结果，每个结果占一行。
 其中，empty 操作的查询结果为 YES 或 NO，query 操作的查询结果为一个整数，表示队头元素的值。
 数据范围
 1≤M≤100000,
 1≤x≤109,
 所有操作保证合法。

 输入样例：
 10
 push 6
 empty
 query
 pop
 empty
 push 3
 push 4
 pop
 query
 push 6
 输出样例：
 NO
 6
 YES
 4
 */
public class Q831 {
    private static Scanner sc = new Scanner(System.in);

    private static int N = 100010;
    private static int begin = 0, end = -1;
    private static int[] e = new int[N];

    private static void push(int v) {
        e[++end] = v;
    }

    public static void main(String[] args) {
        int m = sc.nextInt();

        while (m-- > 0) {
            String opt = sc.next();

            if (opt.length() == 4) {
                push (sc.nextInt());
            } else if (opt.length() == 3) {
                begin++;
            } else {
                if (opt.charAt(0) == 'e') {
                    System.out.println(begin > end ? "YES" : "NO");
                } else {
                    System.out.println(e[begin]);
                }
            }
        }
    }
}
