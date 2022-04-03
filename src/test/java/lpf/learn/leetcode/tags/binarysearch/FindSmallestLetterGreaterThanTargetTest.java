package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-05-09 18:17
 */
public class FindSmallestLetterGreaterThanTargetTest {
    @Test
    public void test1(){
        FindSmallestLetterGreaterThanTarget test = new FindSmallestLetterGreaterThanTarget();
        Assert.assertEquals('a', test.nextGreatestLetter(new char[]{'a', 'b'}, 'z'));
    }

    @Test
    public void test2(){
        FindSmallestLetterGreaterThanTarget test = new FindSmallestLetterGreaterThanTarget();
        Assert.assertEquals('b', test.nextGreatestLetter(new char[]{'a','a','a','a','a', 'b'}, 'a'));
    }

    @Test
    public void test3(){
        FindSmallestLetterGreaterThanTarget test = new FindSmallestLetterGreaterThanTarget();
        Assert.assertEquals('b', test.nextGreatestLetter(new char[]{'a','a','a','a','a', 'b', 'c'}, 'a'));
    }

    @Test
    public void test4(){
        FindSmallestLetterGreaterThanTarget test = new FindSmallestLetterGreaterThanTarget();
        Assert.assertEquals('c', test.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
    }

    @Test
    public void test5(){
        FindSmallestLetterGreaterThanTarget test = new FindSmallestLetterGreaterThanTarget();
        Assert.assertEquals('f', test.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
    }

    @Test
    public void test6(){
        FindSmallestLetterGreaterThanTarget test = new FindSmallestLetterGreaterThanTarget();
        Assert.assertEquals('f', test.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd'));
    }
}
