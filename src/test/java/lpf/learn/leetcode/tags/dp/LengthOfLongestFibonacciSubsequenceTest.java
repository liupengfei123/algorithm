package lpf.learn.leetcode.tags.dp;

import lpf.learn.leetcode.tags.array.LengthOfLongestFibonacciSubsequence;
import org.junit.Assert;
import org.junit.Test;

public class LengthOfLongestFibonacciSubsequenceTest {
    @Test
    public void test1(){
        LengthOfLongestFibonacciSubsequence test = new LengthOfLongestFibonacciSubsequence();
        Assert.assertEquals(5, test.lenLongestFibSubseq(new int[]{1,2,3,4,5,6,7,8}));
    }

    @Test
    public void test2(){
        LengthOfLongestFibonacciSubsequence test = new LengthOfLongestFibonacciSubsequence();
        Assert.assertEquals(3, test.lenLongestFibSubseq(new int[]{1,3,7,11,12,14,18}));
    }

    @Test
    public void test3(){
        LengthOfLongestFibonacciSubsequence test = new LengthOfLongestFibonacciSubsequence();
        Assert.assertEquals(5, test.lenLongestFibSubseq(new int[]{1,2,3,4,6,7,8,11}));
    }

    @Test
    public void test4(){
        LengthOfLongestFibonacciSubsequence test = new LengthOfLongestFibonacciSubsequence();
        Assert.assertEquals(4, test.lenLongestFibSubseq(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test5(){
        int[] arr = new int[999];
        for (int i = 0; i < 999; i++) {
            arr[i] = i + 1;
        }
        LengthOfLongestFibonacciSubsequence test = new LengthOfLongestFibonacciSubsequence();
        Assert.assertEquals(15, test.lenLongestFibSubseq(arr));
    }
}
