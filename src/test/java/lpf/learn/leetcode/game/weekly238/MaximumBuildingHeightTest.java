package lpf.learn.leetcode.game.weekly238;

import org.junit.Assert;
import org.junit.Test;

public class MaximumBuildingHeightTest {
    @Test
    public void test1(){
        MaximumBuildingHeight test = new MaximumBuildingHeight();
        Assert.assertEquals(2, test.maxBuilding(5, new int[][]{{2,1},{4,1}}));
    }
}
