package lpf.learn.codeforces.game.round806.div4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class QD {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();

            String [] array = new String[n];
            for (int j = 0; j < n; j++) {
                array[j] = sc.nextLine();
            }
            run(array);
        }
    }

    private static void run(String[] array) {
        Set<String> set = new HashSet<>(Arrays.asList(array));

        for (String s : array) {
            boolean success = false;
            for (int j = 1; j < s.length(); j++) {
                if (set.contains(s.substring(0, j)) &&
                        set.contains(s.substring(j))) {
                    success = true;
                    break;
                }

            }
            if (success) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
        System.out.println();
    }
}
