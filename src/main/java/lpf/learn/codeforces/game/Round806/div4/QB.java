package lpf.learn.codeforces.game.round806.div4;

import java.util.Arrays;
import java.util.Scanner;

public class QB {
    public static Scanner sc = new Scanner(System.in);
    private static boolean[] used = new boolean[26];

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            System.out.println(run(sc.nextLine().trim()));
        }
    }

    private static long run(String value) {
        Arrays.fill(used, false);
        int result = 0;

        for (char c : value.toCharArray()) {
            result++;
            if (!used[c - 'A']) {
                result++;
                used[c - 'A'] = true;
            }
        }
        return result;
    }
}
