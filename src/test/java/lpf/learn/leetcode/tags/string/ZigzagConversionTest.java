package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class ZigzagConversionTest {

    @Test
    public void test1() {
        ZigzagConversion temp = new ZigzagConversion();
        Assert.assertEquals("PAYPALISHIRING", temp.convert("PAYPALISHIRING", 1));
    }

    @Test
    public void test2() {
        ZigzagConversion temp = new ZigzagConversion();
        Assert.assertEquals("PAHNAPLSIIGYIR", temp.convert("PAYPALISHIRING", 3));
    }

    @Test
    public void test3() {
        ZigzagConversion temp = new ZigzagConversion();
        Assert.assertEquals("PINALSIGYAHRPI", temp.convert("PAYPALISHIRING", 4));
    }

    @Test
    public void test4() {
        ZigzagConversion temp = new ZigzagConversion();
        Assert.assertEquals("A", temp.convert("A", 1));
    }

    @Test
    public void test5() {
        ZigzagConversion temp = new ZigzagConversion();
        Assert.assertEquals("ABCDEFG", temp.convert("ABCDEFG", 7));
    }
}
