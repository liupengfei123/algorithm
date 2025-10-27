package lpf.learn.codeforces.d1200;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://codeforces.com/problemset/problem/1914/D
 */
public class Q1914D {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[3][n];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();
            }
            out.println(solve(n, a));
        }
        out.close();
    }

    private static int solve(int n, int[][] a) {
        int[][][] max = new int[3][3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                int value = a[i][j];
                if (max[i][0][0] <= value) {
                    System.arraycopy(max[i][1], 0, max[i][2], 0, 2);
                    System.arraycopy(max[i][0], 0, max[i][1], 0, 2);

                    max[i][0][0] = value;
                    max[i][0][1] = j;
                } else if (max[i][1][0] <= value) {
                    System.arraycopy(max[i][1], 0, max[i][2], 0, 2);

                    max[i][1][0] = value;
                    max[i][1][1] = j;
                } else if (max[i][2][0] <= value) {
                    max[i][2][0] = value;
                    max[i][2][1] = j;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int[] one = max[0][i];
            for (int j = 0; j < 3; j++) {
                int[] two = max[1][j];
                if (one[1] == two[1]) continue;

                for (int z = 0; z < 3; z++) {
                    int[] three = max[2][z];
                    if (one[1] == three[1] || two[1] == three[1]) continue;

                    sum = Math.max(sum, one[0] + two[0] + three[0]);
                }
            }
        }
        return sum;
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
