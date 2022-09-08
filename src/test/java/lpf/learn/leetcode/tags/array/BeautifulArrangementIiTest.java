package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class BeautifulArrangementIiTest {

    @Test
    public void test1(){
        BeautifulArrangementIi test = new BeautifulArrangementIi();
        Assert.assertArrayEquals(new int[]{1,2,3}, test.constructArray(3, 1));
    }

    @Test
    public void test2(){
        BeautifulArrangementIi test = new BeautifulArrangementIi();
        Assert.assertArrayEquals(new int[]{1,3,2}, test.constructArray(3, 2));
    }

    @Test
    public void test3(){
        BeautifulArrangementIi test = new BeautifulArrangementIi();
        Assert.assertArrayEquals(new int[]{1,4,2,3}, test.constructArray(4, 3));
    }

    @Test
    public void test4(){
        BeautifulArrangementIi test = new BeautifulArrangementIi();
        Assert.assertArrayEquals(new int[]{1,3,2,4,5}, test.constructArray(5, 2));
    }

    @Test
    public void test5(){
        BeautifulArrangementIi test = new BeautifulArrangementIi();
        Assert.assertArrayEquals(new int[]{1,5,2,4,3}, test.constructArray(5, 4));
    }

    @Test
    public void test6(){
        BeautifulArrangementIi test = new BeautifulArrangementIi();
        Assert.assertArrayEquals(new int[]{1,4,2,3,5,6,7,8,9,10}, test.constructArray(10, 3));
    }

}
