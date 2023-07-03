package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1215B {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        run(n, a);
        out.close();
    }

    private static void run(int n, int[] a) {
        long neg = 0, pos = 0;

        // 负数个数为奇数/偶数 的子数组
        int odd = 0, even = 0;
        boolean flag = true;
        for (int i = 0 ; i < n; i++) {
            if (a[i] < 0) {
                int temp = odd;
                odd = even;
                even = temp;
                flag = !flag;
            }
            if (a[i] > 0) even++;
            else odd++;

            neg += odd;
            pos += even;
        }

        out.println(neg);
        out.println(pos);
    }
}
