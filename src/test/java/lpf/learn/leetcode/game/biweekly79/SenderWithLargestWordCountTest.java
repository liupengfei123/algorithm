package lpf.learn.leetcode.game.biweekly79;

import org.junit.Assert;
import org.junit.Test;

public class SenderWithLargestWordCountTest {
    @Test
    public void test1(){
        SenderWithLargestWordCount test = new SenderWithLargestWordCount();
        Assert.assertEquals("Alice", test.largestWordCount(
                new String[]{"Hello userTwooo","Hi userThree","Wonderful day Alice","Nice day userThree"},
                new String[]{"Alice","userTwo","userThree","Alice"}));
    }

    @Test
    public void test2(){
        SenderWithLargestWordCount test = new SenderWithLargestWordCount();
        Assert.assertEquals("Charlie", test.largestWordCount(
                new String[]{"How is leetcode for everyone","Leetcode is useful for practice"},
                new String[]{"Bob","Charlie"}));
    }

}
