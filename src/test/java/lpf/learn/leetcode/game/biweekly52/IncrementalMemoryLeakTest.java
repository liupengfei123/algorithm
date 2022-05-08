package lpf.learn.leetcode.game.biweekly52;

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
}
