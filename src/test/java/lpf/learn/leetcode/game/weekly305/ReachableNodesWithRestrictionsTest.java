package lpf.learn.leetcode.game.weekly305;

import org.junit.Assert;
import org.junit.Test;

public class ReachableNodesWithRestrictionsTest {
    @Test
    public void test1(){
        ReachableNodesWithRestrictions test = new ReachableNodesWithRestrictions();
        Assert.assertEquals(4, test.reachableNodes(7, new int[][]{{0,1},{1,2},{3,1},{4,0},{0,5},{5,6}}, new int[]{4,5}));
    }

 

}
