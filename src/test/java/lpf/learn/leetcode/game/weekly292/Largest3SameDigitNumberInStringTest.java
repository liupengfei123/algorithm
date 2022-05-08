package lpf.learn.leetcode.game.weekly292;

import org.junit.Assert;
import org.junit.Test;

public class Largest3SameDigitNumberInStringTest {
    @Test
    public void test1(){
        Largest3SameDigitNumberInString test = new Largest3SameDigitNumberInString();
        Assert.assertEquals("777", test.largestGoodInteger("6777133339"));
    }

    @Test
    public void test2(){
        Largest3SameDigitNumberInString test = new Largest3SameDigitNumberInString();
        Assert.assertEquals("000", test.largestGoodInteger("2300019"));
    }

    @Test
    public void test3(){
        Largest3SameDigitNumberInString test = new Largest3SameDigitNumberInString();
        Assert.assertEquals("", test.largestGoodInteger("42352338"));
    }




}
