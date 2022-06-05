package lpf.learn.leetcode.game.weekly296;

import org.junit.Assert;
import org.junit.Test;

public class PartitionArraySuchThatMaximumDifferenceIsKTest {
    @Test
    public void test1(){
        PartitionArraySuchThatMaximumDifferenceIsK test = new PartitionArraySuchThatMaximumDifferenceIsK();
        Assert.assertEquals(2, test.partitionArray(new int[]{1,2,3,4,5}, 2));
    }
    @Test
    public void test2(){
        PartitionArraySuchThatMaximumDifferenceIsK test = new PartitionArraySuchThatMaximumDifferenceIsK();
        Assert.assertEquals(2, test.partitionArray(new int[]{3,6,1,2,5}, 2));
    }

    @Test
    public void test3(){
        PartitionArraySuchThatMaximumDifferenceIsK test = new PartitionArraySuchThatMaximumDifferenceIsK();
        Assert.assertEquals(3, test.partitionArray(new int[]{1,2,3,4,5}, 1));
    }

    @Test
    public void test4(){
        PartitionArraySuchThatMaximumDifferenceIsK test = new PartitionArraySuchThatMaximumDifferenceIsK();
        Assert.assertEquals(3, test.partitionArray(new int[]{2,2,4,5}, 0));
    }

    @Test
    public void test5(){
        PartitionArraySuchThatMaximumDifferenceIsK test = new PartitionArraySuchThatMaximumDifferenceIsK();
        Assert.assertEquals(1, test.partitionArray(new int[]{2,2,4,5}, 100000));
    }

}
