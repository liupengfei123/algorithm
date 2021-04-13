package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class CheapestFlightsWithinKStopsTest {
    @Test
    public void test1(){
        CheapestFlightsWithinKStops test = new CheapestFlightsWithinKStops();
        int[][] flights = new int[][]{{0,1,100},{1,2,100},{0,2,500}};
        Assert.assertEquals(200, test.findCheapestPrice(3, flights, 0, 2, 1));
    }

    @Test
    public void test2(){
        CheapestFlightsWithinKStops test = new CheapestFlightsWithinKStops();
        int[][] flights = new int[][]{{0,1,100},{1,2,100},{0,2,500}};
        Assert.assertEquals(500, test.findCheapestPrice(3, flights, 0, 2, 0));
    }

    @Test
    public void test3(){
        CheapestFlightsWithinKStops test = new CheapestFlightsWithinKStops();
        int[][] flights = new int[][]{{0,1,300},{1,2,300},{0,2,200}};
        Assert.assertEquals(200, test.findCheapestPrice(3, flights, 0, 2, 2));
    }

    @Test
    public void test4(){
        CheapestFlightsWithinKStops test = new CheapestFlightsWithinKStops();
        int[][] flights = new int[][]{{0,1,200},{1,2,300},{0,2,500},{1,3,100},{2,3,700}};
        Assert.assertEquals(300, test.findCheapestPrice(4, flights, 0, 3, 3));
    }
}
