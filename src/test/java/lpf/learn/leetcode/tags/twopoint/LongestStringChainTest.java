package lpf.learn.leetcode.tags.twopoint;

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
        Assert.assertEquals(1, test.longestStrChain(new String[]{"abcd","dbqca"}));
    }

    @Test
    public void test4(){
        LongestStringChain test = new LongestStringChain();
        Assert.assertEquals(2, test.longestStrChain(new String[]{"a","b","ab","bac"}));
    }
}
