package lpf.learn.algorithms.sort.merge;

/**
 * 自顶向下 优化 当小数组大小只有10个时 采用插入排序
 *
 * @author liupf
 * @date 2021-01-16 15:06
 */
public class MergeInsertion extends Merge {

    public void sort(Comparable[] a, int lo, int hi) {
        if (hi - lo < 10) {
            insertionSort(a, lo, hi);
            return;
        }
        super.sort(a, lo, hi);
    }

    private void insertionSort(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
}
