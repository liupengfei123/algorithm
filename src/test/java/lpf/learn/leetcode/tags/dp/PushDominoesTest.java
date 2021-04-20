package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class PushDominoesTest {
    @Test
    public void test1(){
        PushDominoes test = new PushDominoes();
        Assert.assertEquals("LL.RR.LLRRLL..", test.pushDominoes(".L.R...LR..L.."));
    }

    @Test
    public void test2(){
        PushDominoes test = new PushDominoes();
        Assert.assertEquals("RR.L", test.pushDominoes("RR.L"));
    }

    @Test
    public void test3(){
        PushDominoes test = new PushDominoes();
        Assert.assertEquals("LLLLLL", test.pushDominoes(".....L"));
    }

    @Test
    public void test4(){
        PushDominoes test = new PushDominoes();
        Assert.assertEquals("RRRR.LLLL", test.pushDominoes("R.RR.L..L"));
    }

    @Test
    public void test5(){
        PushDominoes test = new PushDominoes();
        Assert.assertEquals("LL.RR.LLRRRR.LLLL.RR.LLRRLLLLLLL.RR.LLLL.RR.LLRRLL..", test.pushDominoes(".L.R...LR.RR.L..L.R...LR..L....L.RR.L..L.R...LR..L.."));
    }

    @Test
    public void test6(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(0, test.numberOfArithmeticSlices(new int[]{1, 1, 2, 5, 7}));
    }



}
