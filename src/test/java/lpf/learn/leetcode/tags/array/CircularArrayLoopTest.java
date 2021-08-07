package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class CircularArrayLoopTest {

    @Test
    public void test1(){
        CircularArrayLoop test = new CircularArrayLoop();
        Assert.assertTrue(test.circularArrayLoop(new int[]{2, -1, 1, 2, 2}));
    }

    @Test
    public void test2(){
        CircularArrayLoop test = new CircularArrayLoop();
        Assert.assertFalse(test.circularArrayLoop(new int[]{-1, 2}));
    }

    @Test
    public void test3(){
        CircularArrayLoop test = new CircularArrayLoop();
        Assert.assertTrue(test.circularArrayLoop(new int[]{-1, 1, 2}));
    }

    @Test
    public void test4(){
        CircularArrayLoop test = new CircularArrayLoop();
        Assert.assertFalse(test.circularArrayLoop(new int[]{-2, 1, -1, -2, -2}));
    }

    @Test
    public void test5(){
        CircularArrayLoop test = new CircularArrayLoop();
        Assert.assertTrue(test.circularArrayLoop(new int[]{-3, 2, -3, 2}));
    }

    @Test
    public void test6(){
        CircularArrayLoop test = new CircularArrayLoop();
        Assert.assertFalse(test.circularArrayLoop(new int[]{-1, -2, -3, -4, -5}));
    }
}
