package lpf.learn.algorithms.sort.selection;

import org.junit.Assert;
import org.junit.Test;

/**
 * 选择排序测试类
 *
 * @author liupf
 * @date 2021-01-02 14:51
 */
public class SelectionSortPlayByDrawTest {

    private SelectionSortPlayByDraw selectionSort = new SelectionSortPlayByDraw();

    @Test
    public void test1() {
        Integer[] arr = new Integer[]{1,23,41,2,15,1,64,71,4,77,22};
        selectionSort.sort(arr);
        selectionSort.show(arr);
        Assert.assertTrue(selectionSort.isSorted(arr));
    }

    @Test
    public void test2() {
        Integer[] arr = new Integer[]{1,2,41,41,5,73,2,3,6,27,12,4,61,23};
        selectionSort.sort(arr);
        selectionSort.show(arr);
        Assert.assertTrue(selectionSort.isSorted(arr));
    }

}
