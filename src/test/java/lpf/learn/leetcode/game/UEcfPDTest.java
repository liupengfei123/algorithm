package lpf.learn.leetcode.game;

import org.junit.Assert;
import org.junit.Test;

public class UEcfPDTest {
    @Test
    public void test1(){
        UEcfPD test = new UEcfPD();
        Assert.assertEquals(7, test.perfectMenu(new int[]{3,2,4,1,2}, new int[][]{{1,1,0,1,2},{2,1,4,0,0},{3,2,4,1,0}}, new int[][]{{3,2},{2,4},{7,6}}, 5));
    }

    @Test
    public void test2(){
        UEcfPD test = new UEcfPD();
        Assert.assertEquals(11, test.perfectMenu(new int[]{10,10,10,10,10}, new int[][]{{1,1,1,1,1},{3,3,3,3,3},{10,10,10,10,10}}, new int[][]{{5,5},{6,6},{10,10}}, 1));
    }

    @Test
    public void test3(){
        UEcfPD test = new UEcfPD();
        Assert.assertEquals(-1, test.perfectMenu(new int[]{0,10,10,10,10}, new int[][]{{1,1,1,1,1},{3,3,3,3,3},{10,10,10,10,10}}, new int[][]{{5,5},{6,6},{10,10}}, 1));
    }

    @Test
    public void test4(){
        UEcfPD test = new UEcfPD();
        Assert.assertEquals(5, test.perfectMenu(new int[]{0,10,10,10,10}, new int[][]{{0,1,1,1,1},{3,3,3,3,3},{10,10,10,10,10}}, new int[][]{{5,5},{6,6},{10,10}}, 1));
    }

    @Test
    public void test5(){
        UEcfPD test = new UEcfPD();
        Assert.assertEquals(11, test.perfectMenu(new int[]{10,10,10,10,10}, new int[][]{{1,1,1,1,1},{10,10,10,10,10},{3,3,3,3,3}}, new int[][]{{5,5},{10,10},{6,6}}, 1));
    }

    @Test
    public void test6(){
        UEcfPD test = new UEcfPD();
        Assert.assertEquals(11, test.perfectMenu(new int[]{10,10,10,10,10}, new int[][]{{6,6,6,6,6},{1,1,1,1,1},{4,4,4,4,4}}, new int[][]{{5,5},{1,1},{6,6}}, 1));
    }
}
