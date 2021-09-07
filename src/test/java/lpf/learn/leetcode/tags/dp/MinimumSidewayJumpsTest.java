package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MinimumSidewayJumpsTest {

    @Test
    public void test1(){
        MinimumSidewayJumps test = new MinimumSidewayJumps();
        Assert.assertEquals(2, test.minSideJumps(new int[]{0,1,2,3,0}));
    }

    @Test
    public void test2(){
        MinimumSidewayJumps test = new MinimumSidewayJumps();
        Assert.assertEquals(0, test.minSideJumps(new int[]{0,1,1,3,3,0}));
    }

    @Test
    public void test3(){
        MinimumSidewayJumps test = new MinimumSidewayJumps();
        Assert.assertEquals(2, test.minSideJumps(new int[]{0,2,1,0,3,0}));
    }

    @Test
    public void test4(){
        MinimumSidewayJumps test = new MinimumSidewayJumps();
        Assert.assertEquals(3, test.minSideJumps(new int[]{0,1,2,3,2,1,0}));
    }

    @Test
    public void test5(){
        MinimumSidewayJumps test = new MinimumSidewayJumps();
        Assert.assertEquals(2, test.minSideJumps(new int[]{0,0,3,1,0,1,0,2,3,1,0}));
    }
}
