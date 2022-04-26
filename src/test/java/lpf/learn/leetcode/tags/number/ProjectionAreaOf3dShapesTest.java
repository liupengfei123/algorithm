package lpf.learn.leetcode.tags.number;

import org.junit.Assert;
import org.junit.Test;

public class ProjectionAreaOf3dShapesTest {
    @Test
    public void test1(){
        ProjectionAreaOf3dShapes test = new ProjectionAreaOf3dShapes();
        Assert.assertEquals(17, test.projectionArea(new int[][]{{1,2},{3,4}}));
    }

    @Test
    public void test2(){
        ProjectionAreaOf3dShapes test = new ProjectionAreaOf3dShapes();
        Assert.assertEquals(5, test.projectionArea(new int[][]{{2}}));
    }

    @Test
    public void test3(){
        ProjectionAreaOf3dShapes test = new ProjectionAreaOf3dShapes();
        Assert.assertEquals(8, test.projectionArea(new int[][]{{1,0},{0,2}}));
    }


    @Test
    public void test4(){
        ProjectionAreaOf3dShapes test = new ProjectionAreaOf3dShapes();
        Assert.assertEquals(498, test.projectionArea(new int[][]{{1,2,0,5,6,10,1,2},{2,2,7,5,7,0,12,23},{17,21,20,35,16,10,7,12},{13,25,16,15,26,19,31,23},{11,12,20,25,16,1,11,17},{7,12,20,25,9,41,27,32},{11,24,0,0,0,12,4,9},{0,0,0,1,26,10,1,2}}));
    }

}
