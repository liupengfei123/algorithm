package lpf.learn.algorithms.sort.insertion;

import lpf.learn.algorithms.sort.SortTemplate;

/**
 * 插入排序
 *
 * @author liupf
 * @date 2021-01-02 15:56
 */
public class InsertionSort extends SortTemplate {
    @Override
    public void sort(Comparable[] a) {
        int length = a.length;

        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
}
