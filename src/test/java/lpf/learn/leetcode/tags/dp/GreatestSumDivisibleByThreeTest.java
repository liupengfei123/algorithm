package lpf.learn.leetcode.tags.dp;

import lpf.learn.leetcode.tags.array.BitwiseOrsOfSubarrays;
import org.junit.Assert;
import org.junit.Test;

public class GreatestSumDivisibleByThreeTest {
    @Test
    public void test1(){
        GreatestSumDivisibleByThree test = new GreatestSumDivisibleByThree();
        Assert.assertEquals(18, test.maxSumDivThree(new int[]{3,6,5,1,8}));
    }

    @Test
    public void test2(){
        GreatestSumDivisibleByThree test = new GreatestSumDivisibleByThree();
        Assert.assertEquals(0, test.maxSumDivThree(new int[]{4}));
    }

    @Test
    public void test3(){
        GreatestSumDivisibleByThree test = new GreatestSumDivisibleByThree();
        Assert.assertEquals(12, test.maxSumDivThree(new int[]{1,2,3,4,4}));
    }

    @Test
    public void test4(){
        GreatestSumDivisibleByThree test = new GreatestSumDivisibleByThree();
        Assert.assertEquals(15, test.maxSumDivThree(new int[]{2,6,2,2,7}));
    }

    @Test
    public void test5(){
        BitwiseOrsOfSubarrays test = new BitwiseOrsOfSubarrays();
        Assert.assertEquals(1, test.subarrayBitwiseORs(new int[]{7, 7, 7, 7}));
    }

    @Test
    public void test6(){
        BitwiseOrsOfSubarrays test = new BitwiseOrsOfSubarrays();
        Assert.assertEquals(23, test.subarrayBitwiseORs(new int[]{1,1,2,4,6,3,6,1,72,8,61,7,4,8,7,9,11,23,51,39,3}));
    }



}
