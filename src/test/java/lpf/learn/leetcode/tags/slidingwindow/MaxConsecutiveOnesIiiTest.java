package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveOnesIiiTest {
    @Test
    public void test1() {
        MaxConsecutiveOnesIii test = new MaxConsecutiveOnesIii();
        Assert.assertEquals(6, test.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
    }

    @Test
    public void test2() {
        MaxConsecutiveOnesIii test = new MaxConsecutiveOnesIii();
        Assert.assertEquals(10, test.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
    }

    @Test
    public void test3() {
        MaxConsecutiveOnesIii test = new MaxConsecutiveOnesIii();
        Assert.assertEquals(3, test.longestOnes(new int[]{0, 0, 0, 0, 0, 0, 0, 0}, 3));
    }

    @Test
    public void test4() {
        MaxConsecutiveOnesIii test = new MaxConsecutiveOnesIii();
        Assert.assertEquals(4, test.longestOnes(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1}, 3));
    }

    @Test
    public void test5() {
        MaxConsecutiveOnesIii test = new MaxConsecutiveOnesIii();
        Assert.assertEquals(9, test.longestOnes(new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1}, 6));
    }


    @Test
    public void test6() {
        MaxConsecutiveOnesIii test = new MaxConsecutiveOnesIii();
        Assert.assertEquals(32, test.longestOnes(new int[]{1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1}, 9));
    }


    @Test
    public void test7() {
        MaxConsecutiveOnesIii test = new MaxConsecutiveOnesIii();
        Assert.assertEquals(15, test.longestOnes(new int[]{1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, 3));
    }
}
