package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class KnightDialerTest {
    @Test
    public void test1(){
        KnightDialer test = new KnightDialer();
        Assert.assertEquals(10, test.knightDialer(1));
    }

    @Test
    public void test2(){
        KnightDialer test = new KnightDialer();
        Assert.assertEquals(20, test.knightDialer(2));
    }

    @Test
    public void test3(){
        KnightDialer test = new KnightDialer();
        Assert.assertEquals(46, test.knightDialer(3));
    }

    @Test
    public void test4(){
        KnightDialer test = new KnightDialer();
        Assert.assertEquals(14912, test.knightDialer(10));
    }

    @Test
    public void test5(){
        KnightDialer test = new KnightDialer();
        Assert.assertEquals(58689536, test.knightDialer(20));
    }

    @Test
    public void test6(){
        KnightDialer test = new KnightDialer();
        Assert.assertEquals(88106097, test.knightDialer(1000));
    }

    @Test
    public void test7(){
        KnightDialer test = new KnightDialer();
        Assert.assertEquals(406880451, test.knightDialer(5000));
    }

}
