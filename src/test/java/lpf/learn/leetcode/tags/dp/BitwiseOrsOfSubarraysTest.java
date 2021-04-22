package lpf.learn.leetcode.tags.dp;

import lpf.learn.leetcode.tags.array.BitwiseOrsOfSubarrays;
import org.junit.Assert;
import org.junit.Test;

public class BitwiseOrsOfSubarraysTest {
    @Test
    public void test1(){
        BitwiseOrsOfSubarrays test = new BitwiseOrsOfSubarrays();
        Assert.assertEquals(1, test.subarrayBitwiseORs(new int[]{0}));
    }

    @Test
    public void test2(){
        BitwiseOrsOfSubarrays test = new BitwiseOrsOfSubarrays();
        Assert.assertEquals(3, test.subarrayBitwiseORs(new int[]{1,1,2}));
    }

    @Test
    public void test3(){
        BitwiseOrsOfSubarrays test = new BitwiseOrsOfSubarrays();
        Assert.assertEquals(6, test.subarrayBitwiseORs(new int[]{1,2,4}));
    }

    @Test
    public void test4(){
        BitwiseOrsOfSubarrays test = new BitwiseOrsOfSubarrays();
        Assert.assertEquals(6, test.subarrayBitwiseORs(new int[]{1,1,2,4}));
    }

    @Test
    public void test5(){
        BitwiseOrsOfSubarrays test = new BitwiseOrsOfSubarrays();
        Assert.assertEquals(1, test.subarrayBitwiseORs(new int[]{7, 7, 7, 7}));
    }

    @Test
    public void test6(){
        BitwiseOrsOfSubarrays test = new BitwiseOrsOfSubarrays();
        Assert.assertEquals(23, test.subarrayBitwiseORs(new int[]{1,1,2,4,6,3,6,1,72,8,61,7,4,8,7,9,11,23,51,39,3}));
    }



}
