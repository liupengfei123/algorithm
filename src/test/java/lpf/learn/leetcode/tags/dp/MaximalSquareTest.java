package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MaximalSquareTest {
    @Test
    public void test1() {
        MaximalSquare test = new MaximalSquare();
        char[][] matrix = new char[][]{
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}};
        Assert.assertEquals(4, test.maximalSquare(matrix));
    }

    @Test
    public void test2(){
        MaximalSquare test = new MaximalSquare();
        char[][] matrix = new char[][]{
                {'0','1'},
                {'1','0'}};
        Assert.assertEquals(1, test.maximalSquare(matrix));
    }

    @Test
    public void test3(){
        MaximalSquare test = new MaximalSquare();
        char[][] matrix = new char[][]{
                {'0'}};
        Assert.assertEquals(0, test.maximalSquare(matrix));
    }

    @Test
    public void test4(){
        MaximalSquare test = new MaximalSquare();
        char[][] matrix = new char[][]{
                {'1','0','1','0','0'},
                {'1','1','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','1','1','0'}};
        Assert.assertEquals(4, test.maximalSquare(matrix));
    }

    @Test
    public void test5(){
        MaximalSquare test = new MaximalSquare();
        char[][] matrix = new char[][]{
                {'1','1','1','0','0'},
                {'1','1','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','1','1','1'}};
        Assert.assertEquals(9, test.maximalSquare(matrix));
    }
}
