package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

public class StringToIntegerAtoiTest {

    @Test
    public void test1() {
        StringToIntegerAtoi temp = new StringToIntegerAtoi();
        Assert.assertEquals(42, temp.myAtoi("42"));
    }

    @Test
    public void test2() {
        StringToIntegerAtoi temp = new StringToIntegerAtoi();
        Assert.assertEquals(-42, temp.myAtoi("   -42"));
    }

    @Test
    public void test3() {
        StringToIntegerAtoi temp = new StringToIntegerAtoi();
        Assert.assertEquals(0, temp.myAtoi("   -+42"));
    }

    @Test
    public void test4() {
        StringToIntegerAtoi temp = new StringToIntegerAtoi();
        Assert.assertEquals(4193, temp.myAtoi("4193 with words"));
    }


    @Test
    public void test5() {
        StringToIntegerAtoi temp = new StringToIntegerAtoi();
        Assert.assertEquals(0, temp.myAtoi("words and 987"));
    }


    @Test
    public void test6() {
        StringToIntegerAtoi temp = new StringToIntegerAtoi();
        Assert.assertEquals(-2147483648, temp.myAtoi("-91283472332"));
    }

    @Test
    public void test7() {
        StringToIntegerAtoi temp = new StringToIntegerAtoi();
        Assert.assertEquals(12345678, temp.myAtoi("0000000000012345678"));
    }

    @Test
    public void test8() {
        StringToIntegerAtoi temp = new StringToIntegerAtoi();
        Assert.assertEquals(2147483647, temp.myAtoi("1234567891011121314151713131313131312"));
    }
}
