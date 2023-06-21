package lpf.learn.leetcode.game.weekly350;

import org.junit.Assert;
import org.junit.Test;

public class PaintingTheWallsTest {
    @Test
    public void test1(){
        PaintingTheWalls test = new PaintingTheWalls();
        Assert.assertEquals(3, test.paintWalls(new int[]{1,2,3,2}, new int[]{1,2,3,2}));
    }

    @Test
    public void test2(){
        PaintingTheWalls test = new PaintingTheWalls();
        Assert.assertEquals(4, test.paintWalls(new int[]{2,3,4,2}, new int[]{1,1,1,1}));
    }

}
