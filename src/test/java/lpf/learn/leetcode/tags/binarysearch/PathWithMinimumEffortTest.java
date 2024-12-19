package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class PathWithMinimumEffortTest {

    @Test
    public void test1(){
        PathWithMinimumEffort test = new PathWithMinimumEffort();
        Assert.assertEquals(2, test.minimumEffortPath(new int[][]{{1,2,2},{3,8,2},{5,3,5}}));
    }

    @Test
    public void test2(){
        PathWithMinimumEffort test = new PathWithMinimumEffort();
        Assert.assertEquals(1, test.minimumEffortPath(new int[][]{{1,2,3},{3,8,4},{5,3,5}}));
    }

    @Test
    public void test3(){
        PathWithMinimumEffort test = new PathWithMinimumEffort();
        Assert.assertEquals(0, test.minimumEffortPath(new int[][]{{1,2,1,1,1},{1,2,1,2,1},{1,2,1,2,1},{1,2,1,2,1},{1,1,1,2,1}}));
    }

    @Test
    public void test4(){
        PathWithMinimumEffort test = new PathWithMinimumEffort();
        Assert.assertEquals(2, test.minimumEffortPath(new int[][]{{1,2,2},{3,8,2},{5,3,5}}));
    }
}
