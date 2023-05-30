package lpf.learn.leetcode.game.weekly347;

import org.junit.Assert;
import org.junit.Test;

public class MaximumStrictlyIncreasingCellsInAMatrixTest {

    @Test
    public void test1(){
        MaximumStrictlyIncreasingCellsInAMatrix test = new MaximumStrictlyIncreasingCellsInAMatrix();
        Assert.assertEquals(2, test.maxIncreasingCells(new int[][]{{3,1},{3,4}}));
    }


    @Test
    public void test2(){
        MaximumStrictlyIncreasingCellsInAMatrix test = new MaximumStrictlyIncreasingCellsInAMatrix();
        Assert.assertEquals(1, test.maxIncreasingCells(new int[][]{{1,1},{1,1}}));
    }


    @Test
    public void test3(){
        MaximumStrictlyIncreasingCellsInAMatrix test = new MaximumStrictlyIncreasingCellsInAMatrix();
        Assert.assertEquals(4, test.maxIncreasingCells(new int[][]{{3,1,6},{-9,5,7}}));
    }


    @Test
    public void test4(){
        MaximumStrictlyIncreasingCellsInAMatrix test = new MaximumStrictlyIncreasingCellsInAMatrix();
        Assert.assertEquals(6, test.maxIncreasingCells(new int[][]{{5,2,9},{-6,2,-5},{-1,0,-5}}));
    }

    @Test
    public void test5(){
        MaximumStrictlyIncreasingCellsInAMatrix test = new MaximumStrictlyIncreasingCellsInAMatrix();
        Assert.assertEquals(2, test.maxIncreasingCells(new int[][]{{-7},{1}}));
    }

    @Test
    public void test6(){
        MaximumStrictlyIncreasingCellsInAMatrix test = new MaximumStrictlyIncreasingCellsInAMatrix();
        Assert.assertEquals(8, test.maxIncreasingCells(new int[][]{{1,7,3,0,7,-4},{-4,-2,-2,-2,-7,5},{0,3,4,4,-9,2}}));
    }

    @Test
    public void test7(){
        MaximumStrictlyIncreasingCellsInAMatrix test = new MaximumStrictlyIncreasingCellsInAMatrix();
        Assert.assertEquals(7, test.maxIncreasingCells(new int[][]{{-9,-1,7,6},{-4,8,8,-6},{-5,-1,-6,6},{7,-5,-3,1},{7,7,-8,9}}));
    }
}
