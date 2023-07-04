package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

public class Q1051C {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] s = new int[n];

        for (int i = 0; i < n; i++) s[i] = sc.nextInt();

        char[] solve = solve(n, s);
        if (solve == null) {
            out.println("NO");
        } else {
            out.println("YES");
            for (char c : solve) out.print(c);
        }

        out.close();
    }

    private static char[] solve(int n, int[] s) {
        Map<Integer, Set<Integer>> maps = new HashMap<>();
        for (int i = 0; i < n; i++) maps.computeIfAbsent(s[i], key -> new HashSet<>()).add(i);

        boolean flag = true, isNum = true;
        Set<Integer> setA = new HashSet<>(), setB = new HashSet<>();

        for (Map.Entry<Integer, Set<Integer>> entry : maps.entrySet()) {
            Set<Integer> value = entry.getValue();
            if (value.size() != 1) {
                if (value.size() > 2) isNum = false;
                continue;
            }
            if (flag) setA.add(entry.getKey());
            else setB.add(entry.getKey());
            flag = !flag;
        }

        if (setA.size() != setB.size() && isNum) return null;

        char[] res = new char[n];
        Arrays.fill(res, 'A');

        for (Integer i : setB) {
            for (Integer j : maps.get(i)) res[j] = 'B';
        }
        if (setA.size() != setB.size()) {
            for (Set<Integer> value : maps.values()) {
                if (value.size() > 2) {
                    res[value.stream().findFirst().get().intValue()] = 'B';
                    break;
                }
            }
        }
        return res;
    }
}
