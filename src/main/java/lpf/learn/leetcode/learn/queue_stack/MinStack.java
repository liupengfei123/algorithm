package lpf.learn.leetcode.learn.queue_stack;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> value;
    private Stack<Integer> min;


    public MinStack() {
        value = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        if (min.isEmpty()) {
            min.push(x);
        } else {
            min.push(Math.min(getMin(), x));
        }
        value.push(x);
    }

    public void pop() {
        if (value.isEmpty()) {
            throw new RuntimeException();
        }
        value.pop();
        min.pop();
    }

    public int top() {
        if (value.isEmpty()) {
            throw new RuntimeException();
        }
        return value.peek();
    }

    public int getMin() {
        if (min.isEmpty()) {
            throw new RuntimeException();
        }
        return min.peek();
    }
}
