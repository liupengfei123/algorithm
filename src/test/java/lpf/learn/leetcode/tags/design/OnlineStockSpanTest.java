package lpf.learn.leetcode.tags.design;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class OnlineStockSpanTest {

    @Test
    public void test1() {
        OnlineStockSpan temp = new OnlineStockSpan();
        Assert.assertEquals(1, temp.next(100));
        Assert.assertEquals(1, temp.next(80));
        Assert.assertEquals(1, temp.next(60));
        Assert.assertEquals(2, temp.next(70));
        Assert.assertEquals(1, temp.next(60));
        Assert.assertEquals(4, temp.next(75));
        Assert.assertEquals(6, temp.next(85));
    }

    @Test
    public void test2() {
        OnlineStockSpan temp = new OnlineStockSpan();
        Assert.assertEquals(1, temp.next(100));
        Assert.assertEquals(1, temp.next(80));
        Assert.assertEquals(1, temp.next(60));
        Assert.assertEquals(2, temp.next(70));
        Assert.assertEquals(1, temp.next(60));
        Assert.assertEquals(4, temp.next(75));
        Assert.assertEquals(6, temp.next(85));

        Assert.assertEquals(8, temp.next(120));
        Assert.assertEquals(1, temp.next(15));
        Assert.assertEquals(10, temp.next(125));
    }

    @Test
    public void test3() {
        OnlineStockSpan temp = new OnlineStockSpan();
        Assert.assertEquals(1, temp.next(100));
        Assert.assertEquals(1, temp.next(80));
        Assert.assertEquals(1, temp.next(60));
        Assert.assertEquals(2, temp.next(70));
        Assert.assertEquals(1, temp.next(60));
        Assert.assertEquals(4, temp.next(75));
        Assert.assertEquals(1, temp.next(5));

        Assert.assertEquals(2, temp.next(25));
        Assert.assertEquals(1, temp.next(12));
        Assert.assertEquals(8, temp.next(79));

        Assert.assertEquals(10, temp.next(81));
        Assert.assertEquals(1, temp.next(45));
        Assert.assertEquals(1, temp.next(32));
    }
}
