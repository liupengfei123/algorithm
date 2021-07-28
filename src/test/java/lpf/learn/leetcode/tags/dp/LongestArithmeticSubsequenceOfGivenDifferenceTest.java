package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class LongestArithmeticSubsequenceOfGivenDifferenceTest {
    @Test
    public void test1(){
        LongestArithmeticSubsequenceOfGivenDifference test = new LongestArithmeticSubsequenceOfGivenDifference();
        Assert.assertEquals(4, test.longestSubsequence(new int[]{1, 2, 3, 4}, 1));
    }

    @Test
    public void test2(){
        LongestArithmeticSubsequenceOfGivenDifference test = new LongestArithmeticSubsequenceOfGivenDifference();
        Assert.assertEquals(1, test.longestSubsequence(new int[]{1,3,5,7}, 1));
    }

    @Test
    public void test3(){
        LongestArithmeticSubsequenceOfGivenDifference test = new LongestArithmeticSubsequenceOfGivenDifference();
        Assert.assertEquals(4, test.longestSubsequence(new int[]{1,5,7,8,5,3,4,2,1}, -2));
    }

    @Test
    public void test4(){
        LongestArithmeticSubsequenceOfGivenDifference test = new LongestArithmeticSubsequenceOfGivenDifference();
        Assert.assertEquals(7, test.longestSubsequence(new int[]{7,7,7,7,7,7,7}, 0));
    }
}
