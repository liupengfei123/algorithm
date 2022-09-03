package lpf.learn.leetcode.game.weekly308;

import org.junit.Assert;
import org.junit.Test;

public class MinimumAmountOfTimeToCollectGarbageTest {
    @Test
    public void test1(){
        MinimumAmountOfTimeToCollectGarbage test = new MinimumAmountOfTimeToCollectGarbage();
        Assert.assertEquals(21, test.garbageCollection(new String[]{"G","P","GP","GG"}, new int[]{2,4,3}));
    }

    @Test
    public void test2(){
        MinimumAmountOfTimeToCollectGarbage test = new MinimumAmountOfTimeToCollectGarbage();
        Assert.assertEquals(37, test.garbageCollection(new String[]{"MMM","PGM","GP"}, new int[]{3,10}));
    }
}
