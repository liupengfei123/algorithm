package lpf.learn.leetcode.tags.graph;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfWaysToReconstructATreeTest {
    @Test
    public void test1(){
        NumberOfWaysToReconstructATree test = new NumberOfWaysToReconstructATree();
        Assert.assertEquals(1, test.checkWays(new int[][]{{1,2},{2,3}}));
    }

    @Test
    public void test2(){
        NumberOfWaysToReconstructATree test = new NumberOfWaysToReconstructATree();
        Assert.assertEquals(0, test.checkWays(new int[][]{{1,2},{2,3},{2,4},{1,5}}));
    }

    @Test
    public void test3(){
        NumberOfWaysToReconstructATree test = new NumberOfWaysToReconstructATree();
        Assert.assertEquals(2, test.checkWays(new int[][]{{1,2},{2,3},{1,3}}));
    }




}
