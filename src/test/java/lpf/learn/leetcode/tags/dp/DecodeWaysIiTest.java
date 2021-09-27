package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class DecodeWaysIiTest {

    @Test
    public void test1(){
        DecodeWaysIi test = new DecodeWaysIi();
        Assert.assertEquals(9, test.numDecodings("*"));
    }

    @Test
    public void test2(){
        DecodeWaysIi test = new DecodeWaysIi();
        Assert.assertEquals(18, test.numDecodings("1*"));
    }

    @Test
    public void test3(){
        DecodeWaysIi test = new DecodeWaysIi();
        Assert.assertEquals(15, test.numDecodings("2*"));
    }

    @Test
    public void test4(){
        DecodeWaysIi test = new DecodeWaysIi();
        Assert.assertEquals(96, test.numDecodings("**"));
    }

    @Test
    public void test5(){
        DecodeWaysIi test = new DecodeWaysIi();
        Assert.assertEquals(999, test.numDecodings("***"));
    }

    @Test
    public void test6(){
        DecodeWaysIi test = new DecodeWaysIi();
        Assert.assertEquals(199980, test.numDecodings("*1*3*5*9*"));
    }

    @Test
    public void test7(){
        DecodeWaysIi test = new DecodeWaysIi();
        Assert.assertEquals(291868912, test.numDecodings("*********"));
    }

    @Test
    public void test8(){
        DecodeWaysIi test = new DecodeWaysIi();
        Assert.assertEquals(196465252, test.numDecodings("7*9*3*6*3*0*5*4*9*7*3*7*1*8*3*2*0*0*6*"));
    }
}
