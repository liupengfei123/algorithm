package lpf.learn.atcoder.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ABC178F {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();

        run(n);
        out.flush();
    }

    private static void run(int n) {
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        for (int i = 0, j = n - 1; i <= j; i++, j--) sweep(b, i, j);

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) continue;

            while (j < n && (b[j] == b[i] || a[j] == b[i])) j++;

            if (j == n) {
                System.out.println("No");
                return;
            }
            sweep(b, i, j);
        }

        System.out.println("Yes");
        for (int i = 0; i < n; i++) out.print(b[i] + " ");
    }

    private static void sweep(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
