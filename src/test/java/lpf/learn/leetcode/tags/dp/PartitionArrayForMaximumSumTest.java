package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class PartitionArrayForMaximumSumTest {
    @Test
    public void test1(){
        PartitionArrayForMaximumSum test = new PartitionArrayForMaximumSum();
        Assert.assertEquals(10, test.maxSumAfterPartitioning(new int[]{1, 2, 3, 4}, 1));
    }

    @Test
    public void test2(){
        PartitionArrayForMaximumSum test = new PartitionArrayForMaximumSum();
        Assert.assertEquals(16, test.maxSumAfterPartitioning(new int[]{1, 2, 3, 4}, 4));
    }

    @Test
    public void test3(){
        PartitionArrayForMaximumSum test = new PartitionArrayForMaximumSum();
        Assert.assertEquals(84, test.maxSumAfterPartitioning(new int[]{1,15,7,9,2,5,10}, 3));
    }

    @Test
    public void test4(){
        PartitionArrayForMaximumSum test = new PartitionArrayForMaximumSum();
        Assert.assertEquals(83, test.maxSumAfterPartitioning(new int[]{1,4,1,5,7,3,6,1,9,9,3}, 4));
    }

    @Test
    public void test5(){
        PartitionArrayForMaximumSum test = new PartitionArrayForMaximumSum();
        Assert.assertEquals(1, test.maxSumAfterPartitioning(new int[]{1}, 1));
    }





}
