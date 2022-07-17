package lpf.learn.codeforces.game.round806.div4;

import java.util.Scanner;

public class QC {
    public static Scanner sc = new Scanner(System.in);
    private static boolean[] used = new boolean[26];

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = sc.nextInt();
            }
            sc.nextLine();
            run(array);
        }
    }

    private static void run(int[] array) {
        for (int i = 0; i < array.length; i++) {
            String line = sc.nextLine().trim();
            String value = line.substring(line.indexOf(' ') + 1);

            for (char c : value.toCharArray()) {
                if (c == 'U') {
                    array[i]--;
                } else {
                    array[i]++;
                }
                array[i] = (array[i] + 10) % 10;
            }

            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
