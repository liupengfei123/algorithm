package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Q1095E {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();sc.nextLine();
        char[] chars = sc.nextLine().toCharArray();

        out.println(run(n, chars));
        out.close();
    }

    private static int run(int n, char[] cs) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (cs[i] == ')' && !stack.isEmpty() && cs[stack.peek()] == '(') {
                stack.pop();
            } else {
                stack.push(i);
            }
        }
        if (stack.size() != 2 || cs[stack.peekLast()] != cs[stack.peekFirst()]) return 0;

        int res = 0;
        if (cs[stack.peekFirst()] == '(') {
            for (int i = stack.peekFirst(); i < n; i++) {
                if (cs[i] == '(') res++;
            }
        } else {
            for (int i = 0; i <= stack.peekLast(); i++) {
                if (cs[i] == ')') res++;
            }
        }
        return res;
    }
}
