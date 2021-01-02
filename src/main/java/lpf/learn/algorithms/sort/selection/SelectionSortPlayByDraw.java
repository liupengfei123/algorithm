package lpf.learn.algorithms.sort.selection;

import lpf.learn.algorithms.sort.SortDrawTemplate;

/**
 * 选择排序
 *
 * @author liupf
 * @date 2021-01-02 14:46
 */
public class SelectionSortPlayByDraw extends SortDrawTemplate {


    @Override
    public void doSort(Integer[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (less(a, j, minIndex)) {
                    minIndex = j;
                }
            }
            exch(a, i, minIndex);
            playDraw(a);
        }
    }
}
