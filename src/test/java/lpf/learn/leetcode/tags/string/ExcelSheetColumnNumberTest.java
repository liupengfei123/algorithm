package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class ExcelSheetColumnNumberTest {

    @Test
    public void test1() {
        ExcelSheetColumnNumber temp = new ExcelSheetColumnNumber();
        Assert.assertEquals(1, temp.titleToNumber("A"));
    }

    @Test
    public void test2() {
        ExcelSheetColumnNumber temp = new ExcelSheetColumnNumber();
        Assert.assertEquals(27, temp.titleToNumber("AA"));
    }

    @Test
    public void test3() {
        ExcelSheetColumnNumber temp = new ExcelSheetColumnNumber();
        Assert.assertEquals(28, temp.titleToNumber("AB"));
    }

    @Test
    public void test4() {
        ExcelSheetColumnNumber temp = new ExcelSheetColumnNumber();
        Assert.assertEquals(701, temp.titleToNumber("ZY"));
    }


    @Test
    public void test5() {
        ExcelSheetColumnNumber temp = new ExcelSheetColumnNumber();
        Assert.assertEquals(2147483647, temp.titleToNumber("FXSHRXW"));
    }
}
