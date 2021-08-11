package lpf.learn.leetcode.tags.number;

import org.junit.Assert;
import org.junit.Test;

public class UglyNumberTest {
    @Test
    public void test1(){
        UglyNumber test = new UglyNumber();
        Assert.assertFalse(test.isUgly(-1));
    }

    @Test
    public void test2(){
        UglyNumber test = new UglyNumber();
        Assert.assertFalse(test.isUgly(0));
    }

    @Test
    public void test3(){
        UglyNumber test = new UglyNumber();
        Assert.assertTrue(test.isUgly(6));
    }


    @Test
    public void test4(){
        UglyNumber test = new UglyNumber();
        Assert.assertTrue(test.isUgly(8));
    }

    @Test
    public void test5(){
        UglyNumber test = new UglyNumber();
        Assert.assertFalse(test.isUgly(14));
    }

    @Test
    public void test6(){
        UglyNumber test = new UglyNumber();
        Assert.assertTrue(test.isUgly(1));
    }

}
