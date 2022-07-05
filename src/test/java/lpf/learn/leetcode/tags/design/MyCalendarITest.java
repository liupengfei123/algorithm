package lpf.learn.leetcode.tags.design;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class MyCalendarITest {

    @Test
    public void test1() {
        MyCalendarI temp = new MyCalendarI();

        Assert.assertTrue(temp.book(10, 20));
        Assert.assertTrue(temp.book(50, 60));
        Assert.assertFalse(temp.book(10, 40));
        Assert.assertFalse(temp.book(5, 15));
        Assert.assertTrue(temp.book(5, 10));
        Assert.assertFalse(temp.book(25, 55));
    }

    @Test
    public void test2() {
        MyCalendarI temp = new MyCalendarI();
        Assert.assertTrue(temp.book(10, 20));
        Assert.assertFalse(temp.book(15, 25));
        Assert.assertTrue(temp.book(20, 30));
    }

    @Test
    public void test3() {
        MyCalendarI temp = new MyCalendarI();

        Assert.assertTrue(temp.book(47, 50));
        Assert.assertTrue(temp.book(33, 41));
        Assert.assertFalse(temp.book(39, 45));
        Assert.assertFalse(temp.book(33, 42));
        Assert.assertTrue(temp.book(25, 32));
        Assert.assertFalse(temp.book(26, 35));
        Assert.assertTrue(temp.book(19, 25));
        Assert.assertTrue(temp.book(3, 8));
        Assert.assertTrue(temp.book(8, 13));
        Assert.assertFalse(temp.book(18, 27));
    }
}
