package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class SuperUglyNumberTest {
    @Test
    public void test1(){
        SuperUglyNumber test = new SuperUglyNumber();
        Assert.assertEquals(32, test.nthSuperUglyNumber(12, new int[]{2,7,13,19}));
    }

    @Test
    public void test2(){
        SuperUglyNumber test = new SuperUglyNumber();
        Assert.assertEquals(1, test.nthSuperUglyNumber(1, new int[]{2,3,5}));
    }

    @Test
    public void test3(){
        SuperUglyNumber test = new SuperUglyNumber();
        Assert.assertEquals(2, test.nthSuperUglyNumber(2, new int[]{2,3,5}));
    }

    @Test
    public void test4(){
        SuperUglyNumber test = new SuperUglyNumber();
        Assert.assertEquals(38, test.nthSuperUglyNumber(13, new int[]{2,7,13,19}));
    }


}
