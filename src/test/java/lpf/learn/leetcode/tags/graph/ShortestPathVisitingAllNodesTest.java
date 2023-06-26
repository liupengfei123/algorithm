package lpf.learn.leetcode.tags.graph;

import org.junit.Assert;
import org.junit.Test;

public class ShortestPathVisitingAllNodesTest {
    @Test
    public void test1(){
        ShortestPathVisitingAllNodes  test = new ShortestPathVisitingAllNodes ();
        Assert.assertEquals(4, test.shortestPathLength(new int[][]{{1,2,3},{0},{0},{0}}));
    }

    @Test
    public void test2(){
        ShortestPathVisitingAllNodes  test = new ShortestPathVisitingAllNodes ();
        Assert.assertEquals(4, test.shortestPathLength(new int[][]{{1},{0,2,4},{1,3,4},{2},{1,2}}));
    }
}
