package lpf.learn.leetcode.learn.hash;


import org.junit.Assert;
import org.junit.Test;

public class TopKFrequentElementsTest {

    @Test
    public void test1(){
        TopKFrequentElements test = new TopKFrequentElements();
        Assert.assertArrayEquals(new int[]{1,2}, test.topKFrequent(new int[]{1,1,1,2,2,3}, 2));
    }

    @Test
    public void test2(){
        TopKFrequentElements test = new TopKFrequentElements();
        Assert.assertArrayEquals(new int[]{1, 2, 3}, test.topKFrequent(new int[]{1,1,1,2,2,3}, 3));
    }

    @Test
    public void test3(){
        TopKFrequentElements test = new TopKFrequentElements();
        Assert.assertArrayEquals(new int[]{1}, test.topKFrequent(new int[]{1}, 1));
    }

    @Test
    public void test4(){
        TopKFrequentElements test = new TopKFrequentElements();
        Assert.assertArrayEquals(new int[]{1}, test.topKFrequent(new int[]{1, 1, 1}, 1));
    }
}
