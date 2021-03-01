package lpf.learn.algorithms.sort.quick;

/**
 * @author liupf
 * @date 2021-02-27 16:10
 */
public class Quick_2_3_18 extends Quick {

    protected int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;

        exch(a, getMidValue(a, lo, hi), lo);
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j]));
            if (i >= j)
                break;

            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private int getMidValue(Comparable[] a, int lo, int hi) {
        //子数组少于3个元素时，第一个元素作为切分元素
        if ((hi - lo + 1) < 3)
            return lo;

        int v1 = lo;
        int v2 = (hi - lo) / 2 + lo;
        int v3 = hi;

        if (less(a[v2], a[v1])) {
            v1 = v1 ^ v2;
            v2 = v1 ^ v2;
            v1 = v1 ^ v2;
        }
        if (less(a[v3], a[v2])) {
            v3 = v3 ^ v2;
            v2 = v3 ^ v2;
            v3 = v3 ^ v2;
        }
        if (less(a[v2], a[v1])) {
            v1 = v1 ^ v2;
            v2 = v1 ^ v2;
            v1 = v1 ^ v2;
        }
        return v2;
    }

}
