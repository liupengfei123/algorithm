package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Q1473D {
    public static MyScanner sc = new MyScanner();
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));


    public static void main(String[] args) {
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            run();
        }
        out.close();
    }

    private static void run() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] chars = sc.next().toCharArray();

        int[][] pre = new int[n + 1][3];
        int[][] suf = new int[n + 1][2];

        int num = 0;
        for (int i = 0; i < n; i++) {
            num += chars[i] == '+' ? 1 : -1;

            pre[i + 1][0] = Math.min(pre[i][0], num);
            pre[i + 1][1] = Math.max(pre[i][1], num);
            pre[i + 1][2] = num;
        }
        num = 0;
        int mx = 0, mn = 0;
        for (int i = n - 1; i >= 0; i--) {
            num -= (chars[i] == '+' ? 1 : -1);
            mx = Math.max(num, mx);
            mn = Math.min(num, mn);

            suf[i][0] = mn - num; // 表示 从i开始到suf最小值的距离，用于计算拼接上pre.curr时的最小值
            suf[i][1] = mx - num; // 表示 从i开始到suf最大值的距离，用于计算拼接上pre.curr时的最大值
        }

        while (m-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(
                    Math.max(pre[l - 1][1], pre[l - 1][2] + suf[r][1])
                            - Math.min(pre[l - 1][0], pre[l - 1][2] + suf[r][0])
                            + 1);
        }


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


