package lpf.learn.leetcode.game.weekly241;

import org.junit.Assert;
import org.junit.Test;

public class MinimumNumberOfSwapsToMaketheBinaryStringAlternatingTest {
    @Test
    public void test1(){
        MinimumNumberOfSwapsToMaketheBinaryStringAlternating test = new MinimumNumberOfSwapsToMaketheBinaryStringAlternating();
        Assert.assertEquals(1, test.minSwaps("111000"));
    }

    @Test
    public void test2(){
        MinimumNumberOfSwapsToMaketheBinaryStringAlternating test = new MinimumNumberOfSwapsToMaketheBinaryStringAlternating();
        Assert.assertEquals(0, test.minSwaps("010"));
    }

    @Test
    public void test3(){
        MinimumNumberOfSwapsToMaketheBinaryStringAlternating test = new MinimumNumberOfSwapsToMaketheBinaryStringAlternating();
        Assert.assertEquals(-1, test.minSwaps("1110"));
    }
}
