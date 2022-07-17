package lpf.learn.codeforces.game.round806.div4;

import java.util.Scanner;

public class QA {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            if (line.length() != 3) {
                System.out.println("NO");
                continue;
            }
            String s = line.toUpperCase();

            if (s.equals("YES")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
