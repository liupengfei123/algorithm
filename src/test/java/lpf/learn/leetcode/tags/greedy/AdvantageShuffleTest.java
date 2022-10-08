package lpf.learn.leetcode.tags.greedy;

import org.junit.Assert;
import org.junit.Test;

public class AdvantageShuffleTest {
    @Test
    public void test1(){
        AdvantageShuffle test = new AdvantageShuffle();
        Assert.assertArrayEquals(new int[]{2,11,7,15}, test.advantageCount(new int[]{2,7,11,15}, new int[]{1,10,4,11}));
    }

    @Test
    public void test2(){
        AdvantageShuffle test = new AdvantageShuffle();
        Assert.assertArrayEquals(new int[]{24,32,8,12}, test.advantageCount(new int[]{12,24,8,32}, new int[]{13,25,32,11}));
    }

    @Test
    public void test3(){
        AdvantageShuffle test = new AdvantageShuffle();
        Assert.assertArrayEquals(new int[]{3,5,1}, test.advantageCount(new int[]{1,3,5}, new int[]{2,4,6}));
    }
}
