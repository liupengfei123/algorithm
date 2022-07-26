package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1467C {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        out.println(run(n1, n2, n3));
        out.close();
    }

    private static long run(int n1, int n2, int n3) {
        long[] array1 = help(n1);
        long[] array2 = help(n2);
        long[] array3 = help(n3);

        long sum = array1[0] + array2[0] + array3[0];
        long temp1 = sum - (array1[1] + array2[1] + array3[1] - Math.max(Math.max(array1[1],array2[1]),array3[1])) * 2;
        long temp2 = sum - (Math.min(Math.min(array1[0],array2[0]),array3[0])) * 2;
        return Math.max(temp1, temp2);
    }

    private static long[] help(int n) {
        long sum = 0;
        long min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long value = sc.nextLong();
            sum += value;
            if (value < min) {
                min = value;
            }
        }
        return new long[]{sum, min};
    }
}
