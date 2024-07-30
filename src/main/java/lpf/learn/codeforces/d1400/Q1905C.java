package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

public class Q1905C {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            out.println(solve(sc.nextInt(), sc.next().toCharArray()));
        }
        out.close();
    }

    private static int solve(int n, char[] s) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && s[st.peek()] < s[i]) st.pop();

            st.push(i);
        }

        int m = st.size();
        char[] t = new char[n];
        System.arraycopy(s, 0, t, 0, n);

        for (int i = 0; i < m; i++) t[st.get(i)] = s[st.get(m - i - 1)];

        char lastC = t[0];
        for (char c : t) {
            if (lastC > c) return -1;
            lastC = c;
        }

        for (Integer i : st) {
            if (s[i] == s[st.get(0)]) m--;
        }
        return m;
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
