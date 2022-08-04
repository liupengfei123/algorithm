package lpf.learn.leetcode.game.weekly304;

import org.junit.Assert;
import org.junit.Test;

public class FindClosestNodeToGivenTwoNodesTest {
    @Test
    public void test1(){
        FindClosestNodeToGivenTwoNodes test = new FindClosestNodeToGivenTwoNodes();
        Assert.assertEquals(2, test.closestMeetingNode(new int[]{2,2,3,-1}, 0, 1));
    }

    @Test
    public void test2(){
        FindClosestNodeToGivenTwoNodes test = new FindClosestNodeToGivenTwoNodes();
        Assert.assertEquals(2, test.closestMeetingNode(new int[]{1,2,-1}, 0, 2));
    }
}
