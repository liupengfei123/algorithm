package lpf.learn.leetcode.tags.BinarySearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-05-09 18:17
 */
public class HIndexIiTest {
    @Test
    public void test1(){
        HIndexIi test = new HIndexIi();
        Assert.assertEquals(3, test.hIndex(new int[]{0,1,3,5,6}));
    }

    @Test
    public void test2(){
        HIndexIi test = new HIndexIi();
        Assert.assertEquals(5, test.hIndex(new int[]{6,6,6,6,6}));
    }

    @Test
    public void test3(){
        HIndexIi test = new HIndexIi();
        Assert.assertEquals(4, test.hIndex(new int[]{0,4,5,5,6}));
    }

    @Test
    public void test4(){
        HIndexIi test = new HIndexIi();
        Assert.assertEquals(0, test.hIndex(new int[]{0}));
    }
}
