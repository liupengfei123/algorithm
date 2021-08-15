package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class NextPermutationTest {
    @Test
    public void test1(){
        NextPermutation test = new NextPermutation();
        int[] ints = {1,2,3};
        test.nextPermutation(ints);
        Assert.assertArrayEquals(new int[]{1,3,2}, ints);
    }

    @Test
    public void test2(){
        NextPermutation test = new NextPermutation();
        int[] ints = {1,2,3,4,5};
        test.nextPermutation(ints);
        Assert.assertArrayEquals(new int[]{1,2,3,5,4}, ints);
    }

    @Test
    public void test3(){
        NextPermutation test = new NextPermutation();
        int[] ints = {3,2,1};
        test.nextPermutation(ints);
        Assert.assertArrayEquals(new int[]{1,2,3}, ints);
    }

    @Test
    public void test4(){
        NextPermutation test = new NextPermutation();
        int[] ints = {1,1,5};
        test.nextPermutation(ints);
        Assert.assertArrayEquals(new int[]{1,5,1}, ints);
    }

    @Test
    public void test5(){
        NextPermutation test = new NextPermutation();
        int[] ints = {1};
        test.nextPermutation(ints);
        Assert.assertArrayEquals(new int[]{1}, ints);
    }

    @Test
    public void test6(){
        NextPermutation test = new NextPermutation();
        int[] ints = {1,7,2,3,6,5,4};
        test.nextPermutation(ints);
        Assert.assertArrayEquals(new int[]{1,7,2,4,3,5,6}, ints);
    }

    @Test
    public void test7(){
        NextPermutation test = new NextPermutation();
        int[] ints = {4,2,0,2,3,2,0};
        test.nextPermutation(ints);
        Assert.assertArrayEquals(new int[]{4,2,0,3,0,2,2}, ints);
    }


    @Test
    public void test8(){
        NextPermutation test = new NextPermutation();
        int[] ints = {2,3,1};
        test.nextPermutation(ints);
        Assert.assertArrayEquals(new int[]{3,1,2}, ints);
    }
}
