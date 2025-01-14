package lpf.learn.leetcode.tags.graph;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfMovesInAGridTest {
    @Test
    public void test1(){
        MaximumNumberOfMovesInAGrid test = new MaximumNumberOfMovesInAGrid();
        Assert.assertEquals(3, test.maxMoves(new int[][]{{2,4,3,5},{5,4,9,3},{3,4,2,11},{10,9,13,15}}));
    }

    @Test
    public void test2(){
        MaximumNumberOfMovesInAGrid test = new MaximumNumberOfMovesInAGrid();
        Assert.assertEquals(0, test.maxMoves(new int[][]{{3,2,4},{2,1,9},{1,1,7}}));
    }
}
