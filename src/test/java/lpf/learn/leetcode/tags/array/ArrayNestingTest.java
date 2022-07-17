package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class ArrayNestingTest {

    @Test
    public void test1(){
        ArrayNesting test = new ArrayNesting();
        Assert.assertEquals(4, test.arrayNesting(new int[]{5,4,0,3,1,6,2}));
    }

    @Test
    public void test2(){
        ArrayNesting test = new ArrayNesting();
        Assert.assertEquals(1, test.arrayNesting(new int[]{0,1,2,3,4,5,6}));
    }
}
