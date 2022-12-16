package lpf.learn.acwing.exercise;

import java.util.Scanner;

public class Q791 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = sc.nextInt();


        for (int i = 0; i < q; i++) {
            int value = sc.nextInt();
            System.out.print(getLeftIndex(array, value));
            System.out.print(" ");
            System.out.println(getRightIndex(array, value));
        }
    }

    private static int getLeftIndex(int[] array, int value) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (checkLeftIndex(array[mid], value)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return array[right] == value ? right : -1;
    }

    private static boolean checkLeftIndex(int v1, int v2) {
        return v1 >= v2;
    }


    private static int getRightIndex(int[] array, int value) {
        int left = 0, right = array.length - 1;

        while (left < right) {
            int mid = (left + right + 1) >> 1;
            if (checkRightIndex(array[mid], value)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return array[left] == value ? right : -1;
    }
    private static boolean checkRightIndex(int v1, int v2) {
        return v1 <= v2;
    }
}
