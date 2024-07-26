package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

public class Q1097C {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        Map<Integer, Integer> count = new HashMap<>();

        int m = 0;
        for (int i = 0; i < n; i++) {
            int value = getValue(sc.next());

            if (count.getOrDefault(-value, 0) > 0) {
                m++;
                count.merge(-value, -1, Integer::sum);
            } else {
                count.merge(value, 1, Integer::sum);
            }
        }
        out.println(m);
        out.close();
    }

    public static int getValue(String str) {
        int l = str.length();
        char[] chars = str.toCharArray();

        int lc = 0, rc = 0;
        for (int i = 0; i < l; i++) {
            if (chars[i] == '(') {
                lc++;
            } else {
                if (lc > 0) lc--;
                else rc++;
            }
        }

        if (lc == 0) return -rc;
        if (rc == 0) return lc;

        return Integer.MIN_VALUE >> 1;
    }


    private static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
