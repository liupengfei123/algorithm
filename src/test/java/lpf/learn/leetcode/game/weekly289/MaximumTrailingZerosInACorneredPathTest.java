package lpf.learn.leetcode.game.weekly289;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTrailingZerosInACorneredPathTest {
    @Test
    public void test1(){
        MaximumTrailingZerosInACorneredPath test = new MaximumTrailingZerosInACorneredPath();
        Assert.assertEquals(3, test.maxTrailingZeros(new int[][]{{23,17,15,3,20},{8,1,20,27,11},{9,4,6,2,21},{40,9,1,10,6},{22,7,4,5,3}}));
    }

    @Test
    public void test2(){
        MaximumTrailingZerosInACorneredPath test = new MaximumTrailingZerosInACorneredPath();
        Assert.assertEquals(0, test.maxTrailingZeros(new int[][]{{4,3,2},{7,6,1},{8,8,8}}));
    }

    @Test
    public void test3(){
        MaximumTrailingZerosInACorneredPath test = new MaximumTrailingZerosInACorneredPath();
        Assert.assertEquals(6, test.maxTrailingZeros(new int[][]{{824,709,193,413,701,836,727},{135,844,599,211,140,933,205},{329,68,285,282,301,387,231}
                ,{293,210,478,352,946,902,137},{806,900,290,636,589,522,611},
                {450,568,990,592,992,128,92},{780,653,795,457,980,942,927},{849,901,604,906,912,866,688}}));
    }

    @Test
    public void test4(){
        MaximumTrailingZerosInACorneredPath test = new MaximumTrailingZerosInACorneredPath();
        Assert.assertEquals(3, test.maxTrailingZeros(new int[][]{{1,5,2,4,25}}));
    }
}
