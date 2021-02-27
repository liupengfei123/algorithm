package lpf.learn.algorithms.sort.quick;

import edu.princeton.cs.algs4.StdRandom;
import lpf.learn.algorithms.sort.SortTemplate;

/**
 * @author liupf
 * @date 2021-02-27 16:10
 */
public class Quick3way extends SortTemplate {

    @Override
    public void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    protected void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v = a[lo];

        while (i <= gt) {
            int cmp = a[i].compareTo(v);

            if (cmp < 0) {
                exch(a, lt++, i++);
            } else if (cmp > 0) {
                exch(a, gt--, i);
            } else {
                i++;
            }
        }
        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
    }

}
