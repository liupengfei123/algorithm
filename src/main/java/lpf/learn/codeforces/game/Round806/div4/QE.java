package lpf.learn.codeforces.game.round806.div4;

import java.util.Scanner;

public class QE {
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
            System.out.println(run(n, array));
        }
    }

    private static int run(int n, String[] array) {
        int result = 0;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int oneCount = array[i].charAt(j) == '1' ? 1 : 0;
                oneCount += array[n - j - 1].charAt(i) == '1' ? 1 : 0;
                oneCount += array[n - i - 1].charAt(n - j - 1) == '1' ? 1 : 0;
                oneCount += array[j].charAt(n - i - 1) == '1' ? 1 : 0;

                result += Math.min(oneCount, 4 - oneCount);
            }
        }
        return result;
    }
}
