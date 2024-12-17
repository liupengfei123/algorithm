package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSpeedtoArriveonTimeTest {
    @Test
    public void test1(){
        MinimumSpeedtoArriveonTime test = new MinimumSpeedtoArriveonTime();
        Assert.assertEquals(1, test.minSpeedOnTime(new int[]{1,3,2}, 6));
    }

    @Test
    public void test2(){
        MinimumSpeedtoArriveonTime test = new MinimumSpeedtoArriveonTime();
        Assert.assertEquals(3, test.minSpeedOnTime(new int[]{1,3,2}, 2.7));
    }

    @Test
    public void test3(){
        MinimumSpeedtoArriveonTime test = new MinimumSpeedtoArriveonTime();
        Assert.assertEquals(10, test.minSpeedOnTime(new int[]{1,3,2}, 2.2));
    }

    @Test
    public void test4(){
        MinimumSpeedtoArriveonTime test = new MinimumSpeedtoArriveonTime();
        Assert.assertEquals(-1, test.minSpeedOnTime(new int[]{1,3,2}, 1.9));
    }

    @Test
    public void test5(){
        MinimumSpeedtoArriveonTime test = new MinimumSpeedtoArriveonTime();
        Assert.assertEquals(10000000, test.minSpeedOnTime(new int[]{1,1,100000}, 2.01));
    }

    @Test
    public void test6(){
        MinimumSpeedtoArriveonTime test = new MinimumSpeedtoArriveonTime();
        Assert.assertEquals(-1, test.minSpeedOnTime(new int[]{1,1}, 1.0));
    }
}
