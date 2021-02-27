package lpf.learn.algorithms.sort.quick;

import edu.princeton.cs.algs4.Insertion;

/**
 * @author liupf
 * @date 2021-02-27 16:10
 */
public class QuickInsertion extends Quick {

    private final static int M = 5;

    protected void sort(Comparable[] a, int lo, int hi) {
        if (lo + M >= hi) {
            Insertion.sort(a, lo, hi + 1);
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }
}
