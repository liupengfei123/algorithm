package lpf.learn.leetcode.game.weekly345;

import org.junit.Assert;
import org.junit.Test;

public class CountTheNumberOfCompleteComponentsTest {
    @Test
    public void test1(){
        CountTheNumberOfCompleteComponents test = new CountTheNumberOfCompleteComponents();
        Assert.assertEquals(3, test.countCompleteComponents(6, new int[][]{{0,1},{0,2},{1,2},{3,4}}));
    }


    @Test
    public void test2(){
        CountTheNumberOfCompleteComponents test = new CountTheNumberOfCompleteComponents();
        Assert.assertEquals(1, test.countCompleteComponents(6, new int[][]{{0,1},{0,2},{1,2},{3,4},{3,5}}));
    }

    @Test
    public void test3(){
        CountTheNumberOfCompleteComponents test = new CountTheNumberOfCompleteComponents();
        Assert.assertEquals(0, test.countCompleteComponents(4, new int[][]{{2,0},{2,1},{3,2}}));
    }

}