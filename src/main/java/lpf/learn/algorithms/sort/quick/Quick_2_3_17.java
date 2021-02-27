package lpf.learn.algorithms.sort.quick;

import edu.princeton.cs.algs4.StdRandom;

/**
 * @author liupf
 * @date 2021-02-27 16:10
 */
public class Quick_2_3_17 extends Quick {

    @Override
    public void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        setMaxInEnd(a);
        sort(a, 0, a.length - 1);
    }

    protected int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;

        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v));
            while (less(v, a[--j]));
            if (i >= j)
                break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }


    private void setMaxInEnd(Comparable[] a) {
        int maxIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (less(a[maxIndex], a[i])) {
                maxIndex = i;
            }
        }
        exch(a, maxIndex, a.length - 1);
    }
}
