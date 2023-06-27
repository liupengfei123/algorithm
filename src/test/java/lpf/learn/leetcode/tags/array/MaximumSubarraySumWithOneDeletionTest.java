package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MaximumSubarraySumWithOneDeletionTest {

    @Test
    public void test1(){
        MaximumSubarraySumWithOneDeletion test = new MaximumSubarraySumWithOneDeletion();
        Assert.assertEquals(9, test.maximumSum(new int[]{9}));

    }

    @Test
    public void test2(){
        MaximumSubarraySumWithOneDeletion test = new MaximumSubarraySumWithOneDeletion();
        Assert.assertEquals(4, test.maximumSum(new int[]{1,-2,0,3}));
    }

    @Test
    public void test3(){
        MaximumSubarraySumWithOneDeletion test = new MaximumSubarraySumWithOneDeletion();
        Assert.assertEquals(3, test.maximumSum(new int[]{1,-2,-2,3}));
    }

    @Test
    public void test4(){
        MaximumSubarraySumWithOneDeletion test = new MaximumSubarraySumWithOneDeletion();
        Assert.assertEquals(-1, test.maximumSum(new int[]{-1,-1,-1,-1}));
    }

    @Test
    public void test5(){
        MaximumSubarraySumWithOneDeletion test = new MaximumSubarraySumWithOneDeletion();
        Assert.assertEquals(142, test.maximumSum(new int[]{1,-2,0,3,9,5,-1,4,-99,24,12,41,2,2,41,-12}));
    }
}
