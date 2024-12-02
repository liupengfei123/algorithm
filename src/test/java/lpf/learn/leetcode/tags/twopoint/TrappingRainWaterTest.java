package lpf.learn.leetcode.tags.twopoint;


import org.junit.Assert;
import org.junit.Test;

public class TrappingRainWaterTest {

    @Test
    public void test1(){
        TrappingRainWater test = new TrappingRainWater();
        Assert.assertEquals(6, test.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    @Test
    public void test2(){
        TrappingRainWater test = new TrappingRainWater();
        Assert.assertEquals(9, test.trap(new int[]{4,2,0,3,2,5}));
    }

    @Test
    public void test3(){
        TrappingRainWater test = new TrappingRainWater();
        Assert.assertEquals(0, test.trap(new int[]{9,7,5,3,1}));
    }

    @Test
    public void test4(){
        TrappingRainWater test = new TrappingRainWater();
        Assert.assertEquals(20, test.trap(new int[]{9,7,5,3,1,10}));
    }

    @Test
    public void test5(){
        TrappingRainWater test = new TrappingRainWater();
        Assert.assertEquals(8, test.trap(new int[]{9,1,9}));
    }

    @Test
    public void test9(){
        TrappingRainWater test = new TrappingRainWater();
        Assert.assertEquals(8, test.trap(new int[]{10,9,1,9}));
    }
}
