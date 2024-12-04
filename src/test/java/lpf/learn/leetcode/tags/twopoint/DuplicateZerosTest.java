package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class DuplicateZerosTest {

    @Test
    public void test1(){
        DuplicateZeros test = new DuplicateZeros();
        int[] array =  new int[]{1,2,2,3,3,0,4,5,0,0};
        test.duplicateZeros(array);
        Assert.assertArrayEquals(new int[]{1,2,2,3,3,0,0,4,5,0}, array);
    }

    @Test
    public void test2(){
        DuplicateZeros test = new DuplicateZeros();
        int[] array =  new int[]{1,2,3};
        test.duplicateZeros(array);
        Assert.assertArrayEquals(new int[]{1,2,3}, array);
    }

    @Test
    public void test3(){
        DuplicateZeros test = new DuplicateZeros();
        int[] array =  new int[]{1,0,2,3,0,4,5,0};
        test.duplicateZeros(array);
        Assert.assertArrayEquals(new int[]{1,0,0,2,3,0,0,4}, array);
    }

    @Test
    public void test4(){
        DuplicateZeros test = new DuplicateZeros();
        int[] array =  new int[]{1,2,3,4,5,0,0,0};
        test.duplicateZeros(array);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,0,0,0}, array);
    }

    @Test
    public void test5(){
        DuplicateZeros test = new DuplicateZeros();
        int[] array =  new int[]{0,0,0,0,0,0,0};
        test.duplicateZeros(array);
        Assert.assertArrayEquals(new int[]{0,0,0,0,0,0,0}, array);
    }

    @Test
    public void test6(){
        DuplicateZeros test = new DuplicateZeros();
        int[] array =  new int[]{0,0,0,0,0,0,0,1,2};
        test.duplicateZeros(array);
        Assert.assertArrayEquals(new int[]{0,0,0,0,0,0,0,0,0}, array);
    }

    @Test
    public void test7(){
        DuplicateZeros test = new DuplicateZeros();
        int[] array =  new int[]{0,1,7,6,0,2,0,7};
        test.duplicateZeros(array);
        Assert.assertArrayEquals(new int[]{0,0,1,7,6,0,0,2}, array);
    }
}
