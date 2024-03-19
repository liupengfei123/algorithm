package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q1547E {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[k];
            int[] t = new int[k];

            for (int i = 0; i < k; i++) a[i] = sc.nextInt();
            for (int i = 0; i < k; i++) t[i] = sc.nextInt();

            int[] solve = solve(n, k, a, t);
            for (int i = 0; i < n; i++) out.print(solve[i] + " ");
            out.println();
        }
        out.close();
    }

    private static int[] solve(int n, int k, int[] a, int[] t) {
        int[] res = new int[n];
        Arrays.fill(res, Integer.MAX_VALUE >> 1);

        Map<Integer, Integer> map = new HashMap<>(k);
        for (int i = 0; i < k; i++) map.put(a[i] - 1, t[i]);

        int min = Integer.MAX_VALUE >> 1;
        for (int j = 0; j < n; j++) {
            min++;

            if (map.containsKey(j)) min = Math.min(min, map.get(j));

            res[j] = min = Math.min(min, res[j]);
        }

        min = Integer.MAX_VALUE >> 1;
        for (int j = n - 1; j >= 0; j--) {
            min++;

            if (map.containsKey(j)) min = Math.min(min, map.get(j));

            res[j] = min = Math.min(min, res[j]);
        }
        return res;
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
