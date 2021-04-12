package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class ChampagneTowerTest {
    @Test
    public void test1(){
        ChampagneTower test = new ChampagneTower();
        Assert.assertEquals(0, test.champagneTower(1, 1, 1), 0.00001);
    }

    @Test
    public void test2(){
        ChampagneTower test = new ChampagneTower();
        Assert.assertEquals(0.5, test.champagneTower(2, 1, 1), 0.00001);
    }

    @Test
    public void test3(){
        ChampagneTower test = new ChampagneTower();
        Assert.assertEquals(0.75, test.champagneTower(6, 2, 0), 0.00001);
    }

    @Test
    public void test4(){
        ChampagneTower test = new ChampagneTower();
        Assert.assertEquals(0.25, test.champagneTower(6, 3, 1), 0.00001);
    }

    @Test
    public void test5(){
        ChampagneTower test = new ChampagneTower();
        Assert.assertEquals(0.5, test.champagneTower(7, 3, 1), 0.00001);
    }

    @Test
    public void test6(){
        ChampagneTower test = new ChampagneTower();
        Assert.assertEquals(1, test.champagneTower(10, 3, 1), 0.00001);
    }


    @Test
    public void test7(){
        ChampagneTower test = new ChampagneTower();
        Assert.assertEquals(1, test.champagneTower(100000009, 33, 17), 0.00001);
    }

}
