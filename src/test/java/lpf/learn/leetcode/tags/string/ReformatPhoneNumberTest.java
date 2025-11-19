package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class ReformatPhoneNumberTest {

    @Test
    public void test1() {
        ReformatPhoneNumber temp = new ReformatPhoneNumber();
        Assert.assertEquals("123-456", temp.reformatNumber("1-23-45 6"));
    }

    @Test
    public void test2() {
        ReformatPhoneNumber temp = new ReformatPhoneNumber();
        Assert.assertEquals("123-45-67", temp.reformatNumber("123 4-567"));
    }

    @Test
    public void test3() {
        ReformatPhoneNumber temp = new ReformatPhoneNumber();
        Assert.assertEquals("123-456-78", temp.reformatNumber("123 4-5678"));
    }

    @Test
    public void test4() {
        ReformatPhoneNumber temp = new ReformatPhoneNumber();
        Assert.assertEquals("12", temp.reformatNumber("12"));
    }

    @Test
    public void test5() {
        ReformatPhoneNumber temp = new ReformatPhoneNumber();
        Assert.assertEquals("175-229-353-94-75", temp.reformatNumber("--17-5 229 35-39475 "));
    }

    @Test
    public void test6() {
        ReformatPhoneNumber temp = new ReformatPhoneNumber();
        Assert.assertEquals("99-64", temp.reformatNumber("9964-"));
    }
}
