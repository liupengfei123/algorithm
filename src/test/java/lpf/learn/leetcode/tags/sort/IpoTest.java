package lpf.learn.leetcode.tags.sort;

import org.junit.Assert;
import org.junit.Test;

public class IpoTest {
    @Test
    public void test1(){
        Ipo test = new Ipo();
        Assert.assertEquals(4, test.findMaximizedCapital(2, 0, new int[]{1,2,3}, new int[]{0,1,1}));
    }

    @Test
    public void test2(){
        Ipo test = new Ipo();
        Assert.assertEquals(6, test.findMaximizedCapital(3, 0, new int[]{1,2,3}, new int[]{0,1,2}));
    }
}
