package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MinimumCostForTicketsTest {
    @Test
    public void test1(){
        MinimumCostForTickets test = new MinimumCostForTickets();
        Assert.assertEquals(11, test.mincostTickets(new int[]{1,4,6,7,8,20}, new int[]{2,7,15}));
    }

    @Test
    public void test2(){
        MinimumCostForTickets test = new MinimumCostForTickets();
        Assert.assertEquals(17, test.mincostTickets(new int[]{1,2,3,4,5,6,7,8,9,10,30,31}, new int[]{2,7,15}));
    }

    @Test
    public void test3(){
        MinimumCostForTickets test = new MinimumCostForTickets();
        Assert.assertEquals(26, test.mincostTickets(new int[]{1,2,3,4,5,6,7,8,9,10,30,31,32,33,34,40,41,44}, new int[]{2,7,15}));
    }

    @Test
    public void test4(){
        MinimumCostForTickets test = new MinimumCostForTickets();
        Assert.assertEquals(32, test.mincostTickets(new int[]{1,2,3,4,5,6,7,8,9,10,30,31,32,33,34,40,41,44}, new int[]{2,10,30}));
    }

    @Test
    public void test5(){
        MinimumCostForTickets test = new MinimumCostForTickets();
        Assert.assertEquals(40, test.mincostTickets(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,30,31,32,33,34,40,41,44}, new int[]{2,10,30}));
    }

    @Test
    public void test6(){
        MinimumCostForTickets test = new MinimumCostForTickets();
        Assert.assertEquals(370, test.mincostTickets(getTestArray(), new int[]{2,10,30}));
    }

    @Test
    public void test7(){
        MinimumCostForTickets test = new MinimumCostForTickets();
        Assert.assertEquals(2480, test.mincostTickets(getTestArray(), new int[]{40,80,200}));
    }

    @Test
    public void test8(){
        MinimumCostForTickets test = new MinimumCostForTickets();
        Assert.assertEquals(9800, test.mincostTickets(getTestArray(), new int[]{40,200,800}));
    }


    private int[] getTestArray() {
        int[] testArray = new int[365];
        for (int i = 1; i <= 365; i++) {
            testArray[i - 1] = i;
        }
        return testArray;
    }
}
