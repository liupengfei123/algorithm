package lpf.learn.leetcode.tags.sort;

import org.junit.Assert;
import org.junit.Test;

public class LargestNumberTest {
    @Test
    public void test1(){
        LargestNumber test = new LargestNumber();
        Assert.assertEquals("210", test.largestNumber(new int[]{10,2}));
    }

    @Test
    public void test2(){
        LargestNumber test = new LargestNumber();
        Assert.assertEquals("990", test.largestNumber(new int[]{9,90}));
    }

    @Test
    public void test3(){
        LargestNumber test = new LargestNumber();
        Assert.assertEquals("99010", test.largestNumber(new int[]{9,90,10}));
    }

    @Test
    public void test4(){
        LargestNumber test = new LargestNumber();
        Assert.assertEquals("9534330", test.largestNumber(new int[]{3,30,34,5,9}));
    }

    @Test
    public void test5(){
        LargestNumber test = new LargestNumber();
        Assert.assertEquals("10", test.largestNumber(new int[]{10}));
    }

    @Test
    public void test6(){
        LargestNumber test = new LargestNumber();
        Assert.assertEquals("1", test.largestNumber(new int[]{1}));
    }

    @Test
    public void test7(){
        LargestNumber test = new LargestNumber();
        Assert.assertEquals("34341", test.largestNumber(new int[]{34,341}));
    }

    @Test
    public void test8(){
        LargestNumber test = new LargestNumber();
        Assert.assertEquals("34634", test.largestNumber(new int[]{34,346}));
    }


    @Test
    public void test9(){
        LargestNumber test = new LargestNumber();
        Assert.assertEquals("3460034", test.largestNumber(new int[]{34,34600}));
    }

    @Test
    public void test10(){
        LargestNumber test = new LargestNumber();
        Assert.assertEquals("43243432", test.largestNumber(new int[]{432,43243}));
    }

    @Test
    public void test11(){
        LargestNumber test = new LargestNumber();
        Assert.assertEquals("432432431", test.largestNumber(new int[]{432,432431}));
    }

    @Test
    public void test12(){
        LargestNumber test = new LargestNumber();
        Assert.assertEquals("1113111311", test.largestNumber(new int[]{111311,1113}));
    }

    @Test
    public void test13(){
        LargestNumber test = new LargestNumber();
        Assert.assertEquals("0", test.largestNumber(new int[]{0,0}));
    }

    @Test
    public void test14(){
        LargestNumber test = new LargestNumber();
        Assert.assertEquals("999999999999999998999999997", test.largestNumber(new int[]{999999998,999999997,999999999}));
    }

    @Test
    public void test15(){
        LargestNumber test = new LargestNumber();
        Assert.assertEquals("9876543210", test.largestNumber(new int[]{0,9,8,7,6,5,4,3,2,1}));
    }
}
