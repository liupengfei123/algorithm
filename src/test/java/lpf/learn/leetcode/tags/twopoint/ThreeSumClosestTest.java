package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class ThreeSumClosestTest {
    @Test
    public void test1(){
        ThreeSumClosest test = new ThreeSumClosest();
        Assert.assertEquals(2, test.threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }

    @Test
    public void test2(){
        ThreeSumClosest test = new ThreeSumClosest();
        Assert.assertEquals(0, test.threeSumClosest(new int[]{0,0,0}, 1));
    }

    @Test
    public void test3(){
        ThreeSumClosest test = new ThreeSumClosest();
        Assert.assertEquals(-2, test.threeSumClosest(new int[]{4,0,5,-5,3,3,0,-4,-5}, -2));
    }
}
