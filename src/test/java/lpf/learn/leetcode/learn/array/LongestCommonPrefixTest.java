package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefixTest(){
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        Assert.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));

        Assert.assertEquals("f", longestCommonPrefix.longestCommonPrefix(new String[]{"fower","flow","flight"}));

        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));

        Assert.assertEquals("a", longestCommonPrefix.longestCommonPrefix(new String[]{"a"}));
    }
}
