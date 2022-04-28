package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParityTest {
    @Test
    public void test1(){
        SortArrayByParity test = new SortArrayByParity();
        Assert.assertArrayEquals(new int[]{2, 1, 1}, test.sortArrayByParity(new int[]{1,2,1}));
    }

    @Test
    public void test2(){
        SortArrayByParity test = new SortArrayByParity();
        Assert.assertArrayEquals(new int[]{2, 4, 1, 3}, test.sortArrayByParity(new int[]{3,1,2,4}));
    }

    @Test
    public void test3(){
        SortArrayByParity test = new SortArrayByParity();
        Assert.assertArrayEquals(new int[]{0}, test.sortArrayByParity(new int[]{0}));
    }

    @Test
    public void test4(){
        FruitIntoBaskets test = new FruitIntoBaskets();
        Assert.assertEquals(5, test.totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }


}
