package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class NextGreaterElementIITest {

    @Test
    public void test(){
        NextGreaterElementII test = new NextGreaterElementII();

        Assert.assertArrayEquals(new int[]{2,-1,2}, test.nextGreaterElements(new int[]{1,2,1}));

        Assert.assertArrayEquals(new int[]{2,3,3,-1}, test.nextGreaterElements(new int[]{1,2,1,3}));

        Assert.assertArrayEquals(new int[]{-1,3,3,9}, test.nextGreaterElements(new int[]{9,2,1,3}));

        Assert.assertArrayEquals(new int[]{-1}, test.nextGreaterElements(new int[]{9}));

        Assert.assertArrayEquals(new int[]{}, test.nextGreaterElements(new int[]{}));



    }
}
