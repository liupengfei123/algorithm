package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class OrderlyQueueTest {

    @Test
    public void test1(){
        OrderlyQueue test = new OrderlyQueue();
        Assert.assertEquals("acb", test.orderlyQueue("cba", 1));
    }

    @Test
    public void test2(){
        OrderlyQueue test = new OrderlyQueue();
        Assert.assertEquals("aaabc", test.orderlyQueue("baaca", 3));
    }
}
