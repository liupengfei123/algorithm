package lpf.learn.algorithms.sort.quick;

import edu.princeton.cs.algs4.StdRandom;
import lpf.learn.algorithms.sort.SortTemplate;

/**
 * @author liupf
 * @date 2021-02-27 16:10
 */
public class Quick extends SortTemplate {

    @Override
    public void sort(Comparable[] a) {
        //没有重新打乱顺序， 当有序数组时，sort 递归是 j 逐个递增，也就是会生成 数组大小的调用栈，容易栈溢出
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    protected void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }


    protected int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;

        Comparable v = a[lo];
        while (true) {
            // 都需要前置自增增减，或者对比的索引与交换的索引不一致
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;

            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        // 当 [lo + 1, hi] 全部交换完毕之后， j 为最大的小于 v 值的索引，i 为最小的大于 v 值的索引。
        // 所以将 lo 与 j 互换位置
        exch(a, lo, j);
        return j;
    }
}
