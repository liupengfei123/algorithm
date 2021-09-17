package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class CountSquareSubmatricesWithAllOnesTest {
    @Test
    public void test1(){
        CountSquareSubmatricesWithAllOnes test = new CountSquareSubmatricesWithAllOnes();
        Assert.assertEquals(15, test.countSquares(new int[][]{{0,1,1,1},{1,1,1,1},{0,1,1,1}}));
    }

    @Test
    public void test2(){
        CountSquareSubmatricesWithAllOnes test = new CountSquareSubmatricesWithAllOnes();
        Assert.assertEquals(7, test.countSquares(new int[][]{{1,0,1},{1,1,0},{1,1,0}}));
    }

    @Test
    public void test3(){
        CountSquareSubmatricesWithAllOnes test = new CountSquareSubmatricesWithAllOnes();
        Assert.assertEquals(17, test.countSquares(new int[][]{{0,1,1,1},{1,1,1,1},{1,1,1,1}}));
    }
}
