package lpf.learn.acwing.exercise;

import java.io.*;
import java.util.*;
/**
 * 3777. 砖块
 */
public class Q3780 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();sc.nextLine();

        while (t-- > 0) {
            sc.nextLine();
            char[] old = sc.nextLine().toCharArray();

            if (!run('B', old) && !run('W', old)) out.println("-1");
        }
        out.flush();
    }


    private static boolean run(char t, char[] old) {
        int n = old.length;
        char[] chars = new char[n];
        System.arraycopy(old, 0, chars, 0, n);

        List<Integer> step = new ArrayList<>();

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == t) continue;

            chars[i] = t;
            chars[i + 1] = chars[i + 1] == 'W' ? 'B' : 'W';
            step.add(i + 1);
        }
        if (chars[chars.length - 1] != t) return false;

        out.println(step.size());
        for (Integer v : step) out.print(v + " ");
        if (step.size() > 0) out.println();
        return true;
    }
}
