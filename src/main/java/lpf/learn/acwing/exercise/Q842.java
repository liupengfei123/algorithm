package lpf.learn.acwing.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/** 840. 模拟散列表
 维护一个集合，支持如下几种操作：
 I x，插入一个数 x；
 Q x，询问数 x 是否在集合中出现过；
 现在要进行 N 次操作，对于每个询问操作输出对应的结果。
 输入格式
 第一行包含整数 N，表示操作数量。
 接下来 N 行，每行包含一个操作指令，操作指令为 I x，Q x 中的一种。
 输出格式
 对于每个询问指令 Q x，输出一个询问结果，如果 x 在集合中出现过，则输出 Yes，否则输出 No。
 每个结果占一行。

 数据范围
 1≤N≤105
 −109≤x≤109
 输入样例：
 5
 I 1
 I 2
 I 3
 Q 2
 Q 5
 输出样例：
 Yes
 No
 */
public class Q842 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static final int N = 100010, MOD = 13331;
    private static int idx = 0;
    private static int[] h = new int[MOD], e = new int[N], ne = new int[N];

    private static void add(int value) {
        e[idx] = value;
        int i = hash(value);
        ne[idx] = h[i];
        h[i] = idx++;
    }

    private static boolean query(int value) {
        for (int i = h[hash(value)]; i != -1; i = ne[i]) {
            if (e[i] == value) return true;
        }
        return false;
    }

    private static int hash(int value) {
        return ((value % MOD) + MOD) % MOD;
    }

    public static void main(String[] args) {
        Arrays.fill(h, -1);
        int n = sc.nextInt();
        while (n-- > 0) {
            char opt = sc.next().charAt(0);
            int value = sc.nextInt();

            if (opt == 'I') {
                add(value);
            } else {
                System.out.println(query(value) ? "Yes" : "No");
            }
        }
        out.flush();
    }
}
