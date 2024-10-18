package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q1795C {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n], b = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();

            long[] res = solve(n, a, b);

            for (int i = 0; i < n; i++) out.print(res[i] + " ");

            out.println();
        }
        out.close();
    }

    private static long[] solve(int n, int[] a, int[] b) {
        long[] preSum = new long[n + 1];

        for (int i = 0; i < n; i++) preSum[i + 1] = preSum[i] + b[i];

        long[] res = new long[n];
        long[] diff = new long[n + 1];

        for (int i = 0; i < n; i++) {
            long value = a[i] + preSum[i];

            int index = getIndex(value, preSum);

            diff[i]++;
            diff[index]--;

            if (index < n) res[index] += value - preSum[index];
        }

        long count = 0;
        for (int i = 0; i < n; i++) {
            count += diff[i];
            res[i] += b[i] * count;
        }

        return res;
    }

    private static int getIndex(long value, long[] preSum) {
        int index = Arrays.binarySearch(preSum, value);
        if (index < 0) {
            index = -index - 2;
        }
        return index;
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
