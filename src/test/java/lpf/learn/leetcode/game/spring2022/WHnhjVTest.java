package lpf.learn.leetcode.game.spring2022;

import org.junit.Assert;
import org.junit.Test;

public class WHnhjVTest {
    @Test
    public void test1(){
        WHnhjV test = new WHnhjV();
        Assert.assertEquals(2, test.giveGem(new int[]{3,1,2}, new int[][]{{0,2},{2,1},{2,0}}));
    }

    @Test
    public void test2(){
        WHnhjV test = new WHnhjV();
        Assert.assertEquals(75, test.giveGem(new int[]{100,0,50,100}, new int[][]{{0,2},{0,1},{3,0},{3,0}}));
    }

    @Test
    public void test3(){
        WHnhjV test = new WHnhjV();
        Assert.assertEquals(0, test.giveGem(new int[]{0,0,0,0}, new int[][]{{1,2},{3,1},{1,2}}));
    }
}
