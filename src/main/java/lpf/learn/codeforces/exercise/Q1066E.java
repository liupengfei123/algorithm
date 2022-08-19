package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1066E {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.nextLine();

        out.println(run(n1, n2));
        out.close();
    }

    private static long run(int n1, int n2) {
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        int preSum = 0;
        for (int i = 0; i < n2 - n1; i++) {
            if (line2.charAt(i) == '1')
                preSum++;
        }

        long result = 0;
        for (int i = Math.max(0, n1 - n2), j = Math.max(0, n2 - n1); i < n1 && j < n2; i++, j++) {
            if (line2.charAt(j) == '1')
                preSum++;

            result = (result * 2 + ((line1.charAt(i) - '0') * preSum)) % 998244353;
        }
        return result;
    }
}
