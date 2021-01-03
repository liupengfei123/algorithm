package lpf.learn.algorithms.sort.shell;

import lpf.learn.algorithms.sort.SortTemplate;

/**
 * 希尔排序
 *
 * @author liupf
 * @date 2021-01-03 20:19
 */
public class ShellSort extends SortTemplate {
    @Override
    public void sort(Comparable[] a) {
        int length = a.length;
        int h = 1;
        while (h < length / 3) {
            h = h * 3 + 1;
        }

        while (h >= 1) {
            for (int i = h; i < length; i++) {
                // 该位置是 每隔 h 间隔的数组子序列的插入排序
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h /= 3;
        }
    }
}
