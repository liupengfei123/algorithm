package lpf.learn.codeforces.d1300;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * https://codeforces.com/contest/318/problem/B
 */
public class Q1585C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            List<Integer> list1 = new ArrayList<>(), list2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                if (temp < 0) {
                    list1.add(temp);
                } else {
                    list2.add(temp);
                }
            }

            out.println(solve(k, list1, list2));
        }
        out.close();
    }


    private static long solve(int k, List<Integer> list1, List<Integer> list2) {
        list1.sort(Comparator.reverseOrder());
        Collections.sort(list2);

        long temp1 = 0, temp2 = 0;
        for (int i = list1.size() - 1; i >= 0; i -= k)
            temp1 -= list1.get(i);
        for (int i = list2.size() - 1; i >= 0; i -= k)
            temp2 += list2.get(i);

        int last1 = list1.isEmpty() ? 0 : -list1.get(list1.size() - 1);
        int last2 = list2.isEmpty() ? 0 : list2.get(list2.size() - 1);

        long res = (temp1 + temp2) * 2;
        if (list1.isEmpty() || last1 < last2) {
            res -= last2;
        } else {
            res -= last1;
        }
        return res;
    }
}
