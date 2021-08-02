package lpf.learn.leetcode.tags.graph;

import lpf.learn.leetcode.tags.dp.ArithmeticSlices;
import org.junit.Assert;
import org.junit.Test;

public class NetworkDelayTimeTest {
    @Test
    public void test1(){
        NetworkDelayTime test = new NetworkDelayTime();
        Assert.assertEquals(2, test.networkDelayTime(new int[][]{{2,1,1},{2,3,1},{3,4,1}}, 4,2));
    }

    @Test
    public void test2(){
        NetworkDelayTime test = new NetworkDelayTime();
        Assert.assertEquals(1, test.networkDelayTime(new int[][]{{1,2,1}}, 2,1));
    }

    @Test
    public void test3(){
        NetworkDelayTime test = new NetworkDelayTime();
        Assert.assertEquals(-1, test.networkDelayTime(new int[][]{{1,2,1}}, 2,2));
    }

    @Test
    public void test4(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(11, test.numberOfArithmeticSlices(new int[]{1, 2, 3, 4, 5, 6, 8, 10}));
    }

    @Test
    public void test5(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(3, test.numberOfArithmeticSlices(new int[]{7, 7, 7, 7}));
    }

    @Test
    public void test6(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(0, test.numberOfArithmeticSlices(new int[]{1, 1, 2, 5, 7}));
    }



}
