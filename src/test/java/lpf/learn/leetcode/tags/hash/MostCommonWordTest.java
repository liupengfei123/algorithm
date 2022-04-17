package lpf.learn.leetcode.tags.hash;

import org.junit.Assert;
import org.junit.Test;

public class MostCommonWordTest {
    @Test
    public void test1(){
        MostCommonWord test = new MostCommonWord();

        Assert.assertEquals("ball", test.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
    }

    @Test
    public void test2(){
        MostCommonWord test = new MostCommonWord();

        Assert.assertEquals("hit", test.mostCommonWord("Bob hit a ball? the hit BALL! flew far after it was hit.", new String[]{"ball"}));
    }
}
