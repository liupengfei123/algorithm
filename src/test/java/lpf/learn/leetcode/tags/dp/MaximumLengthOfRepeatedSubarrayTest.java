package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MaximumLengthOfRepeatedSubarrayTest {
    @Test
    public void test1(){
        MaximumLengthOfRepeatedSubarray test = new MaximumLengthOfRepeatedSubarray();
        Assert.assertEquals(4, test.findLength(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test2(){
        MaximumLengthOfRepeatedSubarray test = new MaximumLengthOfRepeatedSubarray();
        Assert.assertEquals(3, test.findLength(new int[]{1,2,3,2,1}, new int[]{3,2,1,4,7}));
    }

    @Test
    public void test3(){
        MaximumLengthOfRepeatedSubarray test = new MaximumLengthOfRepeatedSubarray();
        Assert.assertEquals(3, test.findLength(new int[]{1,2,2,2,2,2,1}, new int[]{2,2,1,4,7}));
    }

    @Test
    public void test4(){
        MaximumLengthOfRepeatedSubarray test = new MaximumLengthOfRepeatedSubarray();
        Assert.assertEquals(5, test.findLength(new int[]{1,2,2,2,2,2,1}, new int[]{2,2,2,2,1,2,2}));
    }

}
