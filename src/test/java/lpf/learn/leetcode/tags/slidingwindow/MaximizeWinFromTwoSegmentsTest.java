package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class MaximizeWinFromTwoSegmentsTest {
    @Test
    public void test1() {
        MaximizeWinFromTwoSegments test = new MaximizeWinFromTwoSegments();
        Assert.assertEquals(7, test.maximizeWin(new int[]{1,1,2,2,3,3,5}, 2));
    }

    @Test
    public void test2() {
        MaximizeWinFromTwoSegments test = new MaximizeWinFromTwoSegments();
        Assert.assertEquals(2, test.maximizeWin(new int[]{1,2,3,4}, 0));
    }

    @Test
    public void test3() {
        MaximizeWinFromTwoSegments test = new MaximizeWinFromTwoSegments();
        Assert.assertEquals(7, test.maximizeWin(new int[]{1,1,2,2,3,3,5}, 5));
    }

    @Test
    public void test4() {
        MaximizeWinFromTwoSegments test = new MaximizeWinFromTwoSegments();
        Assert.assertEquals(10, test.maximizeWin(new int[]{1,1,2,2,3,3,5,8,8,8,8}, 2));
    }
}
