package lpf.learn.leetcode.game.weekly301;

import org.junit.Assert;
import org.junit.Test;

public class MinimumAmountOfTimeToFillCupsTest {

    @Test
    public void test1(){
        MinimumAmountOfTimeToFillCups test = new MinimumAmountOfTimeToFillCups();
        Assert.assertEquals(4, test.fillCups(new int[]{1,4,2}));
    }


    @Test
    public void test2(){
        MinimumAmountOfTimeToFillCups test = new MinimumAmountOfTimeToFillCups();
        Assert.assertEquals(7, test.fillCups(new int[]{5,4,4}));
    }

    @Test
    public void test3(){
        MinimumAmountOfTimeToFillCups test = new MinimumAmountOfTimeToFillCups();
        Assert.assertEquals(5, test.fillCups(new int[]{5,0,0}));
    }
}
