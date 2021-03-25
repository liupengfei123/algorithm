package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class OutOfBoundaryPathsTest {
    @Test
    public void test1() {
        OutOfBoundaryPaths test = new OutOfBoundaryPaths();
        Assert.assertEquals(6, test.findPaths(2, 2, 2, 0, 0));
    }

    @Test
    public void test2() {
        OutOfBoundaryPaths test = new OutOfBoundaryPaths();
        Assert.assertEquals(2046, test.findPaths(2, 2, 10, 0, 0));
    }


    @Test
    public void test3() {
        OutOfBoundaryPaths test = new OutOfBoundaryPaths();
        Assert.assertEquals(12, test.findPaths(1, 3, 3, 0, 1));
    }

    @Test
    public void test4() {
        OutOfBoundaryPaths test = new OutOfBoundaryPaths();
        Assert.assertEquals(1104, test.findPaths(2, 3, 8, 1, 0));
    }

    @Test
    public void test5() {
        OutOfBoundaryPaths test = new OutOfBoundaryPaths();
        Assert.assertEquals(914783380, test.findPaths(8, 50, 23, 5, 26));
    }
}
