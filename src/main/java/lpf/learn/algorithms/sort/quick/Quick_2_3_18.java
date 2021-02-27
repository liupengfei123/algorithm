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

        Integer[] b={lo,lo+1,lo+2};
        ////使用插入排序法排序新数组b,按原数组的值进行排序。排序后的结果是原数组中小中大值对应的索引
        for(int i=0;i<2;i++)
            for(int j=i+1;j>0;j--)
                if (less(a[b[j]],a[b[j-1]])) exch(b,j,j-1);
        return b[1];
    }

}
