package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class New21GameTest {
    @Test
    public void test1(){
        New21Game test = new New21Game();
        Assert.assertEquals(1, test.new21Game(10,1,10), 0.000_01);
    }

    @Test
    public void test2(){
        New21Game test = new New21Game();
        Assert.assertEquals(0.60000, test.new21Game(6,1,10), 0.000_01);
    }

    @Test
    public void test3(){
        New21Game test = new New21Game();
        Assert.assertEquals(0.73278, test.new21Game(21,17,10), 0.000_01);
    }


    @Test
    public void test4(){
        New21Game test = new New21Game();
        Assert.assertEquals(0.59076, test.new21Game(9389,7085,6146), 0.000_01);
    }
}
