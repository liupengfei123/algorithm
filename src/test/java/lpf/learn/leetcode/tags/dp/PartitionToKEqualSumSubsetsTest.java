package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class PartitionToKEqualSumSubsetsTest {
    @Test
    public void test1(){
        PartitionToKEqualSumSubsets test = new PartitionToKEqualSumSubsets();
        Assert.assertTrue(test.canPartitionKSubsets(new int[]{1, 2, 3, 4}, 2));
    }

    @Test
    public void test2(){
        PartitionToKEqualSumSubsets test = new PartitionToKEqualSumSubsets();
        Assert.assertTrue(test.canPartitionKSubsets(new int[]{4, 3, 2, 3, 5, 2, 1}, 4));
    }

    @Test
    public void test3(){
        PartitionToKEqualSumSubsets test = new PartitionToKEqualSumSubsets();
        Assert.assertTrue(test.canPartitionKSubsets(new int[]{3, 3, 3, 3, 3, 3}, 3));
    }

    @Test
    public void test4(){
        PartitionToKEqualSumSubsets test = new PartitionToKEqualSumSubsets();
        Assert.assertFalse(test.canPartitionKSubsets(new int[]{4, 3, 2, 3, 5, 2, 1}, 3));
    }

    @Test
    public void test5(){
        PartitionToKEqualSumSubsets test = new PartitionToKEqualSumSubsets();
        Assert.assertFalse(test.canPartitionKSubsets(new int[]{2, 2, 2, 2, 3, 4, 5}, 4));
    }


}
