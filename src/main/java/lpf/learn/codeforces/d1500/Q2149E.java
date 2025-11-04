package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q2149E {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt(), L = sc.nextInt(), R = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            out.println(solve2(n, k, L, R, a));
        }
        out.close();
    }

    private static long solve(int n, int k, int L, int R, int[] arr) {
        Map<Integer, Integer> numCnt1 = new HashMap<>(k);
        Map<Integer, Integer> numCnt2 = new HashMap<>(k);

        long res = 0;
        for (int l = 0, r1 = -1, r2 = -1; l <= n - L; l++) {
            while (r1 < n && numCnt1.size() < k) { // 以l为左边界， 第一个满足子数组不同元素个数恰好为k的右边界
                if (++r1 >= n) break;
                numCnt1.merge(arr[r1], 1, Integer::sum);
            }

            while (r2 < n && numCnt2.size() <= k) { // 以l为左边界， 第一个不满足子数组不同元素个数恰好为k的右边界
                if (++r2 >= n) break;
                numCnt2.merge(arr[r2], 1, Integer::sum);
            }

            if (r2 >= l + L - 1 && r1 <= l + R) {
                int ri = Math.min(r2, l + R);
                int li = Math.min(l + R, Math.max(r1, l + L - 1));
                res += ri - li; // 计算 [r1, r2) 和 l允许的右边界[l+L-1, l+R)的重叠区间长度
            }

            numCnt1.merge(arr[l], -1, (a, b) -> (a += b) == 0 ? null : a);
            numCnt2.merge(arr[l], -1, (a, b) -> (a += b) == 0 ? null : a);
        }

        return res;
    }

    private static long solve2(int n, int k, int L, int R, int[] arr) {
        return f(n, k, L, R, arr) - f(n, k - 1, L, R, arr);
    }

    private static long f(int n, int k, int L, int R, int[] arr) {
        Map<Integer, Integer> numCnt = new HashMap<>(k);

        long res = 0;
        for (int l = 0, r = 0; r < n; r++) {
            numCnt.merge(arr[r], 1, Integer::sum);

            while (numCnt.size() > k) {
                numCnt.merge(arr[l++], -1, (a, b) -> (a += b) == 0 ? null : a);
            }
            res += Math.max(0, Math.min(r - l + 1, R) - L + 1);
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
