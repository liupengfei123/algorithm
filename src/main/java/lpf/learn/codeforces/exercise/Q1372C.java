package lpf.learn.codeforces.exercise;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1372/C
 */
public class Q1372C {
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
        int right = array.length - 1;  //错误区间右边界
        int left = 0; //错误区间左边界

        while (right >= 0 && right + 1 == array[right]) right--;

        if (right < 0) {
            return 0;
        }

        while (left < array.length && left + 1 == array[left]) left++;

        for (int i = left; i <= right; i++) {
            if (i + 1 == array[i]) {
                return 2;
            }
        }
        return 1;
    }
}
