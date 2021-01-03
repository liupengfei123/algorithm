package lpf.learn.algorithms.sort.shell;

import org.junit.Assert;
import org.junit.Test;

/**
 * 希尔排序测试类
 *
 * @author liupf
 * @date 2021-01-02 14:51
 */
public class ShellSortPlayByDrawTest {

    private ShellSortPlayByDraw shellSortPlayByDraw = new ShellSortPlayByDraw();

    @Test
    public void test1() {
        Integer[] arr = new Integer[]{1,23,41,2,15,1,64,71,4,77,22};
        shellSortPlayByDraw.sort(arr);
        shellSortPlayByDraw.show(arr);
        Assert.assertTrue(shellSortPlayByDraw.isSorted(arr));
    }

    @Test
    public void test2() {
        Integer[] arr = new Integer[]{1,2,41,41,5,73,2,3,6,27,12,4,61,23};
        shellSortPlayByDraw.sort(arr);
        shellSortPlayByDraw.show(arr);
        Assert.assertTrue(shellSortPlayByDraw.isSorted(arr));
    }

}
