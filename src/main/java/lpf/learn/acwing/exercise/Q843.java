package lpf.learn.acwing.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/** 841. 字符串哈希
 给定一个长度为 n 的字符串，再给定 m 个询问，每个询问包含四个整数 l1,r1,l2,r2，请你判断 [l1,r1] 和 [l2,r2] 这两个区间所包含的字符串子串是否完全相同。
 字符串中只包含大小写英文字母和数字。

 输入格式
 第一行包含整数 n 和 m，表示字符串长度和询问次数。
 第二行包含一个长度为 n 的字符串，字符串中只包含大小写英文字母和数字。
 接下来 m 行，每行包含四个整数 l1,r1,l2,r2，表示一次询问所涉及的两个区间。
 注意，字符串的位置从 1 开始编号。
 输出格式
 对于每个询问输出一个结果，如果两个字符串子串完全相同则输出 Yes，否则输出 No。
 每个结果占一行。

 数据范围
 1≤n,m≤105
 输入样例：
 8 3
 aabbaabb
 1 3 5 7
 1 3 6 8
 1 2 1 2
 输出样例：
 Yes
 No
 Yes
 */
public class Q843 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static final int P = 13331;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[] chars = sc.nextLine().toCharArray();

        long[] strHash = new long[n + 1];
        long[] p = new long[n + 1];
        p[0] = 1;
        for (int i = 0; i < chars.length; i++) {
            strHash[i + 1] = strHash[i] * P + chars[i];
            p[i + 1] = p[i] * P;
        }

        while (m-- > 0) {
            int l1 = sc.nextInt(), r1 = sc.nextInt(), l2 = sc.nextInt(), r2 = sc.nextInt();

            long hash1 = strHash[r1] - strHash[l1 - 1] * p[r1 - l1 + 1];
            long hash2 = strHash[r2] - strHash[l2 - 1] * p[r2 - l2 + 1];
            System.out.println(hash1 == hash2 ? "Yes" : "No");
        }
        out.flush();
    }
}
