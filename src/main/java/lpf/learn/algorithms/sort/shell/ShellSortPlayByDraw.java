package lpf.learn.algorithms.sort.shell;

import lpf.learn.algorithms.sort.SortDrawTemplate;

/**
 * 希尔排序
 * 希尔排序是插入排序中的一种，其思想是将数组中每间隔 **h** 的元素作为子序列，然后使用插入排序将该子序列进行排序。之后再按照 **h - 1** 的间隔再来一次，最后直到间隔为 **1** 时，该数组全部排序完毕。
 * @author liupf
 * @date 2021-01-03 20:19
 */
public class ShellSortPlayByDraw extends SortDrawTemplate {
    @Override
    public void doSort(Integer[] a) {
        int length = a.length;
        int h = 1;
        while (h < length / 3) {
            h = h * 3 + 1;
        }

        while (h >= 1) {
            for (int i = h; i < length; i++) {
                // 该位置是 每隔 h 间隔的数组子序列的插入排序
                for (int j = i; j >= h && less(a, j, j - h); j -= h) {
                    exch(a, j, j - h);
                    playDraw(a);
                }
            }
            h /= 3;
        }
    }
}
