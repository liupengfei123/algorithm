package lpf.learn.leetcode.game.biweekly106;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class FindAGoodSubsetOfTheMatrixTest {
    @Test
    public void test1(){
        FindAGoodSubsetOfTheMatrix test = new FindAGoodSubsetOfTheMatrix();
        Assert.assertEquals(Arrays.asList(0, 1), test.goodSubsetofBinaryMatrix(new int[][]{{0,1,1,0},{0,0,0,1},{1,1,1,1}}));
    }

    @Test
    public void test2(){
        FindAGoodSubsetOfTheMatrix test = new FindAGoodSubsetOfTheMatrix();
        Assert.assertEquals(Collections.singletonList(0), test.goodSubsetofBinaryMatrix(new int[][]{{0,0,0},{1,0,1},{1,1,1}}));
    }

    @Test
    public void test3(){
        FindAGoodSubsetOfTheMatrix test = new FindAGoodSubsetOfTheMatrix();
        Assert.assertEquals(Arrays.asList(0, 2), test.goodSubsetofBinaryMatrix(new int[][]{{1,0,0,1,0},{1,0,1,0,1},{0,0,0,0,1},{1,0,1,1,1}}));
    }

    @Test
    public void test4(){
        FindAGoodSubsetOfTheMatrix test = new FindAGoodSubsetOfTheMatrix();
        Assert.assertEquals(Collections.emptyList(), test.goodSubsetofBinaryMatrix(new int[][]{{1,1,1,1,1},{1,1,1,1,1}}));
    }

    @Test
    public void test5(){
        FindAGoodSubsetOfTheMatrix test = new FindAGoodSubsetOfTheMatrix();
        Assert.assertEquals(Arrays.asList(1, 4), test.goodSubsetofBinaryMatrix(new int[][]{{1,1,1,0,0},{0,1,0,1,0},{1,0,0,1,0},{0,1,1,1,0},{1,0,1,0,0},{1,0,0,1,0},{0,1,1,1,1}}));
    }
}
