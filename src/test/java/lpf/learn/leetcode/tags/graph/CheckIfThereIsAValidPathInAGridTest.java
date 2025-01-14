package lpf.learn.leetcode.tags.graph;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfThereIsAValidPathInAGridTest {
    @Test
    public void test1(){
        CheckIfThereIsAValidPathInAGrid test = new CheckIfThereIsAValidPathInAGrid();
        Assert.assertTrue(test.hasValidPath(new int[][]{{2, 4, 3}, {6, 5, 2}}));
    }

    @Test
    public void test2(){
        CheckIfThereIsAValidPathInAGrid test = new CheckIfThereIsAValidPathInAGrid();
        Assert.assertFalse(test.hasValidPath(new int[][]{{1, 2, 1}, {1, 2, 1}}));
    }

    @Test
    public void test3(){
        CheckIfThereIsAValidPathInAGrid test = new CheckIfThereIsAValidPathInAGrid();
        Assert.assertFalse(test.hasValidPath(new int[][]{{1, 1, 2}}));
    }

    @Test
    public void test4(){
        CheckIfThereIsAValidPathInAGrid test = new CheckIfThereIsAValidPathInAGrid();
        Assert.assertTrue(test.hasValidPath(new int[][]{{1, 1, 1, 1, 1, 1, 3}}));
    }

    @Test
    public void test5(){
        CheckIfThereIsAValidPathInAGrid test = new CheckIfThereIsAValidPathInAGrid();
        Assert.assertFalse(test.hasValidPath(new int[][]{{2, 6}}));
    }
}
