package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Q1043D {
    public static MyScanner sc = new MyScanner();
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        out.println(run(n, m));
        out.close();
    }

    private static long run(int n, int m) {
        int[][] arrays = new int[m][n];
        int[][] pos = new int[m][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arrays[i][j] = sc.nextInt();

                pos[i][arrays[i][j]] = j;
            }
        }

        long result = 0;
        for (int i = 0; i < n;) {
            int j = i + 1;
            out:
            for (; j < n; j++) {
                for (int k = 1; k < m; k++) {
                    if (pos[k][arrays[0][j - 1]] + 1 != pos[k][arrays[0][j]]) {
                        break out;
                    }
                }
            }
            result += (j - i + 1L) * (j - i) / 2L;
            i = j;
        }
        return result;
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
                } catch (IOException ignored) {
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
