package lpf.learn.leetcode.game.weekly341;

import org.junit.Assert;
import org.junit.Test;

public class MinimizeTheTotalPriceOfTheTripsTest {

    @Test
    public void test1(){
        MinimizeTheTotalPriceOfTheTrips test = new MinimizeTheTotalPriceOfTheTrips();
        Assert.assertEquals(23, test.minimumTotalPrice(4, new int[][]{{0,1},{1,2},{1,3}}, new int[]{2,2,10,6}, new int[][]{{0,3},{2,1},{2,3}}));
    }

    @Test
    public void test2(){
        MinimizeTheTotalPriceOfTheTrips test = new MinimizeTheTotalPriceOfTheTrips();
        Assert.assertEquals(1, test.minimumTotalPrice(2, new int[][]{{0,1}}, new int[]{2,2}, new int[][]{{0,0}}));
    }

    @Test
    public void test3(){
        MinimizeTheTotalPriceOfTheTrips test = new MinimizeTheTotalPriceOfTheTrips();
        Assert.assertEquals(2037, test.minimumTotalPrice(5, new int[][]{{1,2},{2,0},{0,3},{3,4}}, new int[]{12,26,22,12,2}, new int[][]{{3,3},{3,2},{3,0},{3,4},{1,1},{2,2},{4,0},{0,2},{2,3},{2,1},{4,2},{0,1},{4,2},{0,4},{0,3},{4,0},{4,0},{3,3},{4,3},{2,2},{4,2},{1,4},{3,2},{4,4},{4,2},{2,3},{4,3},{4,4},{4,2},{0,4},{4,2},{3,4},{4,0},{3,2},{3,1},{2,0},{0,4},{3,4},{2,0},{1,4},{4,2},{4,4},{2,1},{0,1},{4,1},{3,4},{0,4},{2,0},{2,0},{3,3},{4,4},{0,1},{0,1},{0,1},{2,0},{0,1},{3,1},{3,4},{3,4},{4,2},{0,4},{4,4},{3,2},{2,1},{3,2},{1,4},{1,0},{4,2},{4,3},{3,1},{4,4},{3,1},{1,0},{0,0},{0,0},{3,0},{0,2},{2,2},{3,3},{0,3}}));
    }

    @Test
    public void test4(){
        MinimizeTheTotalPriceOfTheTrips test = new MinimizeTheTotalPriceOfTheTrips();
        Assert.assertEquals(429, test.minimumTotalPrice(9, new int[][]{{2,5},{3,4},{4,1},{1,7},{6,7},{7,0},{0,5},{5,8}}, new int[]{4,4,6,4,2,4,2,14,8}, new int[][]{{1,5},{2,7},{4,3},{1,8},{2,8},{4,3},{1,5},{1,4},{2,1},{6,0},{0,7},{8,6},{4,0},{7,5},{7,5},{6,0},{5,1},{1,1},{7,5},{1,7},{8,7},{2,3},{4,1},{3,5},{2,5},{3,7},{0,1},{5,8},{5,3},{5,2}}));
    }
}
