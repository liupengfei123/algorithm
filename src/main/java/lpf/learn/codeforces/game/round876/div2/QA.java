package lpf.learn.codeforces.game.round876.div2;

import java.io.*;
import java.util.*;

public class QA {
    private static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();

            int res = (n + k - 1) / k;
            if (k != 1 && n % k != 1) res++;
            out.println(res);
        }
        out.flush();
    }
}
