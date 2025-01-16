package lpf.learn.leetcode.tags.graph;

import org.junit.Assert;
import org.junit.Test;

public class ShortestPathInBinaryMatrixTest {
    @Test
    public void test1(){
        ShortestPathInBinaryMatrix test = new ShortestPathInBinaryMatrix();
        Assert.assertEquals(2, test.shortestPathBinaryMatrix(new int[][]{{0,1},{1,0}}));
    }

    @Test
    public void test2(){
        ShortestPathInBinaryMatrix test = new ShortestPathInBinaryMatrix();
        Assert.assertEquals(4, test.shortestPathBinaryMatrix(new int[][]{{0,0,0},{1,1,0},{1,1,0}}));
    }

    @Test
    public void test3(){
        ShortestPathInBinaryMatrix test = new ShortestPathInBinaryMatrix();
        Assert.assertEquals(-1, test.shortestPathBinaryMatrix(new int[][]{{1,0,0},{1,1,0},{1,1,0}}));
    }
}
