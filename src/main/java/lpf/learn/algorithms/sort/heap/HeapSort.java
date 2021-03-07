package lpf.learn.algorithms.sort.heap;

import lpf.learn.algorithms.sort.SortTemplate;

/**
 * @author liupf
 * @date 2021-03-06 22:20
 */
public class HeapSort extends SortTemplate {
    @Override
    public void sort(Comparable[] a) {

        int N = a.length;
        Comparable[] array = new Comparable[N + 1];
        System.arraycopy(a, 0, array, 1, N);

        for (int k = N / 2; k >= 1; k--) {
            sink(array, k, N);
        }
        while (N > 1) {
            exch(array, 1, N--);
            sink(array, 1, N);
        }
        System.arraycopy(array, 1, a, 0, a.length);
    }

    private void sink(Comparable[] a, int k, int N) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(a[j], a[j + 1])) {
                j++;
            }
            if (!less(a[k], a[j])) {
                break;
            }
            exch(a, k, j);
            k = j;
        }
    }
}
