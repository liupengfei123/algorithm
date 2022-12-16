package lpf.learn.acwing.exercise;

import java.util.Scanner;

public class Q792 {
    public static Scanner sc = new Scanner(System.in);
    public static double value;

    public static void main(String[] args) {
        value = sc.nextDouble();
        System.out.println(String.format("%.6f", help(-10000, 10000)));
    }

    private static double help(double left, double right) {
        for (int i = 0; i < 100; i++) {
            double mid = (right + left) / 2;
            if (check(mid)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }

    private static boolean check(double x) {
        return x * x * x >= value;
    }
}
