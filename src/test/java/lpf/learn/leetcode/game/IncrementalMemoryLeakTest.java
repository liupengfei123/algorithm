package lpf.learn.leetcode.game;

import org.junit.Assert;
import org.junit.Test;

public class IncrementalMemoryLeakTest {
    @Test
    public void test1(){
        IncrementalMemoryLeak test = new IncrementalMemoryLeak();
        Assert.assertArrayEquals(new int[]{3,1,0}, test.memLeak(2, 2));
    }

    @Test
    public void test2(){
        IncrementalMemoryLeak test = new IncrementalMemoryLeak();
        Assert.assertArrayEquals(new int[]{6,0,4}, test.memLeak(8, 11));
    }

    @Test
    public void test3(){
        FrequencyoftheMostFrequentElement test = new FrequencyoftheMostFrequentElement();
        Assert.assertEquals(1, test.maxFrequency(new int[]{3,9,6}, 2));
    }
}
