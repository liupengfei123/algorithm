package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

public class Q190D {
    public static MyScanner sc = new MyScanner();
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        Map<Integer, Integer> cnts = new HashMap<>(n);
        long res = 0;
        for (int l = 0, r = 0; r < n; r++) {
            cnts.merge(a[r], 1, Integer::sum);
            while (cnts.get(a[r]) >= k) {
                res += (n - r);
                cnts.merge(a[l++], -1, Integer::sum);
            }
        }

        out.println(res);
        out.close();
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
