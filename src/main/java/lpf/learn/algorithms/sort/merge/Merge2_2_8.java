package lpf.learn.algorithms.sort.merge;

/**
 * 作业 2.2.10  检查数组是否已经有序
 *
 * @author liupf
 * @date 2021-01-16 15:06
 */
public class Merge2_2_8 extends Merge {

    public void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);

        if (less(a[mid], a[mid + 1])) {
            return;
        }
        merge(a, lo, mid, hi);
    }

}
