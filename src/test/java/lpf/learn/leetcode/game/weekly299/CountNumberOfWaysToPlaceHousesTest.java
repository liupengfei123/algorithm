package lpf.learn.leetcode.game.weekly299;

import org.junit.Assert;
import org.junit.Test;

public class CountNumberOfWaysToPlaceHousesTest {

    @Test
    public void test1(){
        CountNumberOfWaysToPlaceHouses test = new CountNumberOfWaysToPlaceHouses();
        Assert.assertEquals(4, test.countHousePlacements(1));
    }


    @Test
    public void test2(){
        CountNumberOfWaysToPlaceHouses test = new CountNumberOfWaysToPlaceHouses();
        Assert.assertEquals(9, test.countHousePlacements(2));
    }


    @Test
    public void test3(){
        CountNumberOfWaysToPlaceHouses test = new CountNumberOfWaysToPlaceHouses();
        Assert.assertEquals(25, test.countHousePlacements(3));
    }

    @Test
    public void test4(){
        CountNumberOfWaysToPlaceHouses test = new CountNumberOfWaysToPlaceHouses();
        Assert.assertEquals(452249287, test.countHousePlacements(9468));
    }

    @Test
    public void test5(){
        CountNumberOfWaysToPlaceHouses test = new CountNumberOfWaysToPlaceHouses();
        Assert.assertEquals(452249287, test.countHousePlacements(10000));
    }
}
