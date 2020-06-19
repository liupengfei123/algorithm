package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void reverseStringTest(){
        ReverseString reverseString = new ReverseString();

        Assert.assertArrayEquals("olleh".toCharArray(), reverseString.reverseString("hello".toCharArray()));

        Assert.assertArrayEquals("hannaH".toCharArray(), reverseString.reverseString("Hannah".toCharArray()));

        Assert.assertArrayEquals("".toCharArray(), reverseString.reverseString("".toCharArray()));

        Assert.assertArrayEquals("a".toCharArray(), reverseString.reverseString("a".toCharArray()));
    }
}
