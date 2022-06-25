package lpf.learn.leetcode.game.weekly298;

import org.junit.Assert;
import org.junit.Test;

public class SumOfNumbersWithUnitsDigitKTest {
    @Test
    public void test1(){
        SumOfNumbersWithUnitsDigitK test = new SumOfNumbersWithUnitsDigitK();
        Assert.assertEquals(2, test.minimumNumbers(58, 9));
    }

    @Test
    public void test2(){
        SumOfNumbersWithUnitsDigitK test = new SumOfNumbersWithUnitsDigitK();
        Assert.assertEquals(-1, test.minimumNumbers(37, 2));
    }

    @Test
    public void test3(){
        SumOfNumbersWithUnitsDigitK test = new SumOfNumbersWithUnitsDigitK();
        Assert.assertEquals(0, test.minimumNumbers(0, 7));
    }

    @Test
    public void test4(){
        SumOfNumbersWithUnitsDigitK test = new SumOfNumbersWithUnitsDigitK();
        Assert.assertEquals(-1, test.minimumNumbers(2, 0));
    }

    @Test
    public void test5(){
        SumOfNumbersWithUnitsDigitK test = new SumOfNumbersWithUnitsDigitK();
        Assert.assertEquals(0, test.minimumNumbers(0, 0));
    }

    @Test
    public void test6(){
        SumOfNumbersWithUnitsDigitK test = new SumOfNumbersWithUnitsDigitK();
        Assert.assertEquals(5, test.minimumNumbers(5, 1));
    }

    @Test
    public void test7(){
        SumOfNumbersWithUnitsDigitK test = new SumOfNumbersWithUnitsDigitK();
        Assert.assertEquals(1, test.minimumNumbers(10, 0));
    }

    @Test
    public void test8(){
        SumOfNumbersWithUnitsDigitK test = new SumOfNumbersWithUnitsDigitK();
        Assert.assertEquals(6, test.minimumNumbers(18, 3));
    }

    @Test
    public void test9(){
        SumOfNumbersWithUnitsDigitK test = new SumOfNumbersWithUnitsDigitK();
        Assert.assertEquals(10, test.minimumNumbers(3000, 1));
    }
}

