package lpf.learn.codeforces.game.round878.div2;


import java.io.*;
import java.util.*;

public class QE {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();

            int k = sc.nextInt(), q = sc.nextInt();

            run(s1, s2, k ,q);
        }
        out.flush();
    }

    private static void run(String s1, String s2, int t, int q) {
        int n = s1.length();
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        PriorityQueue<Integer> minT = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (chars1[i] != chars2[i]){
                map.put(i, 0);
                minT.offer(0);
            }
        }

        int time = 0;
        while (q-- > 0) {
            int type = sc.nextInt();
            time++;

            if (type == 1) {
                int pos = sc.nextInt() - 1;
                int finalTime = time;
                Integer newValue = map.computeIfPresent(pos, (key, old) -> {
                    minT.remove(old);
                    return finalTime + t;
                });
                if (newValue != null) minT.offer(newValue);
            } else if (type == 2) {
                int d1 = sc.nextInt(), pos1 = sc.nextInt() - 1, d2 = sc.nextInt(), pos2 = sc.nextInt() - 1;

                char[] v1 = d1 == 1 ? chars1 : chars2;
                char[] v2 = d2 == 1 ? chars1 : chars2;

                char temp = v1[pos1];
                v1[pos1] = v2[pos2];
                v2[pos2] = temp;

                if (chars1[pos1] == chars2[pos1]) {
                    Integer remove = map.remove(pos1);
                    if (remove != null) minT.remove(remove);
                } else {
                    if (map.get(pos1) == null) {
                        map.put(pos1, 0);
                        minT.offer(0);
                    }
                }
                if (chars1[pos2] == chars2[pos2]) {
                    Integer remove = map.remove(pos2);
                    if (remove != null) minT.remove(remove);
                } else {
                    if (map.get(pos2) == null) {
                        map.put(pos2, 0);
                        minT.offer(0);
                    }
                }
            } else {
                boolean flag = minT.isEmpty() || minT.peek() > time;
                out.println(flag ? "YES" : "NO");
            }
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

