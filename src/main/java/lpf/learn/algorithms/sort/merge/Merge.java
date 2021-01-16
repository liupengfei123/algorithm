package lpf.learn.algorithms.sort.merge;

import lpf.learn.algorithms.sort.SortTemplate;

/**
 * 自顶向下
 *
 * @author liupf
 * @date 2021-01-16 15:06
 */
public class Merge extends SortTemplate {

    Comparable[] aux;

    @Override
    public void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    public void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    /**
     *  将前部分 [lo, mid] 和 后部分 [mid + 1, hi] 分别有效的小数组，进行合并
     */
    protected void merge(Comparable[] a, int lo, int mid, int hi) {
        System.arraycopy(a, lo, aux, lo, hi - lo + 1);

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }
}
