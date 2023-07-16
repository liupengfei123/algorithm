package lpf.learn.codeforces.game.round884.div2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class QB {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));


    private static final boolean[] primality = new boolean[200010];

    static {
        Arrays.fill(primality, true);
        primality[1] = false;
        for (int i = 2; i < 200010; i++) {
            if (!primality[i]) continue;

            for (int j = 2; j * i < 200010; j++) primality[j * i] = false;
        }
    }


    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            boolean flag = true;
            int l = 0, r = n - 1;
            for (int i = n; i > 0; i--) {
                if (primality[i]) {
                    if (flag) a[l++] = i;
                    else a[r--] = i;
                    flag = !flag;
                }
            }
            for (int i = n; i > 0; i--) {
                if (primality[i]) continue;
                if (flag) a[l++] = i;
                else a[r--] = i;
                flag = !flag;
            }

            for (int i = 0; i < n; i++) out.print(a[i] + " ");
            out.println();
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
