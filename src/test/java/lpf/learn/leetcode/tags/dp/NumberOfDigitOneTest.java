package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfDigitOneTest {
    @Test
    public void test1(){
        NumberOfDigitOne test = new NumberOfDigitOne();
        Assert.assertEquals(1, test.countDigitOne(1));
    }

    @Test
    public void test2(){
        NumberOfDigitOne test = new NumberOfDigitOne();
        Assert.assertEquals(0, test.countDigitOne(0));
    }


    @Test
    public void test3(){
        NumberOfDigitOne test = new NumberOfDigitOne();
        Assert.assertEquals(20, test.countDigitOne(99));
    }


    @Test
    public void test4(){
        NumberOfDigitOne test = new NumberOfDigitOne();
        Assert.assertEquals(6, test.countDigitOne(13));
    }

    @Test
    public void test5(){
        NumberOfDigitOne test = new NumberOfDigitOne();
        Assert.assertEquals(761, test.countDigitOne(1300));
    }

    @Test
    public void test6(){
        NumberOfDigitOne test = new NumberOfDigitOne();
        Assert.assertEquals(900000001, test.countDigitOne(1000000000));
    }

    @Test
    public void test7(){
        NumberOfDigitOne test = new NumberOfDigitOne();
        Assert.assertEquals(604225078, test.countDigitOne(620236879));
    }
}
