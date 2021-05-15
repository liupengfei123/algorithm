package lpf.learn.leetcode.game;

import org.junit.Assert;
import org.junit.Test;

public class SortingTheSentenceTest {
    @Test
    public void test1(){
        SortingTheSentence test = new SortingTheSentence();
        Assert.assertEquals("This is a sentence", test.sortSentence("is2 sentence4 This1 a3"));
    }

    @Test
    public void test2(){
        SortingTheSentence test = new SortingTheSentence();
        Assert.assertEquals("Me Myself and I", test.sortSentence("Myself2 Me1 I4 and3"));
    }

    @Test
    public void test3(){
        FrequencyoftheMostFrequentElement test = new FrequencyoftheMostFrequentElement();
        Assert.assertEquals(1, test.maxFrequency(new int[]{3,9,6}, 2));
    }
}
