package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

public class CorporateFlightBookingsTest {

    @Test
    public void test1(){
        CorporateFlightBookings test = new CorporateFlightBookings();
        Assert.assertArrayEquals(new int[]{10,55,45,25,25}, test.corpFlightBookings(new int[][]{{1,2,10},{2,3,20},{2,5,25}}, 5));
    }

    @Test
    public void test2(){
        CorporateFlightBookings test = new CorporateFlightBookings();
        Assert.assertArrayEquals(new int[]{10,25}, test.corpFlightBookings(new int[][]{{1,2,10},{2,2,15}}, 2));
    }
}
