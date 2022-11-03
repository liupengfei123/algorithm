package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class MaximumRepeatingSubstringTest {

    @Test
    public void test1() {
        MaximumRepeatingSubstring temp = new MaximumRepeatingSubstring();
        Assert.assertEquals(2, temp.maxRepeating("ababc", "ab"));
    }

    @Test
    public void test2() {
        MaximumRepeatingSubstring temp = new MaximumRepeatingSubstring();
        Assert.assertEquals(1, temp.maxRepeating("ababc", "ba"));
    }

    @Test
    public void test3() {
        MaximumRepeatingSubstring temp = new MaximumRepeatingSubstring();
        Assert.assertEquals(0, temp.maxRepeating("ababc", "ac"));
    }

    @Test
    public void test4() {
        MaximumRepeatingSubstring temp = new MaximumRepeatingSubstring();
        Assert.assertEquals(1, temp.maxRepeating("a", "a"));
    }

    @Test
    public void test5() {
        MaximumRepeatingSubstring temp = new MaximumRepeatingSubstring();
        Assert.assertEquals(4, temp.maxRepeating("abababab", "ab"));
    }

    @Test
    public void test6() {
        MaximumRepeatingSubstring temp = new MaximumRepeatingSubstring();
        Assert.assertEquals(5, temp.maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));
    }
}
