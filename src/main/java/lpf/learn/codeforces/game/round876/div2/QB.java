package lpf.learn.codeforces.game.round876.div2;

import java.io.*;
import java.util.*;

public class QB {
    private static MyScanner sc = new MyScanner();
    private static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            out.println(run(n));
        }
        out.flush();
    }

    private static long run(int n) {
        TreeMap<Integer, PriorityQueue<Integer>> treeMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            treeMap.computeIfAbsent(a, key -> new PriorityQueue<>(Comparator.reverseOrder())).add(b);
        }

        long res = 0;
        int[] cnts = new int[n + 1];
        int cnt = 0, lastValue = 0;
        while (true) {
            Map.Entry<Integer, PriorityQueue<Integer>> entry = treeMap.ceilingEntry(lastValue);
            if (entry == null) break;

            Integer key = entry.getKey();
            PriorityQueue<Integer> value = entry.getValue();
            while (!value.isEmpty()) {
                res += value.poll();
                cnts[key]++;
                Integer temp = treeMap.floorKey(++cnt);
                if (temp != null) {
                    cnt -= cnts[temp];
                    treeMap.remove(temp);
                    break;
                }
            }
            if (value.isEmpty()) lastValue = key + 1;
        }
        return res;
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
