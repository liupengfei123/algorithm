package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class Q280B {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        out.println(run(n));
        out.close();
    }

    private static long run(int n) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            while (!stack.isEmpty() && stack.peek() < value) {
                result = Math.max(result, stack.pop() ^ value);
            }
            if (!stack.isEmpty()) {
                result = Math.max(result, stack.peek() ^ value);
            }
            stack.push(value);
        }
        return result;
    }
}
