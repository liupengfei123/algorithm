package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MinimumLimitOfBallsInABagTest {

    @Test
    public void test1(){
        MinimumLimitOfBallsInABag test = new MinimumLimitOfBallsInABag();
        Assert.assertEquals(3, test.minimumSize(new int[]{9}, 2));
    }

    @Test
    public void test2(){
        MinimumLimitOfBallsInABag test = new MinimumLimitOfBallsInABag();
        Assert.assertEquals(2, test.minimumSize(new int[]{2,4,8,2}, 4));
    }

    @Test
    public void test3(){
        MinimumLimitOfBallsInABag test = new MinimumLimitOfBallsInABag();
        Assert.assertEquals(7, test.minimumSize(new int[]{7,17}, 2));
    }

    @Test
    public void test4(){
        MinimumLimitOfBallsInABag test = new MinimumLimitOfBallsInABag();
        Assert.assertEquals(1, test.minimumSize(new int[]{1}, 1));
    }
}
