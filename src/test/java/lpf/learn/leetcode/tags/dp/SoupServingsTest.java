package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class SoupServingsTest {
    @Test
    public void test1(){
        SoupServings test = new SoupServings();
        Assert.assertEquals(0.625, test.soupServings(50), 0.000_01);
    }

    @Test
    public void test2(){
        SoupServings test = new SoupServings();
        Assert.assertEquals(0.71875, test.soupServings(100), 0.000_01);
    }

    @Test
    public void test3(){
        SoupServings test = new SoupServings();
        Assert.assertEquals(0.74219, test.soupServings(110), 0.000_01);
    }

    @Test
    public void test4(){
        SoupServings test = new SoupServings();
        Assert.assertEquals(0.50000, test.soupServings(0), 0.000_01);
    }

    @Test
    public void test5(){
        SoupServings test = new SoupServings();
        Assert.assertEquals(0.99772, test.soupServings(2000), 0.000_01);
    }

    @Test
    public void test6(){
        SoupServings test = new SoupServings();
        Assert.assertEquals(1, test.soupServings(660295675), 0.000_01);
    }

}
