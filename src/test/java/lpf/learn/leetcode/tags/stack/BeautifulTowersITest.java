package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class BeautifulTowersITest {

    @Test
    public void test1(){
        BeautifulTowersI test = new BeautifulTowersI();
        Assert.assertEquals(13, test.maximumSumOfHeights(new int[]{5,3,4,1,1}));
    }

    @Test
    public void test2(){
        BeautifulTowersI test = new BeautifulTowersI();
        Assert.assertEquals(22, test.maximumSumOfHeights(new int[]{6,5,3,9,2,7}));
    }

    @Test
    public void test3(){
        BeautifulTowersI test = new BeautifulTowersI();
        Assert.assertEquals(18, test.maximumSumOfHeights(new int[]{3,2,5,5,2,3}));
    }
}
