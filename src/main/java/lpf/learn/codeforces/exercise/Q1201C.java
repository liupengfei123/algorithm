package lpf.learn.codeforces.exercise;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1201/C
 */
public class Q1201C {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] nums = new long[n];

        for (int i = 0; i < n; i++) nums[i] = sc.nextLong();

        Arrays.sort(nums);

        long num = nums[n >> 1];
        int i = 1 + (n >> 1), c = 1;
        while (k > 0 && i < n) {
            long diff = nums[i] - num;
            if (k < diff * c) {
                num += k / c;
            } else {
                num += diff;
            }
            k -= diff * c;
            c++;
            i++;
        }
        if (k > 0) num += k / c;

        out.println(num);
        out.flush();
    }
}
