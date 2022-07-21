package lpf.learn.codeforces.exercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  https://codeforces.com/problemset/problem/166/E
 */
public class Q44H {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String line = sc.nextLine();
        System.out.println(run(line));
    }

    private static long run(String line) {
        long[] dp = new long[10];
        Arrays.fill(dp, 1);

        for (int i = 1; i < line.length(); i++) {
            long[] ndp = new long[10];
            int value = line.charAt(i) - '0';

            for (int j = 0; j < 10; j++) {
                int temp = j + value;
                if ((temp & 1) == 1) {
                    ndp[(temp >> 1) + 1] += dp[j];
                }
                ndp[temp >> 1] += dp[j];
            }
            dp = ndp;
        }

        long result = 0;
        for (long i : dp) {
            result += i;
        }

        boolean odd = true;
        for (int i = 1; i < line.length(); i++) {
            if (Math.abs(line.charAt(i - 1) - line.charAt(i)) > 1) {
                odd = false;
                break;
            }
        }
        if (odd) result--;
        return result;
    }
}
