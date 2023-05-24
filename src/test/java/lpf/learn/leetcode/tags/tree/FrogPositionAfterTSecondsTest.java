package lpf.learn.leetcode.tags.tree;

import org.junit.Assert;
import org.junit.Test;

public class FrogPositionAfterTSecondsTest {


    @Test
    public void test1() {
        FrogPositionAfterTSeconds temp = new FrogPositionAfterTSeconds();
        Assert.assertEquals(0.16667, temp.frogPosition(7, new int[][]{{1,2},{1,3},{1,7},{2,4},{2,6},{3,5}}, 2, 4), 0.00001);
    }

    @Test
    public void test2() {
        FrogPositionAfterTSeconds temp = new FrogPositionAfterTSeconds();
        Assert.assertEquals(0.33333, temp.frogPosition(7, new int[][]{{1,2},{1,3},{1,7},{2,4},{2,6},{3,5}}, 1, 7), 0.00001);
    }

    @Test
    public void test3() {
        FrogPositionAfterTSeconds temp = new FrogPositionAfterTSeconds();
        Assert.assertEquals(0, temp.frogPosition(7, new int[][]{{1,2},{1,3},{1,7},{2,4},{2,6},{3,5}}, 1, 6), 0.00001);
    }

    @Test
    public void test4() {
        FrogPositionAfterTSeconds temp = new FrogPositionAfterTSeconds();
        Assert.assertEquals(0, temp.frogPosition(8, new int[][]{{2,1},{3,2},{4,1},{5,1},{6,4},{7,1},{8,7}}, 7, 7), 0.00001);
    }
}
