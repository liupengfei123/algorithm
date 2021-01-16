package lpf.learn.algorithms.sort.merge;

/**
 * 作业 2.2.10 快速归并，减少对比时间
 *
 * @author liupf
 * @date 2021-01-16 15:06
 */
public class Merge2_2_10 extends Merge {

    /**
     *  将前部分 [lo, mid] 和 后部分 [mid + 1, hi] 分别有效的小数组，进行合并
     */
    protected void merge(Comparable[] a, int lo, int mid, int hi) {
        System.arraycopy(a, lo, aux, lo, mid - lo + 1);
        // 不管哪半边用尽了，越界之后的下一个就是两边的最大值，就不需要再用代码判断是否用尽了
        for (int i = hi, j = mid + 1; i > mid; i--, j++) {
            aux[j] = a[i];
        }

        int i = lo, j = hi;
        for (int k = lo; k <= hi; k++) {
            if (less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j--];
            }
        }
    }

}
