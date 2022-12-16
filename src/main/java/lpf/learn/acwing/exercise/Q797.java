package lpf.learn.acwing.exercise;

import java.util.Scanner;

public class Q797 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] preSum = new int[n + 1];
        for (int i = 1; i <= n; i++) preSum[i] =  preSum[i - 1] + sc.nextInt();

        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(preSum[r] - preSum[l - 1]);
        }
    }
}
