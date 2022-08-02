package lpf.learn.leetcode.tags.design;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class DesignCircularQueueTest {

    @Test
    public void test1() {
        DesignCircularQueue circularQueue = new DesignCircularQueue(3);
        Assert.assertTrue(circularQueue.enQueue(1));
        Assert.assertTrue(circularQueue.enQueue(2));
        Assert.assertTrue(circularQueue.enQueue(3));
        Assert.assertFalse( circularQueue.enQueue(4));
        Assert.assertEquals(3, circularQueue.Rear());
        Assert.assertTrue( circularQueue.isFull());
        Assert.assertTrue( circularQueue.deQueue());
        Assert.assertTrue( circularQueue.enQueue(4));
        Assert.assertEquals(4, circularQueue.Rear());
    }

    @Test
    public void test2() {
        DesignCircularQueue circularQueue = new DesignCircularQueue(3);
        Assert.assertTrue(circularQueue.enQueue(1));
        Assert.assertTrue(circularQueue.enQueue(2));
        Assert.assertTrue(circularQueue.enQueue(3));

        Assert.assertEquals(1, circularQueue.Front());

        Assert.assertFalse(circularQueue.enQueue(4));

        Assert.assertEquals(3, circularQueue.Rear());

        Assert.assertTrue(circularQueue.isFull());
        Assert.assertTrue(circularQueue.deQueue());
        Assert.assertTrue(circularQueue.enQueue(4));
        Assert.assertEquals(4, circularQueue.Rear());
        Assert.assertEquals(2, circularQueue.Front());
    }
}
