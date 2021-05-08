package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class LongestArithmeticSubsequenceTest {
    @Test
    public void test1(){
        LongestArithmeticSubsequence test = new LongestArithmeticSubsequence();
        Assert.assertEquals(4, test.longestArithSeqLength(new int[]{3,6,9,12}));
    }

    @Test
    public void test2(){
        LongestArithmeticSubsequence test = new LongestArithmeticSubsequence();
        Assert.assertEquals(6, test.longestArithSeqLength(new int[]{3,3,3,3,3,3}));
    }

    @Test
    public void test3(){
        LongestArithmeticSubsequence test = new LongestArithmeticSubsequence();
        Assert.assertEquals(3, test.longestArithSeqLength(new int[]{9,4,7,2,10}));
    }

    @Test
    public void test4(){
        LongestArithmeticSubsequence test = new LongestArithmeticSubsequence();
        Assert.assertEquals(4, test.longestArithSeqLength(new int[]{20,1,15,3,10,5,8}));
    }

    @Test
    public void test5(){
        int[] array = new int[2000];
        for (int i = 0; i < 2000; i++) {
            array[i] = i + 4;
        }
        LongestArithmeticSubsequence test = new LongestArithmeticSubsequence();
        Assert.assertEquals(2000, test.longestArithSeqLength(array));
    }

    @Test
    public void test6(){
        int[] array = new int[]{22,8,57,41,36,46,42,28,42,14,9,43,27,51,0,0,38,50,31,60,29,31,20,23,37,53,27,1,47,42,28,31,10,35,39,12,15,6,35,31,45,21,30,19,5,5,4,18,38,51,10,7,20,38,28,53,15,55,60,56,43,48,34,53,54,55,14,9,56,52};
        LongestArithmeticSubsequence test = new LongestArithmeticSubsequence();
        Assert.assertEquals(6, test.longestArithSeqLength(array));
    }
}
