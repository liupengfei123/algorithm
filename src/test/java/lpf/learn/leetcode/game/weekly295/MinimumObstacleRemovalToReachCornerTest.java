package lpf.learn.leetcode.game.weekly295;

import org.junit.Assert;
import org.junit.Test;

public class MinimumObstacleRemovalToReachCornerTest {

    @Test
    public void test1(){
        MinimumObstacleRemovalToReachCorner test = new MinimumObstacleRemovalToReachCorner();
        Assert.assertEquals(2, test.minimumObstacles(new int[][]{{0,1,1},{1,1,0},{1,1,0}}));
    }

    @Test
    public void test2(){
        MinimumObstacleRemovalToReachCorner test = new MinimumObstacleRemovalToReachCorner();
        Assert.assertEquals(0, test.minimumObstacles(new int[][]{{0,1,0,0,0},{0,1,0,1,0},{0,0,0,1,0}}));
    }

}
