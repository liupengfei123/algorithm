package lpf.learn.leetcode.game.biweekly81;

import org.junit.Assert;
import org.junit.Test;

public class CountUnreachablePairsOfNodesInAnUndirectedGraphTest {

    @Test
    public void test1(){
        CountUnreachablePairsOfNodesInAnUndirectedGraph test = new CountUnreachablePairsOfNodesInAnUndirectedGraph();
        Assert.assertEquals(0, test.countPairs(3, new int[][]{{0,1},{0,2},{1,2}}));
    }


    @Test
    public void test2(){
        CountUnreachablePairsOfNodesInAnUndirectedGraph test = new CountUnreachablePairsOfNodesInAnUndirectedGraph();
        Assert.assertEquals(14, test.countPairs(7, new int[][]{{0,2},{0,5},{2,4},{1,6},{5,4}}));
    }

    @Test
    public void test3(){
        CountUnreachablePairsOfNodesInAnUndirectedGraph test = new CountUnreachablePairsOfNodesInAnUndirectedGraph();
        Assert.assertEquals(66, test.countPairs(12, new int[][]{}));
    }
}
