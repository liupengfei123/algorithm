package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumberIiTest {

    @Test
    public void test1(){
        SingleNumberIi test = new SingleNumberIi();
        Assert.assertEquals(5, test.singleNumber(new int[]{1,1,1,5}));
    }


    @Test
    public void test2(){
        SingleNumberIi test = new SingleNumberIi();
        Assert.assertEquals(6, test.singleNumber(new int[]{1,6,1,1}));
    }


    @Test
    public void test3(){
        SingleNumberIi test = new SingleNumberIi();
        Assert.assertEquals(99, test.singleNumber(new int[]{0,1,0,1,0,1,99}));
    }

    @Test
    public void test4(){
        SingleNumberIi test = new SingleNumberIi();
        Assert.assertEquals(9, test.singleNumber(new int[]{5,9,5,5}));
    }
}
