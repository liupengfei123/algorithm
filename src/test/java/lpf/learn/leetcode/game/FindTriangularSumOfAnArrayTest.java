package lpf.learn.leetcode.game;

import org.junit.Assert;
import org.junit.Test;

public class FindTriangularSumOfAnArrayTest {
    @Test
    public void test1(){
        FindTriangularSumOfAnArray test = new FindTriangularSumOfAnArray();
        Assert.assertEquals(8, test.triangularSum(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test2(){
        FindTriangularSumOfAnArray test = new FindTriangularSumOfAnArray();
        Assert.assertEquals(5, test.triangularSum(new int[]{5}));
    }

    @Test
    public void test3(){
        MinimumBitFlipstoConvertNumber test = new MinimumBitFlipstoConvertNumber();
        Assert.assertEquals(2, test.minBitFlips(3, 10));
    }

}
