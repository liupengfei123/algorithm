package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class LargestSumOfAveragesTest {
    @Test
    public void test1(){
        LargestSumOfAverages test = new LargestSumOfAverages();
        Assert.assertEquals(20, test.largestSumOfAverages(new int[]{9,1,2,3,9}, 3), 0.000_01);
    }

    @Test
    public void test2(){
        LargestSumOfAverages test = new LargestSumOfAverages();
        Assert.assertEquals(12.75000, test.largestSumOfAverages(new int[]{9,1,2,3,9}, 2), 0.000_01);
    }

    @Test
    public void test3(){
        LargestSumOfAverages test = new LargestSumOfAverages();
        Assert.assertEquals(24, test.largestSumOfAverages(new int[]{9,1,2,3,9}, 5), 0.000_01);
    }

    @Test
    public void test4(){
        LargestSumOfAverages test = new LargestSumOfAverages();
        Assert.assertEquals(4.8, test.largestSumOfAverages(new int[]{9,1,2,3,9}, 1), 0.000_01);
    }
}
