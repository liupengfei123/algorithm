package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class ExcelSheetColumnTitleTest {

    @Test
    public void test1() {
        ExcelSheetColumnTitle temp = new ExcelSheetColumnTitle();
        Assert.assertEquals("A", temp.convertToTitle(1));
    }

    @Test
    public void test2() {
        ExcelSheetColumnTitle temp = new ExcelSheetColumnTitle();
        Assert.assertEquals("Z", temp.convertToTitle(26));
    }

    @Test
    public void test3() {
        ExcelSheetColumnTitle temp = new ExcelSheetColumnTitle();
        Assert.assertEquals("AB", temp.convertToTitle(28));
    }

    @Test
    public void test4() {
        ExcelSheetColumnTitle temp = new ExcelSheetColumnTitle();
        Assert.assertEquals("ZY", temp.convertToTitle(701));
    }


    @Test
    public void test5() {
        ExcelSheetColumnTitle temp = new ExcelSheetColumnTitle();
        Assert.assertEquals("FXSHRXW", temp.convertToTitle(2147483647));
    }
}
