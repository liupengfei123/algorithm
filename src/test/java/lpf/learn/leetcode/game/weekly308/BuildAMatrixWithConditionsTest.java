package lpf.learn.leetcode.game.weekly308;

import org.junit.Assert;
import org.junit.Test;

public class BuildAMatrixWithConditionsTest {
    @Test
    public void test1(){
        BuildAMatrixWithConditions test = new BuildAMatrixWithConditions();
        Assert.assertArrayEquals(new int[][]{{3,0,0},{0,0,1},{0,2,0}}, test.buildMatrix(3, new int[][]{{1,2},{3,2}}, new int[][]{{2,1},{3,2}}));
    }


    @Test
    public void test2(){
        BuildAMatrixWithConditions test = new BuildAMatrixWithConditions();
        Assert.assertArrayEquals(new int[0][], test.buildMatrix(3, new int[][]{{1,2},{2,3},{3,1},{2,3}}, new int[][]{{2,1}}));
    }
}
