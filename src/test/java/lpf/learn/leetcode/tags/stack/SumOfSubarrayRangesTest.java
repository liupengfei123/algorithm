package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class SumOfSubarrayRangesTest {

    @Test
    public void test1(){
        SumOfSubarrayRanges test = new SumOfSubarrayRanges();
        Assert.assertEquals(4, test.subArrayRanges(new int[]{1,2,3}));
    }

    @Test
    public void test2(){
        SumOfSubarrayRanges test = new SumOfSubarrayRanges();
        Assert.assertEquals(4, test.subArrayRanges(new int[]{1,3,3}));
    }

    @Test
    public void test3(){
        SumOfSubarrayRanges test = new SumOfSubarrayRanges();
        Assert.assertEquals(59, test.subArrayRanges(new int[]{4,-2,-3,4,1}));
    }

    @Test
    public void test4(){
        SumOfSubarrayRanges test = new SumOfSubarrayRanges();
        Assert.assertEquals(12242, test.subArrayRanges(new int[]{-1,53,1,4,6,7,-14,67,1,4,67,9,-3,5,0,1,4,7,8,10,-10}));
    }
}
