package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class RomanToIntegerTest {

    @Test
    public void test1() {
        RomanToInteger temp = new RomanToInteger();
        Assert.assertEquals(3, temp.romanToInt("III"));
    }

    @Test
    public void test2() {
        RomanToInteger temp = new RomanToInteger();
        Assert.assertEquals(4, temp.romanToInt("IV"));
    }

    @Test
    public void test3() {
        RomanToInteger temp = new RomanToInteger();
        Assert.assertEquals(9, temp.romanToInt("IX"));
    }

    @Test
    public void test4() {
        RomanToInteger temp = new RomanToInteger();
        Assert.assertEquals(8, temp.romanToInt("VIII"));
    }


    @Test
    public void test5() {
        RomanToInteger temp = new RomanToInteger();
        Assert.assertEquals(58, temp.romanToInt("LVIII"));
    }


    @Test
    public void test6() {
        RomanToInteger temp = new RomanToInteger();
        Assert.assertEquals(1994, temp.romanToInt("MCMXCIV"));
    }
}
