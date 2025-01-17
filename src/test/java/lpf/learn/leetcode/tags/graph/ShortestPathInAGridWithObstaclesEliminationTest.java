package lpf.learn.leetcode.tags.graph;

import org.junit.Assert;
import org.junit.Test;

public class ShortestPathInAGridWithObstaclesEliminationTest {
    @Test
    public void test1(){
        ShortestPathInAGridWithObstaclesElimination test = new ShortestPathInAGridWithObstaclesElimination();
        Assert.assertEquals(6, test.shortestPath(new int[][]{{0,0,0},{1,1,0},{0,0,0},{0,1,1},{0,0,0}}, 1));
    }

    @Test
    public void test2(){
        ShortestPathInAGridWithObstaclesElimination test = new ShortestPathInAGridWithObstaclesElimination();
        Assert.assertEquals(-1, test.shortestPath(new int[][]{{0,1,1},{1,1,1},{1,0,0}}, 1));
    }

    @Test
    public void test3(){
        ShortestPathInAGridWithObstaclesElimination test = new ShortestPathInAGridWithObstaclesElimination();
        Assert.assertEquals(14, test.shortestPath(new int[][]{{0,0},{1,0},{1,0},{1,0},{1,0},{1,0},{0,0},{0,1},{0,1},{0,1},{0,0},{1,0},{1,0},{0,0}}, 4));
    }

    @Test
    public void test4(){
        ShortestPathInAGridWithObstaclesElimination test = new ShortestPathInAGridWithObstaclesElimination();
        Assert.assertEquals(13, test.shortestPath(new int[][]{{0,1,0,0,0,1,0,0},{0,1,0,1,0,1,0,1},{0,0,0,1,0,0,1,0}}, 1));
    }

}
