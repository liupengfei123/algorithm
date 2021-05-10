package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MinimumScoreTriangulationOfPolygonTest {
    @Test
    public void test1(){
        MinimumScoreTriangulationOfPolygon test = new MinimumScoreTriangulationOfPolygon();
        Assert.assertEquals(6, test.minScoreTriangulation(new int[]{1,2,3}));
    }

    @Test
    public void test2(){
        MinimumScoreTriangulationOfPolygon test = new MinimumScoreTriangulationOfPolygon();
        Assert.assertEquals(144, test.minScoreTriangulation(new int[]{3,7,4,5}));
    }

    @Test
    public void test3(){
        MinimumScoreTriangulationOfPolygon test = new MinimumScoreTriangulationOfPolygon();
        Assert.assertEquals(13, test.minScoreTriangulation(new int[]{1,3,1,4,1,5}));
    }




}
