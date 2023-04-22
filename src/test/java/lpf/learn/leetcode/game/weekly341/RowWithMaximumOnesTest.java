package lpf.learn.leetcode.game.weekly341;

import org.junit.Assert;
import org.junit.Test;

public class RowWithMaximumOnesTest {

    @Test
    public void test1(){
        RowWithMaximumOnes test = new RowWithMaximumOnes();
        Assert.assertArrayEquals(new int[]{0,1}, test.rowAndMaximumOnes(new int[][]{{0,1},{1,0}}));
    }

    @Test
    public void test2(){
        RowWithMaximumOnes test = new RowWithMaximumOnes();
        Assert.assertArrayEquals(new int[]{1,2}, test.rowAndMaximumOnes(new int[][]{{0,0,0},{0,1,1}}));
    }

    @Test
    public void test3(){
        RowWithMaximumOnes test = new RowWithMaximumOnes();
        Assert.assertArrayEquals(new int[]{1,2}, test.rowAndMaximumOnes(new int[][]{{0,0},{1,1},{0,0}}));
    }
}
