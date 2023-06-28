package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MinimumIncompatibilityTest {
    @Test
    public void test1(){
        MinimumIncompatibility test = new MinimumIncompatibility();
        Assert.assertEquals(2, test.minimumIncompatibility(new int[]{1, 2, 3, 4},2));
    }

    @Test
    public void test2(){
        MinimumIncompatibility test = new MinimumIncompatibility();
        Assert.assertEquals(4, test.minimumIncompatibility(new int[]{1,2,1,4},2));
    }

    @Test
    public void test3(){
        MinimumIncompatibility test = new MinimumIncompatibility();
        Assert.assertEquals(6, test.minimumIncompatibility(new int[]{6,3,8,1,3,1,2,2},4));
    }

    @Test
    public void test4(){
        MinimumIncompatibility test = new MinimumIncompatibility();
        Assert.assertEquals(-1, test.minimumIncompatibility(new int[]{5,3,3,6,3,3},3));
    }

    @Test
    public void test5(){
        MinimumIncompatibility test = new MinimumIncompatibility();
        Assert.assertEquals(-1, test.minimumIncompatibility(new int[]{5,2,5,2,1},1));
    }
}
