package lpf.learn.acwing.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/** 143. 最大异或对
 在给定的 N 个整数 A1，A2……AN 中选出两个进行 xor（异或）运算，得到的结果最大是多少？
 输入格式
 第一行输入一个整数 N。
 第二行输入 N 个整数 A1～AN。
 输出格式
 输出一个整数表示答案。

 数据范围
 1≤N≤105,
 0≤Ai<231
 输入样例：
 3
 1 2 3
 输出样例：
 3
 */
public class Q145 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static void insert(Trie node, int x) {
        for (int i = 30; i >= 0; i--) {
            int index = x >> i & 1;
            if (node.child[index] == null) node.child[index] = new Trie();
            node = node.child[index];
        }
    }

    private static int query(Trie node, int x) {
        int res = 0;
        for (int i = 30; i >= 0; i--) {
            int s = (x >> i) & 1;
            if (node.child[~s & 1] != null) {
                res += 1 << i;
                node = node.child[~s & 1];
            } else {
                node = node.child[s];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] array = new int[n];
        Trie root = new Trie();

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            insert(root, array[i]);
        }
        int res = 0;

        for (int i = 0; i < n; i++) res = Math.max(query(root, array[i]), res);

        out.println(res);
        out.flush();
    }

    private static class Trie {
        Trie[] child = new Trie[2];
    }
}
