package lpf.learn.leetcode.tags.twopoint;


import org.junit.Assert;
import org.junit.Test;

public class SubsequenceWithTheMinimumScoreTest {

    @Test
    public void test1(){
        SubsequenceWithTheMinimumScore test = new SubsequenceWithTheMinimumScore();
        Assert.assertEquals(1, test.minimumScore("abacaba", "bzaa"));
    }

    @Test
    public void test2(){
        SubsequenceWithTheMinimumScore test = new SubsequenceWithTheMinimumScore();
        Assert.assertEquals(3, test.minimumScore("cde", "xyz"));
    }


    @Test
    public void test3(){
        SubsequenceWithTheMinimumScore test = new SubsequenceWithTheMinimumScore();
        Assert.assertEquals(4, test.minimumScore("abaaace", "abceabce"));
    }

    @Test
    public void test4(){
        SubsequenceWithTheMinimumScore test = new SubsequenceWithTheMinimumScore();
        Assert.assertEquals(2, test.minimumScore("eeecaeecdeeadcdbcaa", "edecabe"));
    }

    @Test
    public void test5(){
        SubsequenceWithTheMinimumScore test = new SubsequenceWithTheMinimumScore();
        Assert.assertEquals(3, test.minimumScore("cde", "xyz"));
    }
}
