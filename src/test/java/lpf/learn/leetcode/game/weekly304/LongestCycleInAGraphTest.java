package lpf.learn.leetcode.game.weekly304;

import org.junit.Assert;
import org.junit.Test;

public class LongestCycleInAGraphTest {
    @Test
    public void test1(){
        LongestCycleInAGraph test = new LongestCycleInAGraph();
        Assert.assertEquals(3, test.longestCycle(new int[]{3,3,4,2,3}));
    }

    @Test
    public void test2(){
        LongestCycleInAGraph test = new LongestCycleInAGraph();
        Assert.assertEquals(-1, test.longestCycle(new int[]{2,-1,3,1}));
    }

    @Test
    public void test3(){
        LongestCycleInAGraph test = new LongestCycleInAGraph();
        Assert.assertEquals(-1, test.longestCycle(new int[]{-1,4,-1,2,0,4}));
    }


    @Test
    public void test4(){
        LongestCycleInAGraph test = new LongestCycleInAGraph();
        Assert.assertEquals(3, test.longestCycle(new int[]{3,4,0,2,-1,2}));
    }
}
