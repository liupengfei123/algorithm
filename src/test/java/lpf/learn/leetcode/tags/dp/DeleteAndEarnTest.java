package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class DeleteAndEarnTest {
    @Test
    public void test1(){
        DeleteAndEarn test = new DeleteAndEarn();
        Assert.assertEquals(6, test.deleteAndEarn(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test2(){
        DeleteAndEarn test = new DeleteAndEarn();
        Assert.assertEquals(6, test.deleteAndEarn(new int[]{3, 4, 2}));
    }

    @Test
    public void test3(){
        DeleteAndEarn test = new DeleteAndEarn();
        Assert.assertEquals(9, test.deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
    }

    @Test
    public void test4(){
        DeleteAndEarn test = new DeleteAndEarn();
        Assert.assertEquals(9, test.deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4, 7}));
    }
}
