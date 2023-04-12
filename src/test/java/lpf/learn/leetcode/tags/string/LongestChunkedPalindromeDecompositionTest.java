package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class LongestChunkedPalindromeDecompositionTest {

    @Test
    public void test1() {
        LongestChunkedPalindromeDecomposition temp = new LongestChunkedPalindromeDecomposition();
        Assert.assertEquals(7, temp.longestDecomposition("ghiabcdefhelloadamhelloabcdefghi"));
    }

    @Test
    public void test2() {
        LongestChunkedPalindromeDecomposition temp = new LongestChunkedPalindromeDecomposition();
        Assert.assertEquals(1, temp.longestDecomposition("merchant"));
    }

    @Test
    public void test3() {
        LongestChunkedPalindromeDecomposition temp = new LongestChunkedPalindromeDecomposition();
        Assert.assertEquals(11, temp.longestDecomposition("antaprezatepzapreanta"));
    }

    @Test
    public void test4() {
        LongestChunkedPalindromeDecomposition temp = new LongestChunkedPalindromeDecomposition();
        Assert.assertEquals(38, temp.longestDecomposition("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq"));
    }

    @Test
    public void test5() {
        LongestChunkedPalindromeDecomposition temp = new LongestChunkedPalindromeDecomposition();
        Assert.assertEquals(39, temp.longestDecomposition("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq"));
    }
}
