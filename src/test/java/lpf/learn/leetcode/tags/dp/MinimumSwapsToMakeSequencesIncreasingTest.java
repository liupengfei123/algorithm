package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSwapsToMakeSequencesIncreasingTest {
    @Test
    public void test1(){
        MinimumSwapsToMakeSequencesIncreasing test = new MinimumSwapsToMakeSequencesIncreasing();
        Assert.assertEquals(1, test.minSwap(new int[]{1, 3, 5, 4}, new int[]{1, 2, 3, 7}));
    }

    @Test
    public void test2(){
        MinimumSwapsToMakeSequencesIncreasing test = new MinimumSwapsToMakeSequencesIncreasing();
        Assert.assertEquals(1, test.minSwap(new int[]{1, 3, 5, 6}, new int[]{2, 2, 3, 7}));
    }

    @Test
    public void test3(){
        MinimumSwapsToMakeSequencesIncreasing test = new MinimumSwapsToMakeSequencesIncreasing();
        Assert.assertEquals(2, test.minSwap(new int[]{1, 3, 5, 4}, new int[]{2, 2, 3, 7}));
    }


    @Test
    public void test4(){
        MinimumSwapsToMakeSequencesIncreasing test = new MinimumSwapsToMakeSequencesIncreasing();
        Assert.assertEquals(4, test.minSwap(new int[]{0,7,8,10,10,11,12,13,19,18}, new int[]{4,4,5,7,11,14,15,16,17,20}));
    }

    @Test
    public void test5(){
        MinimumSwapsToMakeSequencesIncreasing test = new MinimumSwapsToMakeSequencesIncreasing();
        Assert.assertEquals(2, test.minSwap(new int[]{1,3,3,5}, new int[]{2,2,4,4}));
    }

    @Test
    public void test6(){
        MinimumSwapsToMakeSequencesIncreasing test = new MinimumSwapsToMakeSequencesIncreasing();
        Assert.assertEquals(1, test.minSwap(new int[]{0,4,4,5,9}, new int[]{0,1,6,8,10}));
    }
}
