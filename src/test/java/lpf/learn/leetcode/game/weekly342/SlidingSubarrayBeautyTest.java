package lpf.learn.leetcode.game.weekly342;

import org.junit.Assert;
import org.junit.Test;

public class SlidingSubarrayBeautyTest {
    @Test
    public void test1(){
        SlidingSubarrayBeauty test = new SlidingSubarrayBeauty();
        Assert.assertArrayEquals(new int[]{-1,-2,-2}, test.getSubarrayBeauty(new int[]{1,-1,-3,-2,3}, 3, 2));
    }

    @Test
    public void test2(){
        SlidingSubarrayBeauty test = new SlidingSubarrayBeauty();
        Assert.assertArrayEquals(new int[]{-1,-2,-3,-4}, test.getSubarrayBeauty(new int[]{-1,-2,-3,-4,-5}, 2, 2));
    }

    @Test
    public void test3(){
        SlidingSubarrayBeauty test = new SlidingSubarrayBeauty();
        Assert.assertArrayEquals(new int[]{-3,0,-3,-3,-3}, test.getSubarrayBeauty(new int[]{-3,1,2,-3,0,-3}, 2, 1));
    }

}
