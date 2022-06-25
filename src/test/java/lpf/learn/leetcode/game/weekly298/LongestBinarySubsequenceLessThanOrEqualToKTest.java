package lpf.learn.leetcode.game.weekly298;

import org.junit.Assert;
import org.junit.Test;

public class LongestBinarySubsequenceLessThanOrEqualToKTest {
    @Test
    public void test1(){
        LongestBinarySubsequenceLessThanOrEqualToK test = new LongestBinarySubsequenceLessThanOrEqualToK();
        Assert.assertEquals(5, test.longestSubsequence("1001010", 5));
    }

    @Test
    public void test2(){
        LongestBinarySubsequenceLessThanOrEqualToK test = new LongestBinarySubsequenceLessThanOrEqualToK();
        Assert.assertEquals(6, test.longestSubsequence("00101001", 1));
    }

    @Test
    public void test3(){
        LongestBinarySubsequenceLessThanOrEqualToK test = new LongestBinarySubsequenceLessThanOrEqualToK();
        Assert.assertEquals(6, test.longestSubsequence("00101001", 2));
    }

    @Test
    public void test4(){
        LongestBinarySubsequenceLessThanOrEqualToK test = new LongestBinarySubsequenceLessThanOrEqualToK();
        Assert.assertEquals(1, test.longestSubsequence("0", 583196182));
    }

    @Test
    public void test5(){
        LongestBinarySubsequenceLessThanOrEqualToK test = new LongestBinarySubsequenceLessThanOrEqualToK();
        Assert.assertEquals(31, test.longestSubsequence("001010101011010100010101101010010",93951055));
    }

    @Test
    public void test6(){
        LongestBinarySubsequenceLessThanOrEqualToK test = new LongestBinarySubsequenceLessThanOrEqualToK();
        Assert.assertEquals(108, test.longestSubsequence("000101010011011001011101111000111111100001011000000100010000111100000011111001000111100111101001111001011101001011011101001011011001111111010011100011110111010000010000010111001001111101100001111"
                ,300429827));
    }

    @Test
    public void test7(){
        LongestBinarySubsequenceLessThanOrEqualToK test = new LongestBinarySubsequenceLessThanOrEqualToK();
        Assert.assertEquals(1, test.longestSubsequence("0"
                ,1));
    }
}
