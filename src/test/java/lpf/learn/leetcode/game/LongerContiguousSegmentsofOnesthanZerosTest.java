package lpf.learn.leetcode.game;

import org.junit.Assert;
import org.junit.Test;

public class LongerContiguousSegmentsofOnesthanZerosTest {
    @Test
    public void test1(){
        LongerContiguousSegmentsofOnesthanZeros test = new LongerContiguousSegmentsofOnesthanZeros();
        Assert.assertTrue(test.checkZeroOnes("1101"));
    }

    @Test
    public void test2(){
        LongerContiguousSegmentsofOnesthanZeros test = new LongerContiguousSegmentsofOnesthanZeros();
        Assert.assertFalse(test.checkZeroOnes("111000"));
    }

    @Test
    public void test3(){
        LongerContiguousSegmentsofOnesthanZeros test = new LongerContiguousSegmentsofOnesthanZeros();
        Assert.assertFalse(test.checkZeroOnes("000111"));
    }

    @Test
    public void test4(){
        LongerContiguousSegmentsofOnesthanZeros test = new LongerContiguousSegmentsofOnesthanZeros();
        Assert.assertFalse(test.checkZeroOnes("110100010"));
    }
}
