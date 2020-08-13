package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class ReverseWords3Test {

    @Test
    public void reverseWords3Test(){
        ReverseWordsInAStringIii reverseWords3 = new ReverseWordsInAStringIii();

        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWords3.reverseWords("Let's take LeetCode contest"));
        Assert.assertEquals("s'teL ekat   edoCteeL tsetnoc", reverseWords3.reverseWords("Let's take   LeetCode contest"));

        Assert.assertEquals("a", reverseWords3.reverseWords("    a   "));
        Assert.assertEquals("", reverseWords3.reverseWords(""));


    }
}
