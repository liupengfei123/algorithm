package lpf.learn.acwing.exercise;

import java.util.*;

/** 802. 区间和
 假定有一个无限长的数轴，数轴上每个坐标上的数都是 0。

 现在，我们首先进行 n 次操作，每次操作将某一位置 x 上的数加 c。

 接下来，进行 m 次询问，每个询问包含两个整数 l 和 r，你需要求出在区间 [l,r] 之间的所有数的和。

 输入格式
 第一行包含两个整数 n 和 m。

 接下来 n 行，每行包含两个整数 x 和 c。

 再接下来 m 行，每行包含两个整数 l 和 r。

 输出格式
 共 m 行，每行输出一个询问中所求的区间内数字和。

 数据范围
 −109≤x≤109,
 1≤n,m≤105,
 −109≤l≤r≤109,
 −10000≤c≤10000
 输入样例：
 3 3
 1 2
 3 6
 7 5
 1 3
 4 6
 7 8
 输出样例：
 8
 0
 5
 */
public class Q804 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        List<Integer> indexs = new ArrayList<>(n + 2 * m);
        int[][] addArray = new int[n][2];
        for (int i = 0; i < n; i++) {
            addArray[i] = new int[]{sc.nextInt(), sc.nextInt()};
            indexs.add(addArray[i][0]);
        }

        int[][] searchArray = new int[m][2];
        for (int i = 0; i < m; i++) {
            searchArray[i] = new int[]{sc.nextInt(), sc.nextInt()};
            indexs.add(searchArray[i][0]);
            indexs.add(searchArray[i][1]);
        }
        Collections.sort(indexs);

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer index : indexs) map.putIfAbsent(index, map.size());

        int[] value = new int[map.size()];
        int[] preSum = new int[value.length + 1];

        for (int[] add : addArray) value[map.get(add[0])] += add[1];
        for (int i = 0; i < value.length; i++) preSum[i + 1] = preSum[i] + value[i];

        for (int[] search : searchArray) {
            System.out.println(preSum[map.get(search[1]) + 1] - preSum[map.get(search[0])]);
        }
    }
}
