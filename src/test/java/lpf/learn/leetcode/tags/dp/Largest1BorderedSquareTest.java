package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class Largest1BorderedSquareTest {
    @Test
    public void test1(){
        Largest1BorderedSquare test = new Largest1BorderedSquare();
        Assert.assertEquals(9, test.largest1BorderedSquare(new int[][]{{1,1,1},{1,0,1},{1,1,1}}));
    }

    @Test
    public void test2(){
        Largest1BorderedSquare test = new Largest1BorderedSquare();
        Assert.assertEquals(1, test.largest1BorderedSquare(new int[][]{{1,1,0,0}}));
    }

    @Test
    public void test3(){
        Largest1BorderedSquare test = new Largest1BorderedSquare();
        Assert.assertEquals(9, test.largest1BorderedSquare(new int[][]{{1,1,1,1},{1,0,1,0},{1,1,1,1},{1,0,0,1}}));
    }





}
