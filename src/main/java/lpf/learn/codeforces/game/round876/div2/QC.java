package lpf.learn.codeforces.game.round876.div2;

import java.io.*;
import java.util.*;

public class QC {
    private static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) run(sc.nextInt());
        out.flush();
    }

    private static void run(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        if (a[n - 1] == 1) {
            out.println("NO");
            return;
        }

        int[] opts = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            int j = i;
            while (j >= 0 && a[j] == 1) j--;
            if (i != j) opts[j + 1] = i - j;

            i = j;
        }
        out.println("YES");
        for (int i = n - 1; i >= 0; i--) out.print(opts[i] + " ");
        out.println();
    }
}
