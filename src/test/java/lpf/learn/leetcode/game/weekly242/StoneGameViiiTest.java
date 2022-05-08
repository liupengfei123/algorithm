package lpf.learn.leetcode.game.weekly242;

import org.junit.Assert;
import org.junit.Test;

public class StoneGameViiiTest {
    @Test
    public void test1(){
        StoneGameViii test = new StoneGameViii();
        Assert.assertEquals(5, test.stoneGameVIII(new int[]{-1,2,-3,4,-5}));
    }

    @Test
    public void test2(){
        StoneGameViii test = new StoneGameViii();
        Assert.assertEquals(13, test.stoneGameVIII(new int[]{7,-6,5,10,5,-2,-6}));
    }

    @Test
    public void test3(){
        StoneGameViii test = new StoneGameViii();
        Assert.assertEquals(-22, test.stoneGameVIII(new int[]{-10,-12}));
    }
}
