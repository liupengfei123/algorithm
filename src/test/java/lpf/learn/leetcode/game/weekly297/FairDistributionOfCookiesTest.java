package lpf.learn.leetcode.game.weekly297;

import org.junit.Assert;
import org.junit.Test;

public class FairDistributionOfCookiesTest {

    @Test
    public void test1(){
        FairDistributionOfCookies test = new FairDistributionOfCookies();
        Assert.assertEquals(31, test.distributeCookies(new int[]{8,15,10,20,8}, 2));
    }

    @Test
    public void test2(){
        FairDistributionOfCookies test = new FairDistributionOfCookies();
        Assert.assertEquals(7, test.distributeCookies(new int[]{6,1,3,2,2,4,1,2}, 3));
    }

    @Test
    public void test3(){
        FairDistributionOfCookies test = new FairDistributionOfCookies();
        Assert.assertEquals(5, test.distributeCookies(new int[]{1,1,1,1,1,1,1,1,1}, 2));
    }

    @Test
    public void test4(){
        FairDistributionOfCookies test = new FairDistributionOfCookies();
        Assert.assertEquals(32, test.distributeCookies(new int[]{15,14,8,13,7,2,13,19}, 3));
    }
}
