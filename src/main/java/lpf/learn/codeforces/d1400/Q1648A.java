package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

public class Q1648A {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) a[i][j] = sc.nextInt();
        }

        out.println(solve(n, m, a));
        out.close();
    }


    private static long solve(int n, int m, int[][] a) {
        Map<Integer, List<Integer>> rowMap = new HashMap<>();
        Map<Integer, List<Integer>> colMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                List<Integer> row = rowMap.computeIfAbsent(a[i][j], key -> new ArrayList<>());
                row.add(i);

                List<Integer> col = colMap.computeIfAbsent(a[i][j], key -> new ArrayList<>());
                col.add(j);
            }
        }

        long res = getAbsValue(rowMap);
        res += getAbsValue(colMap);

        return res;
    }

    private static long getAbsValue(Map<Integer, List<Integer>> map) {
        long res = 0;
        for (List<Integer> value : map.values()) {
            Collections.sort(value);
            long sum = 0;
            for (int i = 0; i < value.size(); i++) {
                long v = value.get(i);
                res += v * i - sum;
                sum += v;
            }
        }
        return res;
    }
}
