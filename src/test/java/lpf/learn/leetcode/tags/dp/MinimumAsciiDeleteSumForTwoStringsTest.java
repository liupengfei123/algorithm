package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MinimumAsciiDeleteSumForTwoStringsTest {
    @Test
    public void test1(){
        MinimumAsciiDeleteSumForTwoStrings test = new MinimumAsciiDeleteSumForTwoStrings();
        Assert.assertEquals(231, test.minimumDeleteSum("sea", "eat"));
    }

    @Test
    public void test2(){
        MinimumAsciiDeleteSumForTwoStrings test = new MinimumAsciiDeleteSumForTwoStrings();
        Assert.assertEquals(0, test.minimumDeleteSum("seat", "seat"));
    }

    @Test
    public void test3(){
        MinimumAsciiDeleteSumForTwoStrings test = new MinimumAsciiDeleteSumForTwoStrings();
        Assert.assertEquals(403, test.minimumDeleteSum("delete", "leet"));
    }

    @Test
    public void test4(){
        MinimumAsciiDeleteSumForTwoStrings test = new MinimumAsciiDeleteSumForTwoStrings();
        Assert.assertEquals(1178, test.minimumDeleteSum("caabcccaccccca", "cacbaaac"));
    }
}
