package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class Q547B {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = sc.nextInt();

        int[] res = run(n, array);
        for (int i = 1; i <= n; i++) out.print(res[i] + " ");

        out.flush();
    }

    private static int[] run(int n, int[] array) {
        int[] left = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < n; i++) {
            while (stack.size() > 1 && array[stack.peek()] >= array[i]) stack.pop();

            left[i] = stack.peek();
            stack.push(i);
        }

        stack = new Stack<>();
        stack.push(n);
        int[] right = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (stack.size() > 1 && array[stack.peek()] >= array[i]) stack.pop();

            right[i] = stack.peek();
            stack.push(i);
        }

        int[] res = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int size = right[i] - left[i] - 1;
            res[size] = Math.max(res[size], array[i]);
        }
        for (int i = n - 1; i >= 0; i--) res[i] = Math.max(res[i], res[i + 1]);
        return res;
    }
}
