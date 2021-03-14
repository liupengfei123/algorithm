package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class IntegerBreakTest {
    @Test
    public void test1(){
        IntegerBreak test = new IntegerBreak();
        Assert.assertEquals(1, test.integerBreak(2));
    }

    @Test
    public void test2(){
        IntegerBreak test = new IntegerBreak();
        Assert.assertEquals(36, test.integerBreak(10));
    }

    @Test
    public void test3(){
        IntegerBreak test = new IntegerBreak();
        Assert.assertEquals(1549681956, test.integerBreak(58));
    }

    @Test
    public void test4(){
        IntegerBreak test = new IntegerBreak();
        Assert.assertEquals(1549681956, test.integerBreak(58));
    }

    @Test
    public void test5(){
        IntegerBreak test = new IntegerBreak();
        Assert.assertEquals(729, test.integerBreak(18));
    }

    @Test
    public void test6(){
        IntegerBreak test = new IntegerBreak();
        Assert.assertEquals(108, test.integerBreak(13));
    }


    @Test
    public void test7(){
        IntegerBreak test = new IntegerBreak();
        Assert.assertEquals(2, test.integerBreak(3));
    }

    @Test
    public void test8(){
        IntegerBreak test = new IntegerBreak();
        Assert.assertEquals(4, test.integerBreak(4));
    }

    @Test
    public void test9(){
        IntegerBreak test = new IntegerBreak();
        Assert.assertEquals(6, test.integerBreak(5));
    }

    @Test
    public void test10(){
        IntegerBreak test = new IntegerBreak();
        Assert.assertEquals(18, test.integerBreak(8));
    }
}
