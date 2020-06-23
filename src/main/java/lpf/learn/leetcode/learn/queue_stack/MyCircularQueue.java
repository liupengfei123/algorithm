package lpf.learn.leetcode.learn.queue_stack;

/**
 * 设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。
 * 循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。但是使用循环队列，我们能使用这些空间去存储新的值。
 */
public class MyCircularQueue {
    private int[] array;
    private int capacity, index, count;


    /** 构造器，设置队列长度为 k  */
    public MyCircularQueue(int k) {
        this.capacity = k;
        this.array = new int[k];
    }

    /** 向循环队列插入一个元素。如果成功插入则返回真 */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        array[(index + count) % capacity] = value;
        count++;
        return true;
    }

    /** 从循环队列中删除一个元素。如果成功删除则返回真 */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        index = ++index % capacity;
        count--;
        return true;
    }

    /** 从队首获取元素。如果队列为空，返回 -1  */
    public int Front() {
        int result = -1;
        if (!isEmpty()) {
            result = array[index];
        }
        return result;
    }

    /** 获取队尾元素。如果队列为空，返回 -1 */
    public int Rear() {
        int result = -1;
        if (!isEmpty()) {
            result = array[(index + count - 1) % capacity];
        }
        return result;
    }

    /** 检查循环队列是否为空。 */
    public boolean isEmpty() {
        return count == 0;
    }

    /** 检查循环队列是否已满。 */
    public boolean isFull() {
        return count == capacity;
    }
}
