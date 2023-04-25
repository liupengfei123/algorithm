package lpf.learn.leetcode.game.weekly342;

import org.junit.Assert;
import org.junit.Test;

public class SumMultiplesTest {
    @Test
    public void test1(){
        SumMultiples test = new SumMultiples();
        Assert.assertEquals(21, test.sumOfMultiples(7));
    }

    @Test
    public void test2(){
        SumMultiples test = new SumMultiples();
        Assert.assertEquals(40, test.sumOfMultiples(10));
    }

    @Test
    public void test3(){
        SumMultiples test = new SumMultiples();
        Assert.assertEquals(30, test.sumOfMultiples(9));
    }
}
