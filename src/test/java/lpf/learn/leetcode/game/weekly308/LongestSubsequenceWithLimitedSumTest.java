package lpf.learn.leetcode.game.weekly308;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubsequenceWithLimitedSumTest {
    @Test
    public void test1(){
        LongestSubsequenceWithLimitedSum test = new LongestSubsequenceWithLimitedSum();
        Assert.assertArrayEquals(new int[]{2,3,4}, test.answerQueries(new int[]{4,5,2,1}, new int[]{3,10,21}));
    }

    @Test
    public void test2(){
        LongestSubsequenceWithLimitedSum test = new LongestSubsequenceWithLimitedSum();
        Assert.assertArrayEquals(new int[]{0}, test.answerQueries(new int[]{2,3,4,5}, new int[]{1}));
    }

}
