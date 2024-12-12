package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class NumberOfSubarraysWithBoundedMaximumTest {

    @Test
    public void test1(){
        NumberOfSubarraysWithBoundedMaximum test = new NumberOfSubarraysWithBoundedMaximum();
        Assert.assertEquals(3, test.numSubarrayBoundedMax(new int[]{2,1,4,3}, 2, 3));
    }

    @Test
    public void test2(){
        NumberOfSubarraysWithBoundedMaximum test = new NumberOfSubarraysWithBoundedMaximum();
        Assert.assertEquals(7, test.numSubarrayBoundedMax(new int[]{2,9,2,5,6}, 2, 8));
    }

    @Test
    public void test3(){
        NumberOfSubarraysWithBoundedMaximum test = new NumberOfSubarraysWithBoundedMaximum();
        Assert.assertEquals(6, test.numSubarrayBoundedMax(new int[]{2,2,2,5,6}, 2, 2));
    }


    @Test
    public void test4(){
        NumberOfSubarraysWithBoundedMaximum test = new NumberOfSubarraysWithBoundedMaximum();
        Assert.assertEquals(22, test.numSubarrayBoundedMax(new int[]{73,55,36,5,55,14,9,7,72,52}, 32, 69));
    }

    @Test
    public void test5(){
        NumberOfSubarraysWithBoundedMaximum test = new NumberOfSubarraysWithBoundedMaximum();
        Assert.assertEquals(20, test.numSubarrayBoundedMax(new int[]{73,55,31,5,55,14,9,7,72,52}, 32, 69));
    }
}
