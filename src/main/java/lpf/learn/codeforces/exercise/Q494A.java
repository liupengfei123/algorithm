package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q494A {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        while (sc.hasNext()) {
            run(sc.next());
            out.flush();
        }
        out.close();
    }

    private static void run(String line) {
        int d = 0, minD = line.length(), cnt = 0;

        for (char c : line.toCharArray()) {
            if (c == '(') {
                d++;
                continue;
            }
            if (--d < 0) {
                out.println(-1);
                return;
            }

            if (c == '#') {
                cnt++;
                minD = d;
            } else if (d < minD) {
                minD = d;
            }
        }
        //最后的 # 到结尾的最小值不能比尾的d小，折线图
        if (minD < d) {
            out.println(-1);
        } else {
            for (int i = 1; i < cnt; i++) {
                out.println(1);
            }
            out.println(d + 1);
        }
    }
}
