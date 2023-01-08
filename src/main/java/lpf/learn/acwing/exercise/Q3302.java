package lpf.learn.acwing.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/** 3302. 表达式求值
 给定一个表达式，其中运算符仅包含 +,-,*,/（加 减 乘 整除），可能包含括号，请你求出表达式的最终值。

 注意：
 数据保证给定的表达式合法。
 题目保证符号 - 只作为减号出现，不会作为负号出现，例如，-1+2,(2+2)*(-(1+1)+2) 之类表达式均不会出现。
 题目保证表达式中所有数字均为正整数。
 题目保证表达式在中间计算过程以及结果中，均不超过 231−1。
 题目中的整除是指向 0 取整，也就是说对于大于 0 的结果向下取整，例如 5/3=1，对于小于 0 的结果向上取整，例如 5/(1−4)=−1。
 C++和Java中的整除默认是向零取整；Python中的整除//默认向下取整，因此Python的eval()函数中的整除也是向下取整，在本题中不能直接使用。
 输入格式
 共一行，为给定表达式。

 输出格式
 共一行，为表达式的结果。
 数据范围
 表达式的长度不超过 105。

 输入样例：
 (2+2)*(1+1)
 输出样例：
 8
 */
public class Q3302 {
    private static Scanner sc = new Scanner(System.in);
    private static Stack<Integer> num = new Stack<>();
    private static Stack<Character> op = new Stack<>();

    private static Map<Character, Integer> pr = new HashMap<>();
    static {
        pr.put('+', 1);
        pr.put('-', 1);
        pr.put('*', 2);
        pr.put('/', 2);
    }

    public static void main(String[] args) {
        num = new Stack<>();
        op = new Stack<>();

        char[] chars = sc.nextLine().trim().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                int temp = 0;
                while (i < chars.length && Character.isDigit(chars[i])) {
                    temp = temp * 10 + chars[i++] - '0';
                }
                num.push(temp);
                i--;
                continue;
            }

            char c = chars[i];

            if (c == '(') {
                op.push(c);
            } else if (c == ')') {
                while (op.peek() != '(') eval();
                op.pop();
            } else {
                while (!op.empty() && pr.getOrDefault(op.peek(), 0) >= pr.get(c)) {
                    eval();
                }
                op.push(c);
            }
        }

        while (!op.empty()) {
            eval();
        }

        System.out.println(num.peek());
    }

    private static void eval() {
        Character code = op.pop();

        Integer v2 = num.pop();
        Integer v1 = num.pop();
        int result = 0;

        switch (code) {
            case '+' : result = v1 + v2;break;
            case '-' : result = v1 - v2;break;
            case '*' : result = v1 * v2;break;
            case '/' : result = v1 / v2;break;
        }
        num.push(result);
    }
}
