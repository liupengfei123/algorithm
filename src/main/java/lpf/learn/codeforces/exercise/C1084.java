package lpf.learn.codeforces.exercise;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1084/C
 */
public class C1084 {
    public static Scanner sc = new Scanner(System.in);
    public static int mod = 1000000007;

    public static void main(String[] args) {
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println((run(s) + mod) % mod);
        }
    }

    private static int run(String s) {
        long result = 0;
        long temp = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a') {
                result = (result + temp + 1) % mod;
            } else if (c == 'b') {
                temp = result;
            }
        }
        return (int) (result % mod);
    }
}
