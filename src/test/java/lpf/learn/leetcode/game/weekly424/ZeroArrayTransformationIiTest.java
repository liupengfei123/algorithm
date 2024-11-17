package lpf.learn.leetcode.game.weekly424;

import org.junit.Assert;
import org.junit.Test;

public class ZeroArrayTransformationIiTest {
    @Test
    public void test1(){
        ZeroArrayTransformationIi test = new ZeroArrayTransformationIi();
        Assert.assertEquals(2, test.minZeroArray(new int[]{2,0,2}, new int[][]{{0,2,1},{0,2,1},{1,1,3}}));
    }


    @Test
    public void test2(){
        ZeroArrayTransformationIi test = new ZeroArrayTransformationIi();
        Assert.assertEquals(-1, test.minZeroArray(new int[]{4,3,2,1}, new int[][]{{1,3,2},{0,2,1}}));
    }

    @Test
    public void test3(){
        ZeroArrayTransformationIi test = new ZeroArrayTransformationIi();
        Assert.assertEquals(0, test.minZeroArray(new int[]{0, 0,0}, new int[][]{{0,2,1},{0,2,1},{1,1,3}}));
    }
}
