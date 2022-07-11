package lpf.learn.codeforces.dp;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1372/C
 */
public class C1372 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] array = new int[n];

            for (int j = 0; j < n; j++) {
                array[j] = sc.nextInt();
            }

            System.out.println(run(array));
        }
    }

    private static int run(int[] array) {
        int result = 0;
        int right = -1;  //错误区间右边界
        int left = array.length; //错误区间右边界
        boolean status = false; // 错误区间内是否存在 位置正确的

        for (int i = array.length - 1; i >= 0; i--) {
            if (i + 1 == array[i]) {
                if (right != -1) {
                    status = true;
                }
                continue;
            }

            if (right == -1) {
                right = i;
            }
            left = Math.min(left, array[i]);
            if (left == i + 1) {
                result = status ? 2 : 1;
                if (result == 2) {
                    return result;
                }
            }
        }
        return result;
    }
}
