package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class FruitIntoBasketsTest {
    @Test
    public void test1(){
        FruitIntoBaskets test = new FruitIntoBaskets();
        Assert.assertEquals(3, test.totalFruit(new int[]{1,2,1}));
    }

    @Test
    public void test2(){
        FruitIntoBaskets test = new FruitIntoBaskets();
        Assert.assertEquals(3, test.totalFruit(new int[]{0,1,2,2}));
    }

    @Test
    public void test3(){
        FruitIntoBaskets test = new FruitIntoBaskets();
        Assert.assertEquals(4, test.totalFruit(new int[]{1,2,3,2,2}));
    }

    @Test
    public void test4(){
        FruitIntoBaskets test = new FruitIntoBaskets();
        Assert.assertEquals(5, test.totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }


}
