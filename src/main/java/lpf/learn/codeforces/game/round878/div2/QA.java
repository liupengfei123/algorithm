package lpf.learn.codeforces.game.round878.div2;

import java.io.*;
import java.util.*;

public class QA {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            sc.nextInt();
            String str = sc.next();
            StringBuilder sb = new StringBuilder();

            int i = 0;
            while (i < str.length()) {
                char c = str.charAt(i++);
                sb.append(c);

                while (c != str.charAt(i)) i++;
                i++;
            }
            out.println(sb);
        }
        out.flush();
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
