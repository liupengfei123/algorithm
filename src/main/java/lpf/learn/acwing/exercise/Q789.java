package lpf.learn.acwing.exercise;

import java.util.Scanner;

public class Q789 {
    public static Scanner sc = new Scanner(System.in);

    private static int[] array = new int[100010];
    private static int[] temp = new int[100010];

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) array[i] = sc.nextInt();

        merge_sort(array, 0, n - 1);

        for (int i = 0; i < n; i++)  System.out.print(array[i] + " ");;
    }

    private static void merge_sort(int[] array, int l, int r) {
        if (l >= r) return;

        int mid = l + r >> 1;
        merge_sort(array, l, mid);
        merge_sort(array, mid + 1, r);

        int k = l, i = l, j = mid + 1;
        while (i <= mid && j <= r) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid) temp[k++] = array[i++];
        while (j <= r) temp[k++] = array[j++];

        System.arraycopy(temp, l, array, l, r - l + 1);
    }
}
