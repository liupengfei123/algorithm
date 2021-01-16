package lpf.learn.algorithms.sort;

import edu.princeton.cs.algs4.StdOut;

/**
 * 排序算法模板
 *
 * @author liupf
 * @date 2021-01-02 14:04
 */
public abstract class SortTemplate {
    public abstract void sort(Comparable[] a);

    /**
     *  比较两个数大小
     * @return true : v 比 w 小， false反之
     */
    protected boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void show(Comparable[] a) {
        for (Comparable anA : a) {
            StdOut.print(anA + "   ");
        }
        StdOut.println();
    }

    public boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
}
