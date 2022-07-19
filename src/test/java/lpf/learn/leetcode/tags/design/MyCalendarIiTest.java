package lpf.learn.leetcode.tags.design;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class MyCalendarIiTest {

    @Test
    public void test1() {
        MyCalendarIi temp = new MyCalendarIi();

        Assert.assertTrue(temp.book(10, 20));
        Assert.assertTrue(temp.book(50, 60));
        Assert.assertTrue(temp.book(10, 40));
        Assert.assertFalse(temp.book(5, 15));
        Assert.assertTrue(temp.book(5, 10));
        Assert.assertTrue(temp.book(25, 55));
    }

    @Test
    public void test2() {
        MyCalendarIi temp = new MyCalendarIi();

        Assert.assertTrue(temp.book(10, 20));
        Assert.assertTrue(temp.book(10, 40));
        Assert.assertTrue(temp.book(50, 60));
        Assert.assertFalse(temp.book(5, 15));
        Assert.assertTrue(temp.book(5, 10));
        Assert.assertTrue(temp.book(25, 55));
    }

    @Test
    public void test3() {
        MyCalendarIi temp = new MyCalendarIi();

        Assert.assertTrue(temp.book(47, 50));
        Assert.assertTrue(temp.book(1, 10));
        Assert.assertTrue(temp.book(27, 36));
        Assert.assertTrue(temp.book(40,47));
        Assert.assertTrue(temp.book(20,27));
        Assert.assertTrue(temp.book(15,23));
        Assert.assertTrue(temp.book(10,18));
        Assert.assertTrue(temp.book(27,36));

        Assert.assertFalse(temp.book(17,25));
        Assert.assertFalse(temp.book(8,17));
        Assert.assertFalse(temp.book(24,33));
        Assert.assertFalse(temp.book(23,28));
        Assert.assertFalse(temp.book(21,27));

        Assert.assertTrue(temp.book(47, 50));

        Assert.assertFalse(temp.book(14,21));
        Assert.assertFalse(temp.book(26,32));
        Assert.assertFalse(temp.book(16,21));

        Assert.assertTrue(temp.book(2, 7));

        Assert.assertFalse(temp.book(24,33));
        Assert.assertFalse(temp.book(6,13));
        Assert.assertFalse(temp.book(44,50));
        Assert.assertFalse(temp.book(33,39));
        Assert.assertFalse(temp.book(30,36));
        Assert.assertFalse(temp.book(6,15));
        Assert.assertFalse(temp.book(21,27));
        Assert.assertFalse(temp.book(49,50));

        Assert.assertTrue(temp.book(38, 45));

        Assert.assertFalse(temp.book(4,12));
        Assert.assertFalse(temp.book(46,50));
        Assert.assertFalse(temp.book(13,21));
    }
}
