package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class UglyNumberIiiTest {

    @Test
    public void test1(){
        UglyNumberIii test = new UglyNumberIii();
        Assert.assertEquals(1, test.nthUglyNumber(1,1,1,1));
    }

    @Test
    public void test2(){
        UglyNumberIii test = new UglyNumberIii();
        Assert.assertEquals(4, test.nthUglyNumber(3,2,3,5));
    }

    @Test
    public void test3(){
        UglyNumberIii test = new UglyNumberIii();
        Assert.assertEquals(6, test.nthUglyNumber(4,2,3,4));
    }

    @Test
    public void test4(){
        UglyNumberIii test = new UglyNumberIii();
        Assert.assertEquals(10, test.nthUglyNumber(5,2,11,13));
    }

    @Test
    public void test5(){
        UglyNumberIii test = new UglyNumberIii();
        Assert.assertEquals(8685, test.nthUglyNumber(1241,21,45,9));
    }
}
