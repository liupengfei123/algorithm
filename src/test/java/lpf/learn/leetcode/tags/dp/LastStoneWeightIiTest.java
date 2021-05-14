package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class LastStoneWeightIiTest {
    @Test
    public void test1(){
        LastStoneWeightIi test = new LastStoneWeightIi();
        Assert.assertEquals(1, test.lastStoneWeightII(new int[]{2,7,4,1,8,1}));
    }

    @Test
    public void test2(){
        LastStoneWeightIi test = new LastStoneWeightIi();
        Assert.assertEquals(0, test.lastStoneWeightII(new int[]{2,7,4,1,8}));
    }

    @Test
    public void test3(){
        LastStoneWeightIi test = new LastStoneWeightIi();
        Assert.assertEquals(0, test.lastStoneWeightII(new int[]{2,7,4,1}));
    }

    @Test
    public void test4(){
        LastStoneWeightIi test = new LastStoneWeightIi();
        Assert.assertEquals(1, test.lastStoneWeightII(new int[]{6,2,2,6,5,7,7}));
    }

    @Test
    public void test5(){
        LastStoneWeightIi test = new LastStoneWeightIi();
        Assert.assertEquals(5, test.lastStoneWeightII(new int[]{31,26,33,21,40}));
    }

    @Test
    public void test6(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(0, test.numberOfArithmeticSlices(new int[]{1, 1, 2, 5, 7}));
    }



}
