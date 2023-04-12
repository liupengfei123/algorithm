package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1296C {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static final int[][] dicts = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) {
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int[] run = run(sc.nextInt(), sc.next());
            if (run == null) {
                out.println(-1);
            } else {
                out.println(run[0] + " " + run[1]);
            }
        }
        out.close();
    }

    private static int[] run(int n, String c) {
        Map<String, Integer> map = new HashMap<>(n);
        int x = 0, y = 0;

        char[] chars = c.toCharArray();

        int minLength = Integer.MAX_VALUE;
        int[] res = null;

        for (int i = 1; i <= chars.length; i++) {
            map.put(x + "#" + y, i);

            int dict = -1;
            switch (chars[i - 1]) {
                case 'R': dict = 0;break;
                case 'L': dict = 1;break;
                case 'U': dict = 2;break;
                case 'D': dict = 3;break;
            }
            x += dicts[dict][0];
            y += dicts[dict][1];

            Integer j = map.get(x + "#" + y);
            if (j != null && i - j < minLength) {
                res = new int[]{j, i};
                minLength = i - j;
            }
        }
        return res;
    }
}
