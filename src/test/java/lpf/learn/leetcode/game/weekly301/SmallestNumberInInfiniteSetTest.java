package lpf.learn.leetcode.game.weekly301;

import org.junit.Assert;
import org.junit.Test;

public class SmallestNumberInInfiniteSetTest {

    @Test
    public void test1(){
        SmallestNumberInInfiniteSet test = new SmallestNumberInInfiniteSet();

        test.addBack(2);

        Assert.assertEquals(1, test.popSmallest());
        Assert.assertEquals(2, test.popSmallest());
        Assert.assertEquals(3, test.popSmallest());

        test.addBack(1);

        Assert.assertEquals(1, test.popSmallest());


        Assert.assertEquals(4, test.popSmallest());
        Assert.assertEquals(5, test.popSmallest());

    }

    @Test
    public void test2(){
        SmallestNumberInInfiniteSet test = new SmallestNumberInInfiniteSet();
        Assert.assertEquals(1, test.popSmallest());
        Assert.assertEquals(2, test.popSmallest());
        Assert.assertEquals(3, test.popSmallest());
        Assert.assertEquals(4, test.popSmallest());

        test.addBack(2);

        Assert.assertEquals(2, test.popSmallest());
        Assert.assertEquals(5, test.popSmallest());

    }

}
