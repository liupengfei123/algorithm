package lpf.learn.leetcode.tags.design;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class MyCalendarIiiTest {

    @Test
    public void test1() {
        MyCalendarIii temp = new MyCalendarIii();

        Assert.assertEquals(1, temp.book(10, 20));
        Assert.assertEquals(1, temp.book(50, 60));
        Assert.assertEquals(2, temp.book(10, 40));
        Assert.assertEquals(3, temp.book(5, 15));
        Assert.assertEquals(3, temp.book(5, 10));
        Assert.assertEquals(3, temp.book(25, 55));
    }

    @Test
    public void test2() {
        MyCalendarIii temp = new MyCalendarIii();

        Assert.assertEquals(1, temp.book(10, 20));
        Assert.assertEquals(2, temp.book(10, 40));
        Assert.assertEquals(2, temp.book(50, 60));
        Assert.assertEquals(3, temp.book(5, 15));
        Assert.assertEquals(3, temp.book(5, 10));
        Assert.assertEquals(3, temp.book(25, 55));
    }
}
