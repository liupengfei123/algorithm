package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class ConvertANumberToHexadecimalTest {

    @Test
    public void test1(){
        ConvertANumberToHexadecimal test = new ConvertANumberToHexadecimal();
        Assert.assertEquals("1a", test.toHex(26));
    }


    @Test
    public void test2(){
        ConvertANumberToHexadecimal test = new ConvertANumberToHexadecimal();
        Assert.assertEquals("0", test.toHex(0));
    }


    @Test
    public void test3(){
        ConvertANumberToHexadecimal test = new ConvertANumberToHexadecimal();
        Assert.assertEquals("ffffffff", test.toHex(-1));
    }


    @Test
    public void test4(){
        ConvertANumberToHexadecimal test = new ConvertANumberToHexadecimal();
        Assert.assertEquals("7fffffff", test.toHex(2147483647));
    }

    @Test
    public void test5(){
        ConvertANumberToHexadecimal test = new ConvertANumberToHexadecimal();
        Assert.assertEquals("80000000", test.toHex(-2147483648));
    }
}
