package lpf.learn.leetcode.game.weekly338;

import org.junit.Assert;
import org.junit.Test;

public class CollectCoinsInATreeTest {
    @Test
    public void test1(){
        CollectCoinsInATree test = new CollectCoinsInATree();
        Assert.assertEquals(2, test.collectTheCoins(new int[]{1,0,0,0,0,1}, new int[][]{{0,1},{1,2},{2,3},{3,4},{4,5}}));
    }

    @Test
    public void test2(){
            CollectCoinsInATree test = new CollectCoinsInATree();
            Assert.assertEquals(2, test.collectTheCoins(new int[]{0,0,0,1,1,0,0,1}, new int[][]{{0,1},{0,2},{1,3},{1,4},{2,5},{5,6},{5,7}}));
    }

}
