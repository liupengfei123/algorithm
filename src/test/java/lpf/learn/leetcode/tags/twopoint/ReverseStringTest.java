package lpf.learn.leetcode.tags.twopoint;


import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void test1(){
        ReverseString reverseString = new ReverseString();
        char[] source = "hello".toCharArray();
        reverseString.reverseString(source);
        Assert.assertArrayEquals("olleh".toCharArray(), source);
    }

    @Test
    public void test2(){
        ReverseString reverseString = new ReverseString();
        char[] source = "Hannah".toCharArray();
        reverseString.reverseString(source);
        Assert.assertArrayEquals("hannaH".toCharArray(), source);
    }


    @Test
    public void test3(){
        ReverseString reverseString = new ReverseString();
        char[] source = "".toCharArray();
        reverseString.reverseString(source);
        Assert.assertArrayEquals("".toCharArray(), source);
    }

    @Test
    public void test4(){
        ReverseString reverseString = new ReverseString();
        char[] source = "a".toCharArray();
        reverseString.reverseString(source);
        Assert.assertArrayEquals("a".toCharArray(), source);
    }
}
