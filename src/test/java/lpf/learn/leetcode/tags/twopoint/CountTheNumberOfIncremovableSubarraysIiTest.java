package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class CountTheNumberOfIncremovableSubarraysIiTest {
    @Test
    public void test1(){
        CountTheNumberOfIncremovableSubarraysIi test = new CountTheNumberOfIncremovableSubarraysIi();
        Assert.assertEquals(10, test.incremovableSubarrayCount(new int[]{1,2,3,4}));
    }

    @Test
    public void test2(){
        CountTheNumberOfIncremovableSubarraysIi test = new CountTheNumberOfIncremovableSubarraysIi();
        Assert.assertEquals(7, test.incremovableSubarrayCount(new int[]{6,5,7,8}));
    }

    @Test
    public void test3(){
        CountTheNumberOfIncremovableSubarraysIi test = new CountTheNumberOfIncremovableSubarraysIi();
        Assert.assertEquals(3, test.incremovableSubarrayCount(new int[]{8,7,6,6}));
    }

    @Test
    public void test4(){
        CountTheNumberOfIncremovableSubarraysIi test = new CountTheNumberOfIncremovableSubarraysIi();
        Assert.assertEquals(38, test.incremovableSubarrayCount(new int[]{1,2,3,4, 11,12,8,9, 15,16,17}));
    }

    @Test
    public void test5(){
        CountTheNumberOfIncremovableSubarraysIi test = new CountTheNumberOfIncremovableSubarraysIi();
        Assert.assertEquals(10, test.incremovableSubarrayCount(new int[]{1,2,3,4}));
    }


}
