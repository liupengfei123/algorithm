package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q620C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        List<int[]> res = solve(n, a);
        if (res.isEmpty()) {
            out.println(-1);
        } else {
            out.println(res.size());
            for (int[] v : res) out.println((v[0] + 1) + " " + (v[1] + 1));
        }

        out.println();
        out.close();
    }

    private static List<int[]> solve(int n, int[] a) {
        List<int[]> res = new ArrayList<>();
        Map<Integer, Integer> indexMap = new HashMap<>();
        int begin = 0;
        for (int i = 0; i < n; i++) {
            if (indexMap.containsKey(a[i])) {
                res.add(new int[]{begin, i});
                begin = i + 1;
                indexMap.clear();
            } else {
                indexMap.put(a[i], i);
            }
        }
        if (begin < n && !res.isEmpty()) res.get(res.size() - 1)[1] = n - 1;
        return res;
    }
}
