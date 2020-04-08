package lpf.learn.interview_guide.chapter1;

import java.util.Stack;

/**
 * 设计一个有getMin功能的栈：实现一个特殊的栈，在实现栈的基本功能上，在实现一个返回栈最小元素的操作。
 *
 * 要求：
 *      1、pop、push、getMin操作的时间复杂的都是O（1）.
 *      2、设计的栈类型可以使用现成的栈结构
 *
 * 设计：
 *      在这个gitMin栈中使用了两个栈，一个用于存储数据的普通栈（stackData），另一个用于存储当前步骤的最小值(stackMin)。
 *
 *
 *
 * @author liupf
 * @create 2020-04-07 22:28
 */
public class MinStack {


    /**
     * 策略一 ： 在压入数据时，不重复压入
     * 稍省空间，但是弹出操作稍费时间
     */
    private static class MyStack1{
        private Stack<Integer> stackData;
        private Stack<Integer> stackMin;

        public MyStack1(){
            this.stackData = new Stack<Integer>();
            this.stackMin = new Stack<Integer>();
        }

        /**
         * 在压入数据时：
         *   如果为空，则 num 压入 stackMin
         *   如果不为空，则比较 num 与 stackMin 的栈顶元素哪个更小：
         *      如果 num 更小或者相等（等于也压入是为了弹出），则 num 压入栈送，反之 stackMin 不压入任何内容
         *
         * @param num
         */
        public void push(int num){
            if (this.stackMin.isEmpty()){
                this.stackMin.push(num);
            } else if (num <= this.getmin()){
                this.stackMin.push(num);
            }
            this.stackData.push(num);
        }

        /**
         * 在弹出数据时：
         *   由于压入规则可知 stackMin 中的元素是 从栈低到栈顶逐渐变小，所以弹出的数据只会比栈顶元素大或者相等，
         *   如果是相等则需要将 stackMin 栈顶也消除一个，因为这是压入时重复压入的。
         */
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

        /**
         * 获取最小值 即 stackMin 的栈顶元素
         * @return
         */
        public int getmin(){
            if (this.stackMin.isEmpty()){
                throw new RuntimeException();
            }
            return this.stackMin.peek();
        }
    }


    /**
     * 策略二 ： 在压入数据时，重复压入
     * 稍费空间，但是弹出操作稍省时间
     */
    private static class MyStack2{
        private Stack<Integer> stackData;
        private Stack<Integer> stackMin;

        public MyStack2(){
            this.stackData = new Stack<Integer>();
            this.stackMin = new Stack<Integer>();
        }

        /**
         * 在压入数据时：
         *   如果为空，则 num 压入 stackMin
         *   如果不为空，则将 num 与 stackMin 的栈顶元素更小的压入 stackMin
         * @param num
         */
        public void push(int num){
            if (this.stackMin.isEmpty()){
                this.stackMin.push(num);
            } else {
                this.stackMin.push(Math.min(num, this.getmin()));
            }
            this.stackData.push(num);
        }

        /**
         * 在弹出数据时：
         *   由于压入规则可知 stackMin 中的元素是 从栈低到栈顶逐渐变小，所以弹出的数据只会比栈顶元素大或者相等，
         *   因为重复压入了，所以每一步都有一个 stackMin 对应位置表示当前步骤的最小值，所以也要弹出
         */
        public int pop(){
            if (this.stackData.isEmpty()){
                throw new RuntimeException();
            }
            this.stackMin.pop();
            return this.stackData.pop();
        }

        /**
         * 获取最小值 即 stackMin 的栈顶元素
         * @return
         */
        public int getmin(){
            if (this.stackMin.isEmpty()){
                throw new RuntimeException();
            }
            return this.stackMin.peek();
        }
    }


}
