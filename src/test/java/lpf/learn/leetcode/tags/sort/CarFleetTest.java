package lpf.learn.leetcode.tags.sort;

import org.junit.Assert;
import org.junit.Test;

public class CarFleetTest {
    @Test
    public void test1(){
        CarFleet test = new CarFleet();
        Assert.assertEquals(3, test.carFleet(12, new int[]{10,8,0,5,3}, new int[]{2,4,1,1,3}));
    }

    @Test
    public void test2(){
        CarFleet test = new CarFleet();
        Assert.assertEquals(6, test.carFleet(31, new int[]{5,26,18,25,29,21,22,12,19,6}, new int[]{7,6,6,4,3,4,9,7,6,4}));
    }

    @Test
    public void test3(){
        CarFleet test = new CarFleet();
        Assert.assertEquals(4, test.carFleet(55680,
                new int[]{53519,40853,7008,47279,31279,36173,16808,2024,21908,21794},
                new int[]{524396,467454,287575,112625,961858,134139,415285,182401,334920,70493}));
    }

    @Test
    public void test4(){
        CarFleet test = new CarFleet();
        Assert.assertEquals(2, test.carFleet(12, new int[]{10,8,7,5,3}, new int[]{2,9,6,1,3}));
    }

    @Test
    public void test5(){
        CarFleet test = new CarFleet();
        Assert.assertEquals(0, test.carFleet(12, new int[]{}, new int[]{}));
    }
}
