package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class IntegerToRomanTest {

    @Test
    public void test1() {
        IntegerToRoman temp = new IntegerToRoman();
        Assert.assertEquals("III", temp.intToRoman(3));
    }

    @Test
    public void test2() {
        IntegerToRoman temp = new IntegerToRoman();
        Assert.assertEquals("IV", temp.intToRoman(4));
    }

    @Test
    public void test3() {
        IntegerToRoman temp = new IntegerToRoman();
        Assert.assertEquals("VIII", temp.intToRoman(8));
    }

    @Test
    public void test4() {
        IntegerToRoman temp = new IntegerToRoman();
        Assert.assertEquals("IX", temp.intToRoman(9));
    }


    @Test
    public void test5() {
        IntegerToRoman temp = new IntegerToRoman();
        Assert.assertEquals("LVIII", temp.intToRoman(58));
    }


    @Test
    public void test6() {
        IntegerToRoman temp = new IntegerToRoman();
        Assert.assertEquals("MCMXCIV", temp.intToRoman(1994));
    }
}
