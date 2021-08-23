package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class GetMaximumInGeneratedArrayTest {

    @Test
    public void test1(){
        GetMaximumInGeneratedArray test = new GetMaximumInGeneratedArray();
        Assert.assertEquals(1, test.getMaximumGenerated(1));
    }

    @Test
    public void test2(){
        GetMaximumInGeneratedArray test = new GetMaximumInGeneratedArray();
        Assert.assertEquals(1, test.getMaximumGenerated(2));
    }

    @Test
    public void test3(){
        GetMaximumInGeneratedArray test = new GetMaximumInGeneratedArray();
        Assert.assertEquals(2, test.getMaximumGenerated(3));
    }

    @Test
    public void test4(){
        GetMaximumInGeneratedArray test = new GetMaximumInGeneratedArray();
        Assert.assertEquals(3, test.getMaximumGenerated(7));
    }

    @Test
    public void test5(){
        GetMaximumInGeneratedArray test = new GetMaximumInGeneratedArray();
        Assert.assertEquals(21, test.getMaximumGenerated(100));
    }
}
