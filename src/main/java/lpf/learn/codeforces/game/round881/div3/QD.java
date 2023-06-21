package lpf.learn.codeforces.game.round881.div3;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class QD {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] cnt = new int[n];

            buildTree(n, cnt);

            int q = sc.nextInt();

            while (q-- > 0) {
                int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
                out.println((long) cnt[a] * cnt[b]);
            }
        }
        out.flush();
    }

    private static void buildTree(int n, int[] cnt) {
        Set<Integer>[] sets = new Set[n];
        Arrays.setAll(sets, i -> new HashSet<>());

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
            sets[a].add(b);
            sets[b].add(a);
        }
        dfs(0, 0, sets, cnt);
    }

    private static int dfs(int i, int pi, Set<Integer>[] sets, int[] cnt) {
        if (i != 0 && sets[i].size() == 1) return cnt[i] = 1;

        int res = 0;
        for (Integer j : sets[i]) {
            if (j == pi) continue;

            res += dfs(j, i, sets, cnt);
        }
        return cnt[i] = res;
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
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
