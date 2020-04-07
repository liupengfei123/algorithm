package lpf.learn.interview_guide.chapter1;

import java.util.Stack;

/**
 * 设计一个有getMin功能的栈：实现一个特殊的栈，在实现栈的基本功能上，在实现一个返回栈最小元素的操作。
 *
 * 要求：
 *      1、pop、push、getMin操作的时间复杂的都是O（1）.
 *      2、设计的栈类型可以使用现成的栈结构
 *
 *
 *
 *
 *
 * @author liupf
 * @create 2020-04-07 22:28
 */
public class MinStack {




    private static class MyStack1{
        private Stack<Integer> stackData;
        private Stack<Integer> stackMin;

        public MyStack1(){
            this.stackData = new Stack<Integer>();
            this.stackMin = new Stack<Integer>();
        }

        public void push(int num){
            if (this.stackMin.isEmpty()){
                this.stackMin.push(num);
            } else if (num <= this.getmin()){
                this.stackMin.push(num);
            }
            this.stackData.push(num);
        }

        public int pop(){
            if (this.stackData.isEmpty()){
                throw new RuntimeException();
            }
            int value = this.stackData.pop();
            if (value == this.getmin()){
                this.stackMin.pop();
            }
            return value;
        }

        public int getmin(){
            if (this.stackMin.isEmpty()){
                throw new RuntimeException();
            }
            return this.stackMin.peek();
        }

    }


}
