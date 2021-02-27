package lpf.learn.algorithms.sort.quick;

/**
 * @author liupf
 * @date 2021-02-27 16:10
 */
public class Quick2 extends Quick {

    protected int partition(Comparable[] a, int lo, int hi) {
        Comparable v = a[lo];
        int j = lo;

        for (int i = lo + 1; i <= hi; i++) {
            if (less(a[i], v)) {
                // 将 小于 v 值的索引，与 j 下一个互换
                exch(a, i, j + 1);
                exch(a, j, j + 1);
                j++;
            }
        }
        return j;
    }
}
