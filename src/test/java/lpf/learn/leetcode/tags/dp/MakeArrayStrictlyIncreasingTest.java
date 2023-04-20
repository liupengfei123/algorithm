package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MakeArrayStrictlyIncreasingTest {
    @Test
    public void test1(){
        MakeArrayStrictlyIncreasing test = new MakeArrayStrictlyIncreasing();
        Assert.assertEquals(0, test.makeArrayIncreasing(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test2(){
        MakeArrayStrictlyIncreasing test = new MakeArrayStrictlyIncreasing();
        Assert.assertEquals(1, test.makeArrayIncreasing(new int[]{1,5,3,6,7}, new int[]{1,3,2,4}));
    }

    @Test
    public void test3(){
        MakeArrayStrictlyIncreasing test = new MakeArrayStrictlyIncreasing();
        Assert.assertEquals(2, test.makeArrayIncreasing(new int[]{1,5,3,6,7}, new int[]{4,3,1}));
    }

    @Test
    public void test4(){
        MakeArrayStrictlyIncreasing test = new MakeArrayStrictlyIncreasing();
        Assert.assertEquals(-1, test.makeArrayIncreasing(new int[]{1,5,3,6,7}, new int[]{1,6,3,3}));
    }

    @Test
    public void test5(){
        MakeArrayStrictlyIncreasing test = new MakeArrayStrictlyIncreasing();
        Assert.assertEquals(5, test.makeArrayIncreasing(new int[]{0,11,6,1,4,3}, new int[]{5,4,11,10,1,0}));
    }

    @Test
    public void test6(){
        MakeArrayStrictlyIncreasing test = new MakeArrayStrictlyIncreasing();
        Assert.assertEquals(2, test.makeArrayIncreasing(new int[]{0,7,4,5,0,8}, new int[]{1, 2, 3, 4,5,6,7}));
    }

    @Test
    public void test7(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(6, test.numberOfArithmeticSlices(new int[]{2, 4, 4, 6, 8}));
    }

    @Test
    public void test8(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(5, test.numberOfArithmeticSlices(new int[]{7,7,7,7}));
    }

    @Test
    public void test9(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(16, test.numberOfArithmeticSlices(new int[]{7,7,7,7,7}));
    }
}
