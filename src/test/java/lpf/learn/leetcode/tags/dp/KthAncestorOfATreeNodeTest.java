package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class KthAncestorOfATreeNodeTest {
    @Test
    public void test1(){
        KthAncestorOfATreeNode test = new KthAncestorOfATreeNode(7, new int[]{-1,0,0,1,1,2,2});
        Assert.assertEquals(1, test.getKthAncestor(3,1));
        Assert.assertEquals(0, test.getKthAncestor(5,2));
        Assert.assertEquals(-1, test.getKthAncestor(6,3));
    }

}
