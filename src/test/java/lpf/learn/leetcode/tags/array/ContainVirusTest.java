package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class ContainVirusTest {

    @Test
    public void test1(){
        ContainVirus test = new ContainVirus();
        Assert.assertEquals(10, test.containVirus(new int[][]{{0,1,0,0,0,0,0,1},{0,1,0,0,0,0,0,1},{0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,0}}));
    }

    @Test
    public void test2(){
        ContainVirus test = new ContainVirus();
        Assert.assertEquals(4, test.containVirus(new int[][]{{1,1,1},{1,0,1},{1,1,1}}));

    }

    @Test
    public void test3(){
        ContainVirus test = new ContainVirus();
        Assert.assertEquals(13, test.containVirus(new int[][]{{1,1,1,0,0,0,0,0,0},{1,0,1,0,1,1,1,1,1},{1,1,1,0,0,0,0,0,0}}));
    }

    @Test
    public void test4(){
        ContainVirus test = new ContainVirus();
        Assert.assertEquals(0, test.containVirus(new int[][]{{1}}));
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
