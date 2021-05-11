package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class DecodeXoredPermutationTest {

    @Test
    public void test1(){
        DecodeXoredPermutation test = new DecodeXoredPermutation();
        Assert.assertArrayEquals(new int[]{1,2,3}, test.decode(new int[]{3,1}));
    }


    @Test
    public void test2(){
        DecodeXoredPermutation test = new DecodeXoredPermutation();
        Assert.assertArrayEquals(new int[]{2,4,1,5,3}, test.decode(new int[]{6,5,4,6}));
    }
}
