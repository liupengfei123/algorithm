package lpf.learn.leetcode.learn.queue_stack;

import org.junit.Assert;
import org.junit.Test;

public class MyCircularQueueTest {

    @Test
    public void test() {
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
        Assert.assertTrue(circularQueue.enQueue(1));
        Assert.assertTrue(circularQueue.enQueue(2));
        Assert.assertTrue(circularQueue.enQueue(3));
        Assert.assertFalse(circularQueue.enQueue(4));

        Assert.assertEquals(3, circularQueue.Rear());
        Assert.assertTrue(circularQueue.isFull());
        Assert.assertTrue(circularQueue.deQueue());
        Assert.assertTrue(circularQueue.enQueue(4));
        Assert.assertEquals(4, circularQueue.Rear());



        MyCircularQueue circularQueue2 = new MyCircularQueue(0); // 设置长度为 3
        Assert.assertFalse(circularQueue2.enQueue(1));
        Assert.assertFalse(circularQueue2.enQueue(2));
        Assert.assertFalse(circularQueue2.enQueue(3));
        Assert.assertFalse(circularQueue2.enQueue(4));

        Assert.assertEquals(-1, circularQueue2.Rear());
        Assert.assertTrue(circularQueue2.isFull());
        Assert.assertFalse(circularQueue2.deQueue());
        Assert.assertFalse(circularQueue2.enQueue(4));
        Assert.assertEquals(-1, circularQueue2.Rear());
    }


}
