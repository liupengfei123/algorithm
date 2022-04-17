package lpf.learn.leetcode.game.weekly289;

import org.junit.Assert;
import org.junit.Test;

public class CalculateDigitSumOfAStringTest {
    @Test
    public void test1(){
        CalculateDigitSumOfAString test = new CalculateDigitSumOfAString();
        Assert.assertEquals("135", test.digitSum("11111222223", 3));
    }

    @Test
    public void test2(){
        CalculateDigitSumOfAString test = new CalculateDigitSumOfAString();
        Assert.assertEquals("000", test.digitSum("00000000", 3));
    }

    @Test
    public void test3(){
        CalculateDigitSumOfAString test = new CalculateDigitSumOfAString();
        Assert.assertEquals("757", test.digitSum("11111222351465216257224223", 3));
    }
}
