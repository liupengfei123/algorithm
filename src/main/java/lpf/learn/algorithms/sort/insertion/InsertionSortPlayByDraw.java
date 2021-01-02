package lpf.learn.algorithms.sort.insertion;

import lpf.learn.algorithms.sort.SortDrawTemplate;

/**
 * 选择排序
 *
 * @author liupf
 * @date 2021-01-02 14:46
 */
public class InsertionSortPlayByDraw extends SortDrawTemplate {


    @Override
    public void doSort(Integer[] a) {
        int length = a.length;

        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && less(a, j, j - 1); j--) {
                exch(a, j, j - 1);
            }
            playDraw(a);
        }
    }
}
