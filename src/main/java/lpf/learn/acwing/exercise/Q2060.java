package lpf.learn.acwing.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 2058. 笨拙的手指
 */
public class Q2060 {
    private static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        char[] chars1 = sc.nextLine().toCharArray();
        char[] chars2 = sc.nextLine().toCharArray();

        out.println(run(chars1, chars2));
        out.flush();
    }

    private static int run(char[] chars1, char[] chars2) {
        int v1 = 0, v2 = 0;
        for (int i = 0; i < chars1.length; i++) v1 = v1 * 2 + (chars1[i] - '0');
        for (int i = 0; i < chars2.length; i++) v2 = v2 * 3 + (chars2[i] - '0');

        int temp = v1 - v2;
        Map<Integer, Integer> map = new HashMap<>();

        int j = 1;
        for (int i = chars1.length - 1; i > 0; i--, j <<= 1) {
            if (chars1[i] == '0') map.put(temp + j, j);
            else map.put(temp - j, -j);
        }
        if (chars1[0] == '0') map.put(temp + j, j);

        j = 1;
        for (int i = 1; i < chars2.length; i++) j *= 3;

        for (int i = 0; i < chars2.length; i++, j /= 3) {
            if (chars2[i] == '0') {
                if (map.containsKey(j)) return v1 + map.get(j);
                if (map.containsKey(j * 2)) return v1 + map.get(j * 2);
            }
            if (chars2[i] == '1') {
                if (map.containsKey(-j)) return v1 + map.get(-j);
                if (map.containsKey(j)) return v1 + map.get(j);
            }
            if (chars2[i] == '2') {
                if (map.containsKey(-j)) return v1 + map.get(-j);
                if (map.containsKey(j * -2)) return v1 + map.get(j * -2);
            }
        }
        return 0;
    }

}
