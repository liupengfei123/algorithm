package lpf.learn.acwing.exercise;

import java.util.Scanner;

public class Q786 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = sc.nextInt();

        quick_sort(array, 0, n - 1);

        System.out.println(array[k - 1]);;
    }

    private static void quick_sort(int[] array, int l, int r) {
        if (l >= r) return;

        int x = array[l + r >> 1], i = l - 1, j = r + 1;
        while (i < j) {
            while (array[++i] < x);
            while (array[--j] > x);

            if (i < j) sweep(array, i, j);
        }
        quick_sort(array, l, j);
        quick_sort(array, j + 1, r);
    }

    private static void sweep(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
