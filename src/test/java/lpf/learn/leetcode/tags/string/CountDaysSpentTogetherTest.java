package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class CountDaysSpentTogetherTest {

    @Test
    public void test1() {
        CountDaysSpentTogether temp = new CountDaysSpentTogether();
        Assert.assertEquals(3, temp.countDaysTogether("08-15", "08-18", "08-16", "08-19"));
    }

    @Test
    public void test2() {
        CountDaysSpentTogether temp = new CountDaysSpentTogether();
        Assert.assertEquals(0, temp.countDaysTogether("10-01", "10-31", "11-01", "12-31"));
    }

    @Test
    public void test3() {
        CountDaysSpentTogether temp = new CountDaysSpentTogether();
        Assert.assertEquals(1, temp.countDaysTogether("10-01", "10-01", "10-01", "10-01"));
    }

    @Test
    public void test4() {
        CountDaysSpentTogether temp = new CountDaysSpentTogether();
        Assert.assertEquals(0, temp.countDaysTogether("10-20", "12-22", "06-21", "07-05"));
    }

    @Test
    public void test5() {
        CountDaysSpentTogether temp = new CountDaysSpentTogether();
        Assert.assertEquals(49, temp.countDaysTogether("09-01", "10-19", "06-19", "10-20"));
    }
}
