package lpf.learn.acwing.exercise;

import java.io.*;
import java.util.*;

/**
 * 1460. 我在哪？
 */
public class Q1462 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));


    public static void main(String[] args) {
        sc.nextLine();
        String line = sc.nextLine();
        int l = 0, r = 100;
        while (l < r) {
            int mid = l + r >> 1;
            if (check(line, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        out.println(l);
        out.flush();
    }
    private static boolean check(String line, int k) {
        Set<String> set = new HashSet<>();
        int n = line.length();
        for (int i = 0; i <= n - k; i++) {
            String s = line.substring(i, i + k);
            if (set.contains(s)) return false;
            set.add(s);
        }
        return true;
    }
}
