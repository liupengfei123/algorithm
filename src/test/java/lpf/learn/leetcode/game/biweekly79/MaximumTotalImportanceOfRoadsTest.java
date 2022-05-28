package lpf.learn.leetcode.game.biweekly79;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTotalImportanceOfRoadsTest {
    @Test
    public void test1(){
        MaximumTotalImportanceOfRoads test = new MaximumTotalImportanceOfRoads();
        Assert.assertEquals(43, test.maximumImportance(5, new int[][]{{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}}));
    }


    @Test
    public void test2(){
        MaximumTotalImportanceOfRoads test = new MaximumTotalImportanceOfRoads();
        Assert.assertEquals(20, test.maximumImportance(5, new int[][]{{0,3},{2,4},{1,3}}));
    }

    @Test
    public void test3(){
        MaximumTotalImportanceOfRoads test = new MaximumTotalImportanceOfRoads();
        Assert.assertEquals(17, test.maximumImportance(5, new int[][]{{0,3},{1,3}}));
    }
}
