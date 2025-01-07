package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class NextGreaterElementIITest {

    @Test
    public void test1(){
        NextGreaterElementII test = new NextGreaterElementII();
        Assert.assertArrayEquals(new int[]{2,-1,2}, test.nextGreaterElements(new int[]{1,2,1}));
    }

    @Test
    public void test2(){
        NextGreaterElementII test = new NextGreaterElementII();
        Assert.assertArrayEquals(new int[]{2,3,3,-1}, test.nextGreaterElements(new int[]{1,2,1,3}));
    }

    @Test
    public void test3(){
        NextGreaterElementII test = new NextGreaterElementII();
        Assert.assertArrayEquals(new int[]{-1,3,3,9}, test.nextGreaterElements(new int[]{9,2,1,3}));
    }

    @Test
    public void test4(){
        NextGreaterElementII test = new NextGreaterElementII();
        Assert.assertArrayEquals(new int[]{-1}, test.nextGreaterElements(new int[]{9}));
    }

    @Test
    public void test5(){
        NextGreaterElementII test = new NextGreaterElementII();
        Assert.assertArrayEquals(new int[]{}, test.nextGreaterElements(new int[]{}));
    }

}
