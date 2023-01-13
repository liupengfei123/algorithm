package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/777/D
 */
public class Q777D {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();sc.nextLine();

        String[] array = new String[n];
        for (int i = 0; i < n; i++) array[i] = sc.nextLine();


        run(n, array);

        for (int i = 0; i < n; i++) out.println(array[i]);

        out.flush();
    }

    private static void run(int n, String[] array) {
        String lastStr = array[n - 1];

        for (int k = n - 2; k >= 0; k--) {
            String currStr = array[k];
            int i = 0;
            for (; i < currStr.length() && i < lastStr.length(); i++) {
                if (currStr.charAt(i) > lastStr.charAt(i)) {
                    break;
                } else if (currStr.charAt(i) < lastStr.charAt(i)) {
                    i = currStr.length() - 1;
                }
            }
            array[k] = currStr.substring(0, i);
            lastStr = array[k];
        }
    }
}
