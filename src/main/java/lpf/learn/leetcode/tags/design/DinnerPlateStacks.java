package lpf.learn.leetcode.tags.design;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/**
 * 1172 餐盘栈
 * <p>我们把无限数量 &infin; 的栈排成一行，按从左到右的次序从 0 开始编号。每个栈的的最大容量&nbsp;<code>capacity</code> 都相同。</p>
 * <p>实现一个叫「餐盘」的类&nbsp;<code>DinnerPlates</code>：</p>
 * <ul>
 * <li><code>DinnerPlates(int capacity)</code>&nbsp;- 给出栈的最大容量&nbsp;<code>capacity</code>。</li>
 * <li><code>void push(int val)</code>&nbsp;- 将给出的正整数&nbsp;<code>val</code>&nbsp;推入&nbsp;<strong>从左往右第一个&nbsp;</strong>没有满的栈。</li>
 * <li><code>int pop()</code>&nbsp;- 返回&nbsp;<strong>从右往左第一个&nbsp;</strong>非空栈顶部的值，并将其从栈中删除；如果所有的栈都是空的，请返回&nbsp;<code>-1</code>。</li>
 * <li><code>int popAtStack(int index)</code>&nbsp;- 返回编号&nbsp;<code>index</code>&nbsp;的栈顶部的值，并将其从栈中删除；如果编号&nbsp;<code>index</code>&nbsp;的栈是空的，请返回 <code>-1</code>。</li>
 * </ul>
 *
 * <p><strong>示例：</strong></p>
 * <pre><strong>输入： </strong>
 * [&quot;DinnerPlates&quot;,&quot;push&quot;,&quot;push&quot;,&quot;push&quot;,&quot;push&quot;,&quot;push&quot;,&quot;popAtStack&quot;,&quot;push&quot;,&quot;push&quot;,&quot;popAtStack&quot;,&quot;popAtStack&quot;,&quot;pop&quot;,&quot;pop&quot;,&quot;pop&quot;,&quot;pop&quot;,&quot;pop&quot;]
 * [[2],[1],[2],[3],[4],[5],[0],[20],[21],[0],[2],[],[],[],[],[]]
 * <strong>输出：</strong>
 * [null,null,null,null,null,null,2,null,null,20,21,5,4,3,1,-1]
 *
 * <strong>解释：</strong>
 * DinnerPlates D = DinnerPlates(2);  // 初始化，栈最大容量 capacity = 2
 * D.push(1);
 * D.push(2);
 * D.push(3);
 * D.push(4);
 * D.push(5);         // 栈的现状为：    2 &nbsp;4
 * &nbsp;                                   1 &nbsp;3 &nbsp;5
 * ﹈ ﹈ ﹈
 * D.popAtStack(0);   // 返回 2。栈的现状为：     &nbsp;4
 * &nbsp;                             1 &nbsp;3 &nbsp;5
 * ﹈ ﹈ ﹈
 * D.push(20);        // 栈的现状为：  20  4
 * &nbsp;                                  1 &nbsp;3 &nbsp;5
 * ﹈ ﹈ ﹈
 * D.push(21);        // 栈的现状为：  20  4 21
 * &nbsp;                                  1 &nbsp;3 &nbsp;5
 * ﹈ ﹈ ﹈
 * D.popAtStack(0);   // 返回 20。栈的现状为：       4 21
 * &nbsp;                              1 &nbsp;3 &nbsp;5
 * ﹈ ﹈ ﹈
 * D.popAtStack(2);   // 返回 21。栈的现状为：       4
 * &nbsp;                              1 &nbsp;3 &nbsp;5
 * ﹈ ﹈ ﹈
 * D.pop()            // 返回 5。栈的现状为：        4
 * &nbsp;                              1 &nbsp;3
 * ﹈ ﹈
 * D.pop()            // 返回 4。栈的现状为：    1  3
 * ﹈ ﹈
 * D.pop()            // 返回 3。栈的现状为：    1
 * ﹈
 * D.pop()            // 返回 1。现在没有栈。
 * D.pop()            // 返回 -1。仍然没有栈。
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * <li><code>1 &lt;= capacity&nbsp;&lt;= 20000</code></li>
 * <li><code>1 &lt;= val&nbsp;&lt;= 20000</code></li>
 * <li><code>0 &lt;= index&nbsp;&lt;= 100000</code></li>
 * <li>最多会对&nbsp;<code>push</code>，<code>pop</code>，和&nbsp;<code>popAtStack</code>&nbsp;进行 <code>200000</code> 次调用。</li>
 * </ul>
 */
public class DinnerPlateStacks {

    private final int capacity;
    private final List<Integer> stack;
    private final List<Integer> top;
    private final TreeSet<Integer> poppedPos;

    public DinnerPlateStacks(int capacity) {
        this.capacity = capacity;
        this.stack = new LinkedList<>();
        this.top = new ArrayList<>();
        this.poppedPos = new TreeSet<>();
    }

    public void push(int val) {
        if (poppedPos.isEmpty()) {
            int pos = stack.size();
            stack.add(val);
            if (pos % capacity == 0) {
                top.add(0);
            } else {
                int stackPos = top.size() - 1;
                int stackTop = top.get(stackPos);
                top.set(stackPos, stackTop + 1);
            }
        } else {
            int pos = poppedPos.pollFirst();
            stack.set(pos, val);
            int index = pos / capacity;
            int stackTop = top.get(index);
            top.set(index, stackTop + 1);
        }
    }

    public int pop() {
        while (!stack.isEmpty() && poppedPos.contains(stack.size() - 1)) {
            stack.remove(stack.size() - 1);
            int pos = poppedPos.pollLast();
            if (pos % capacity == 0) {
                top.remove(top.size() - 1);
            }
        }
        if (stack.isEmpty()) {
            return -1;
        } else {
            int pos = stack.size() - 1;
            int val = stack.get(pos);
            stack.remove(pos);
            int index = top.size() - 1;
            if (pos % capacity == 0) {
                top.remove(index);
            } else {
                top.set(index, index - 1);
            }
            return val;
        }
    }

    public int popAtStack(int index) {
        if (index >= top.size()) {
            return -1;
        }
        int stackTop = top.get(index);
        if (stackTop < 0) {
            return -1;
        }
        top.set(index, stackTop - 1);
        int pos = index * capacity + stackTop;
        poppedPos.add(pos);
        return stack.get(pos);
    }

}
