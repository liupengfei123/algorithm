package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class DecodeWaysTest {
    @Test
    public void test1(){
        DecodeWays test = new DecodeWays();
        Assert.assertEquals(5, test.numDecodings("1211"));
    }

    @Test
    public void test2(){
        DecodeWays test = new DecodeWays();
        Assert.assertEquals(3, test.numDecodings("226"));
    }

    @Test
    public void test3(){
        DecodeWays test = new DecodeWays();
        Assert.assertEquals(0, test.numDecodings("06"));
    }

    @Test
    public void test4(){
        DecodeWays test = new DecodeWays();
        Assert.assertEquals(0, test.numDecodings("0"));
    }

    @Test
    public void test5(){
        DecodeWays test = new DecodeWays();
        Assert.assertEquals(0, test.numDecodings("1200"));
    }

    @Test
    public void test6(){
        DecodeWays test = new DecodeWays();
        Assert.assertEquals(330, test.numDecodings("12111222618211"));
    }

    @Test
    public void test7(){
        DecodeWays test = new DecodeWays();
        Assert.assertEquals(13, test.numDecodings("121121"));
    }

    @Test
    public void test8(){
        DecodeWays test = new DecodeWays();
        Assert.assertEquals(2, test.numDecodings("821"));
    }

    @Test
    public void test9(){
        DecodeWays test = new DecodeWays();
        Assert.assertEquals(1836311903, test.numDecodings("111111111111111111111111111111111111111111111"));
    }

}
