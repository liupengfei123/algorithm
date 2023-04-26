package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSumOfTwoNonOverlappingSubarraysTest {
    @Test
    public void test1(){
        MaximumSumOfTwoNonOverlappingSubarrays test = new MaximumSumOfTwoNonOverlappingSubarrays();
        Assert.assertEquals(20, test.maxSumTwoNoOverlap(new int[]{0,6,5,2,2,5,1,9,4}, 1, 2));
    }

    @Test
    public void test2(){
        MaximumSumOfTwoNonOverlappingSubarrays test = new MaximumSumOfTwoNonOverlappingSubarrays();
        Assert.assertEquals(29, test.maxSumTwoNoOverlap(new int[]{3,8,1,3,2,1,8,9,0}, 3, 2));
    }

    @Test
    public void test3(){
        MaximumSumOfTwoNonOverlappingSubarrays test = new MaximumSumOfTwoNonOverlappingSubarrays();
        Assert.assertEquals(31, test.maxSumTwoNoOverlap(new int[]{2,1,5,6,0,9,5,0,3,8}, 4, 3));
    }

    @Test
    public void test4(){
        MaximumSumOfTwoNonOverlappingSubarrays test = new MaximumSumOfTwoNonOverlappingSubarrays();
        Assert.assertEquals(63, test.maxSumTwoNoOverlap(new int[]{9,9,9,6,0,1,9,9,9,9}, 4, 3));
    }


}
