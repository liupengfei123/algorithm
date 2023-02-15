package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1213D2 {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer, Integer>[] maps = new Map[200000 + 1];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            max = Math.max(max, value);

            Map<Integer, Integer> map = maps[value];
            if (map == null) {
                map = new LinkedHashMap<>();
                maps[value] = map;
            }
            map.merge(0, 1, Integer::sum);
        }

        int res = Integer.MAX_VALUE;
        for (int i = max; i > 0; i--) {
            Map<Integer, Integer> map = maps[i];
            if (map == null) continue;

            int s = 0, left = k;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (left <= entry.getValue()) {
                    res = Math.min(res, s + left * entry.getKey());
                    break;
                }
                s += entry.getKey() * entry.getValue();
                left -= entry.getValue();
            }
            int i2 = i >> 1;
            Map<Integer, Integer> map2 = maps[i2];
            if (map2 == null) {
                map2 = new LinkedHashMap<>();
                map2.merge(0, 0, Integer::sum);
                maps[i2] = map2;
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                map2.merge(entry.getKey() + 1, entry.getValue(), Integer::sum);
            }
        }
        out.println(res);
        out.close();
    }
}
