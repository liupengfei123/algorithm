package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Q808D {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] array = new long[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        out.println(run(n, array));
        out.close();
    }

    private static String run(int n, long[] array) {
        Map<Long, Integer> map = new HashMap<>(n);
        long sum = 0;
        for (long i : array) {
            sum += i;
            map.merge(i, 1, Integer::sum);
        }
        if ((sum & 1) == 1)
            return "NO";

        long target = sum >>> 1;
        long tempSum = 0;
        Set<Long> set = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            tempSum += array[i];
            set.add(array[i]);
            map.merge(array[i], -1, Integer::sum);

            if (tempSum >= target) {
                if (tempSum == target || set.contains(tempSum - target))
                    return "YES";
            } else {
                if (map.getOrDefault(target - tempSum, 0) > 0)
                    return "YES";
            }
        }
        return "NO";
    }
}
