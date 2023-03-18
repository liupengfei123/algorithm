package lpf.learn.acwing.exercise;

import java.io.*;
import java.util.*;

/** 845. 八数码
 */
public class Q847 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static final int[][] dire = new int[][]{{1, 0}, {-1, 0}, {0 , 1}, {0, -1}};

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) sb.append(sc.next());

        out.println(bfs(sb.toString()));

        out.flush();
    }

    private static int bfs(String state) {
        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        queue.add(state);
        map.put(state, 0);

        String end = "12345678x";
        while (!queue.isEmpty()) {
            String t = queue.poll();

            if (end.equals(t)) return map.get(t);

            int distance = map.get(t);
            int x = t.indexOf('x');

            int i = x / 3, j = x % 3;

            for (int[] next : dire) {
                int ni = next[0] + i;
                int nj = next[1] + j;

                if (ni < 0 || ni > 2 || nj < 0 || nj > 2) {
                    continue;
                }
                String nt = swap(t, x, ni * 3 + nj);
                if (!map.containsKey(nt)) {
                    map.put(nt, distance + 1);
                    queue.offer(nt);
                }
            }
        }
        return -1;
    }

    private static String swap(String v, int i, int j) {
        char[] chars = v.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }
}
