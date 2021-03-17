package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class PartitionEqualSubsetSumTest {
    @Test
    public void test1(){
        PartitionEqualSubsetSum test = new PartitionEqualSubsetSum();
        Assert.assertTrue(test.canPartition(new int[]{1, 5, 11, 5}));
    }

    @Test
    public void test2(){
        PartitionEqualSubsetSum test = new PartitionEqualSubsetSum();
        Assert.assertFalse(test.canPartition(new int[]{1, 2, 3, 5}));
    }

    @Test
    public void test3(){
        PartitionEqualSubsetSum test = new PartitionEqualSubsetSum();
        Assert.assertTrue(test.canPartition(new int[]{1, 5, 11, 5, 2, 4}));
    }

    @Test
    public void test4(){
        PartitionEqualSubsetSum test = new PartitionEqualSubsetSum();
        Assert.assertFalse(test.canPartition(new int[]{1, 5, 11, 5, 2, 6}));
    }

    @Test
    public void test5(){
        PartitionEqualSubsetSum test = new PartitionEqualSubsetSum();
        Assert.assertFalse(test.canPartition(new int[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,99,97}));
    }

    @Test
    public void test6(){
        IntegerBreak test = new IntegerBreak();
        Assert.assertEquals(108, test.integerBreak(13));
    }




}
