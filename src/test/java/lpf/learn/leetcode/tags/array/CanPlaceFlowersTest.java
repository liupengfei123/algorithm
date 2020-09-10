package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class CanPlaceFlowersTest {

    @Test
    public void test1(){
        CanPlaceFlowers test = new CanPlaceFlowers();
        Assert.assertTrue(test.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }

    @Test
    public void test2(){
        CanPlaceFlowers test = new CanPlaceFlowers();
        Assert.assertFalse(test.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }

    @Test
    public void test3(){
        CanPlaceFlowers test = new CanPlaceFlowers();
        Assert.assertTrue(test.canPlaceFlowers(new int[]{0,0,0,0,0}, 3));
    }

    @Test
    public void test4(){
        CanPlaceFlowers test = new CanPlaceFlowers();
        Assert.assertFalse(test.canPlaceFlowers(new int[]{0, 0, 0, 0, 0}, 4));
    }

    @Test
    public void test5(){
        CanPlaceFlowers test = new CanPlaceFlowers();
        Assert.assertTrue(test.canPlaceFlowers(new int[]{0,1,0,0,0}, 1));
    }

    @Test
    public void test6(){
        CanPlaceFlowers test = new CanPlaceFlowers();
        Assert.assertFalse(test.canPlaceFlowers(new int[]{0, 1, 0, 0, 0}, 2));
    }
}
