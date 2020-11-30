package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class SortColorsTest {

    @Test
    public void test1() {
        SortColors test = new SortColors();
        int[] array = new int[]{2, 0, 2, 1, 1, 0};
        test.sortColors(array);
        Assert.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, array);
    }

    @Test
    public void test2() {
        SortColors test = new SortColors();
        int[] array = new int[]{2,0,1};
        test.sortColors(array);
        Assert.assertArrayEquals(new int[]{0, 1, 2}, array);
    }

    @Test
    public void test3() {
        SortColors test = new SortColors();
        int[] array = new int[]{1, 2, 0};
        test.sortColors(array);
        Assert.assertArrayEquals(new int[]{0, 1, 2}, array);
    }

    @Test
    public void test4() {
        SortColors test = new SortColors();
        int[] array = new int[]{1};
        test.sortColors(array);
        Assert.assertArrayEquals(new int[]{1}, array);
    }


    @Test
    public void test5() {
        SortColors test = new SortColors();
        int[] array = new int[]{2};
        test.sortColors(array);
        Assert.assertArrayEquals(new int[]{2}, array);
    }

    @Test
    public void test6() {
        SortColors test = new SortColors();
        int[] array = new int[]{1, 0, 0};
        test.sortColors(array);
        Assert.assertArrayEquals(new int[]{0, 0, 1}, array);
    }

    @Test
    public void test7() {
        SortColors test = new SortColors();
        int[] array = new int[]{0, 2, 0, 2, 1, 1, 0};
        test.sortColors(array);
        Assert.assertArrayEquals(new int[]{0, 0, 0, 1, 1, 2, 2}, array);
    }

}
