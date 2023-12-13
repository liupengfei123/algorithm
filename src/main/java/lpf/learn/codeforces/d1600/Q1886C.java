package lpf.learn.codeforces.d1600;

import java.io.*;
import java.util.*;

public class Q1886C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) out.print(solve(sc.next().toCharArray(), sc.nextLong()));
        out.close();
    }

    private static char solve(char[] s, long pos) {
        pos--;
        int n = s.length;
        if (pos < n) return s[(int) pos];

        int k = 0, tempN = n;
        while (pos >= tempN) {
            k++;
            pos -= tempN--;
        }

        int nPos = (int)pos;

        char[] st = new char[n + 1];
        int sti = 0;

        for (int i = 0; i < n; i++) {
            while (sti > 0 && st[sti] > s[i]) {
                sti--;
                k--;
                if (k == 0) return pos < sti ? st[nPos + 1] : s[nPos - sti + i];
            }
            st[++sti] = s[i];
        }
        return pos < sti ? st[nPos + 1] : '0';
    }
}
