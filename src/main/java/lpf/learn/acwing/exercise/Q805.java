package lpf.learn.acwing.exercise;

import java.util.*;

/** 803. 区间合并
 给定 n 个区间 [li,ri]，要求合并所有有交集的区间。
 注意如果在端点处相交，也算有交集。
 输出合并完成后的区间个数。
 例如：[1,3] 和 [2,6] 可以合并为一个区间 [1,6]。

 输入格式
 第一行包含整数 n。
 接下来 n 行，每行包含两个整数 l 和 r。
 输出格式
 共一行，包含一个整数，表示合并区间完成后的区间个数。

 数据范围
 1≤n≤100000,
 −109≤li≤ri≤109
 输入样例：
 5
 1 2
 2 4
 5 6
 7 8
 7 9
 输出样例：
 3
 */
public class Q805 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<int[]> list = new ArrayList<>(n + 1);

        for (int i = 0; i < n; i++) list.add(new int[]{sc.nextInt(), sc.nextInt()});

        list.sort(Comparator.comparing(a -> a[0]));

        List<int[]> res = new ArrayList<>(n + 1);
        int[] lastRange = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int[] range : list) {
            if (lastRange[1] < range[0]) {
                if (lastRange[0] != Integer.MIN_VALUE) res.add(lastRange);
                lastRange = range;
            } else {
                lastRange[1] = Math.max(lastRange[1], range[1]);
            }
        }
        if (lastRange[0] != Integer.MIN_VALUE) res.add(lastRange);
        System.out.println(res.size());
    }
}
