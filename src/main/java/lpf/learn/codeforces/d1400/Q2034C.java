package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/2034/C
 */
public class Q2034C {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            char[][] arr = new char[n][m];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next().toCharArray();
            }
            out.println(solve(n, m, arr));
        }
        out.close();
    }

    private static int solve(int n, int m, char[][] arr) {
        int[][] visit = new int[n][m]; // 1:访问过，2：无法出去，3：可以
        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res += dfs(n, m, i, j, arr, visit, 0) == 3 ? 1 : 0;
            }
        }
        return res;
    }

    private static int dfs(int n, int m, int i, int j, char[][] arr, int[][] visit,  int step) {
        if (i < 0 || j < 0 || i >= n || j >= m) return 2;

        if (visit[i][j] > 1) return visit[i][j];

        if (visit[i][j] == 1) return 3;
        visit[i][j] = 1;

        int flag = 2;
        char c = arr[i][j];
        if (c == 'U') {
            flag = dfs(n, m, i - 1, j, arr, visit, step + 1);
        } else if (c == 'D') {
            flag = dfs(n, m, i + 1, j, arr, visit, step + 1);
        } else if (c == 'L') {
            flag = dfs(n, m, i, j - 1, arr, visit, step + 1);
        } else if (c == 'R') {
            flag = dfs(n, m, i, j + 1, arr, visit, step + 1);
        } else {
            if (step > 0) flag = 3;
            if (flag != 3) flag = dfs(n, m, i - 1, j, arr, visit, step + 1);
            if (flag != 3) flag = dfs(n, m, i + 1, j, arr, visit, step + 1);
            if (flag != 3) flag = dfs(n, m, i, j - 1, arr, visit, step + 1);
            if (flag != 3) flag = dfs(n, m, i, j + 1, arr, visit, step + 1);
        }

        visit[i][j] = flag;
        return flag;
    }


    //-----------MyScanner class for faster input----------
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


