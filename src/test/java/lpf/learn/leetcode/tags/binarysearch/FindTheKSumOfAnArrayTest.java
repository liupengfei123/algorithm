package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class FindTheKSumOfAnArrayTest {
    @Test
    public void test1(){
        FindTheKSumOfAnArray test = new FindTheKSumOfAnArray();
        Assert.assertEquals(2, test.kSum(new int[]{2,4,-2}, 5));
    }

    @Test
    public void test2(){
        FindTheKSumOfAnArray test = new FindTheKSumOfAnArray();
        Assert.assertEquals(10, test.kSum(new int[]{1,-2,3,4,-10,12}, 16));
    }
}
