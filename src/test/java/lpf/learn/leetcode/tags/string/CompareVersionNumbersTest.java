package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class CompareVersionNumbersTest {

    @Test
    public void test1() {
        CompareVersionNumbers temp = new CompareVersionNumbers();
        Assert.assertEquals(0, temp.compareVersion("1.01", "1.001"));
    }

    @Test
    public void test2() {
        CompareVersionNumbers temp = new CompareVersionNumbers();
        Assert.assertEquals(0, temp.compareVersion("1.0", "1.0.0"));
    }

    @Test
    public void test3() {
        CompareVersionNumbers temp = new CompareVersionNumbers();
        Assert.assertEquals(-1, temp.compareVersion("0.1", "1.1"));
    }

    @Test
    public void test4() {
        CompareVersionNumbers temp = new CompareVersionNumbers();
        Assert.assertEquals(1, temp.compareVersion("1.0.1", "1"));
    }

    @Test
    public void test5() {
        CompareVersionNumbers temp = new CompareVersionNumbers();
        Assert.assertEquals(-1, temp.compareVersion("7.5.2.4", "7.5.3"));
    }
}
