package lpf.learn.algorithms.sort.merge;

/**
 * 自底向上
 *
 * @author liupf
 * @date 2021-01-16 15:06
 */
public class Merge2 extends Merge {

    @Override
    public void sort(Comparable[] a) {
        int length = a.length;
        aux = new Comparable[length];

        for (int sz = 1; sz < length; sz += sz) {
            for (int lo = 0; lo < length - sz; lo += sz + sz) {
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, length - 1));
            }
        }
    }
}
