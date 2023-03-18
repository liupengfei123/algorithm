package lpf.learn.acwing.exercise;

import java.io.*;
import java.util.*;

/** 842. 排列数字
 给定一个整数 n，将数字 1∼n 排成一排，将会有很多种排列方法。
 现在，请你按照字典序将所有的排列方法输出。
 输入格式
 共一行，包含一个整数 n。
 输出格式
 按字典序输出所有排列方案，每个方案占一行。

 数据范围
 1≤n≤7
 输入样例：
 3
 输出样例：
 1 2 3
 1 3 2
 2 1 3
 2 3 1
 3 1 2
 3 2 1
 */
public class Q844 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();

        dfs(new LinkedList<>(), new boolean[n]);

        out.flush();
    }


    private static void dfs(LinkedList<Integer> list, boolean[] st) {
        if (list.size() == st.length) {
            for (Integer i : list) out.print(i + " ");
            out.println();
            return;
        }

        for (int i = 0; i < st.length; i++) {
            if (!st[i]) {
                list.add(i + 1);
                st[i] = true;

                dfs(list, st);

                st[i] = false;
                list.removeLast();
            }
        }
    }
}
