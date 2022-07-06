package lpf.learn.leetcode.game.weekly300;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfIncreasingPathsInAGridTest {

    @Test
    public void test1(){
        NumberOfIncreasingPathsInAGrid test = new NumberOfIncreasingPathsInAGrid();
        Assert.assertEquals(8, test.countPaths(new int[][]{{1,1},{3,4}}));
    }

    @Test
    public void test2(){
        NumberOfIncreasingPathsInAGrid test = new NumberOfIncreasingPathsInAGrid();
        Assert.assertEquals(3, test.countPaths(new int[][]{{1},{2}}));
    }

    @Test
    public void test3(){

    }

    @Test
    public void test4(){

    }
    
}
