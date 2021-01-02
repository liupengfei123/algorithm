package lpf.learn.algorithms.sort.selection;

import org.junit.Assert;
import org.junit.Test;

/**
 * 选择排序测试类
 *
 * @author liupf
 * @date 2021-01-02 14:51
 */
public class SelectionSortTest {

    private SelectionSort selectionSort = new SelectionSort();

    @Test
    public void test1() {
        Integer[] arr = new Integer[]{1,234,12,41,5,1,6,714,724,713,72,436};
        selectionSort.sort(arr);
        selectionSort.show(arr);
        Assert.assertTrue(selectionSort.isSorted(arr));
    }

    @Test
    public void test2() {
        Integer[] arr = new Integer[]{9,8,7,6,5,4,3,2,1,0,-1,-2,-3,-4};
        selectionSort.sort(arr);
        selectionSort.show(arr);
        Assert.assertTrue(selectionSort.isSorted(arr));
    }

    @Test
    public void test3() {
        Integer[] arr = new Integer[]{1,2,41,41,5,73,2,3,6,27,12,4,61,23};
        selectionSort.sort(arr);
        selectionSort.show(arr);
        Assert.assertTrue(selectionSort.isSorted(arr));
    }

    @Test
    public void test4() {
        String[] arr = new String[]{"asd", "daq", "weqwe", "qwx", "qwx", "qwxca", "qwqe", "kuh", "cgadsf", "xfwe"};
        selectionSort.sort(arr);
        selectionSort.show(arr);
        Assert.assertTrue(selectionSort.isSorted(arr));
    }
}
