package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class LongestStringChainTest {
    @Test
    public void test1(){
        LongestStringChain test = new LongestStringChain();
        Assert.assertEquals(4, test.longestStrChain(new String[]{"a","b","ba","bca","bda","bdca"}));
    }

    @Test
    public void test2(){
        LongestStringChain test = new LongestStringChain();
        Assert.assertEquals(5, test.longestStrChain(new String[]{"xbc","pcxbcf","xb","cxbc","pcxbc"}));
    }

    @Test
    public void test3(){
        LongestStringChain test = new LongestStringChain();
        Assert.assertEquals(2, test.longestStrChain(new String[]{"a","b","ab","bac"}));
    }

    @Test
    public void test4(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(11, test.numberOfArithmeticSlices(new int[]{1, 2, 3, 4, 5, 6, 8, 10}));
    }

    @Test
    public void test5(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(3, test.numberOfArithmeticSlices(new int[]{7, 7, 7, 7}));
    }

    @Test
    public void test6(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(0, test.numberOfArithmeticSlices(new int[]{1, 1, 2, 5, 7}));
    }



}
