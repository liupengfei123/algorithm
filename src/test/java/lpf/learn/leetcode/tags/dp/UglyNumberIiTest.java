package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class UglyNumberIiTest {
    @Test
    public void test1(){
        UglyNumberIi test = new UglyNumberIi();
        Assert.assertEquals(12, test.nthUglyNumber(10));
    }

    @Test
    public void test2(){
        UglyNumberIi test = new UglyNumberIi();
        Assert.assertEquals(1, test.nthUglyNumber(1));
    }

    @Test
    public void test3(){
        UglyNumberIi test = new UglyNumberIi();
        Assert.assertEquals(10, test.nthUglyNumber(9));
    }

    @Test
    public void test4(){
        UglyNumberIi test = new UglyNumberIi();
        Assert.assertEquals(2123366400, test.nthUglyNumber(1690));
    }


}
