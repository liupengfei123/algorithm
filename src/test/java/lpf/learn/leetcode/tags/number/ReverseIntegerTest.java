package lpf.learn.leetcode.tags.number;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {
    @Test
    public void test1(){
        ReverseInteger test = new ReverseInteger();
        Assert.assertEquals(-321, test.reverse(-123));
    }

    @Test
    public void test2(){
        ReverseInteger test = new ReverseInteger();
        Assert.assertEquals(321, test.reverse(123));
    }

    @Test
    public void test3(){
        ReverseInteger test = new ReverseInteger();
        Assert.assertEquals(21, test.reverse(120));
    }


    @Test
    public void test4(){
        ReverseInteger test = new ReverseInteger();
        Assert.assertEquals(0, test.reverse(0));
    }

    @Test
    public void test5(){
        ReverseInteger test = new ReverseInteger();
        Assert.assertEquals(0, test.reverse(1534236469));
    }

    @Test
    public void test6(){
        ReverseInteger test = new ReverseInteger();
        Assert.assertEquals(0, test.reverse(-1534236469));
    }

    @Test
    public void test7(){
        ReverseInteger test = new ReverseInteger();
        Assert.assertEquals(0, test.reverse(Integer.MIN_VALUE));
    }
}
