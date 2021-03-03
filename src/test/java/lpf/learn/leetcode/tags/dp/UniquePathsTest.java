package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class UniquePathsTest {
    @Test
    public void test1(){
        UniquePaths test = new UniquePaths();
        Assert.assertEquals(6, test.uniquePaths(3,3));
    }

    @Test
    public void test2(){
        UniquePaths test = new UniquePaths();
        Assert.assertEquals(28, test.uniquePaths(7,3));
    }

    @Test
    public void test3(){
        UniquePaths test = new UniquePaths();
        Assert.assertEquals(28, test.uniquePaths(3,7));
    }

    @Test
    public void test4(){
        UniquePaths test = new UniquePaths();
        Assert.assertEquals(3, test.uniquePaths(3,2));
    }
}
