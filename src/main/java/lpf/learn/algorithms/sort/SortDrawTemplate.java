package lpf.learn.algorithms.sort;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.util.HashSet;
import java.util.Set;

/**
 * 排序算法模板
 *
 * @author liupf
 * @date 2021-01-02 14:04
 */
public abstract class SortDrawTemplate {

    private Integer max;
    private Set<Integer> compareIndexSet;
    private Set<Integer> exchIndexSet;

    public final void sort(Integer[] a) {
        this.max = getMaxValue(a);
        this.compareIndexSet = new HashSet<>();
        this.exchIndexSet = new HashSet<>();
        doSort(a);
    }

    protected abstract void doSort(Integer[] a);


    protected boolean less(Integer[] a, int i, int j) {
        compareIndexSet.add(i);
        compareIndexSet.add(j);

        return a[i] < a[j];
    }

    protected void exch(Integer[] a, int i, int j) {
        Integer temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        exchIndexSet.add(i);
        exchIndexSet.add(j);
    }

    protected void playDraw(Integer[] a) {
        drawSort(a);
        StdDraw.pause(500);
        StdDraw.clear();
        compareIndexSet.clear();
        exchIndexSet.clear();
    }

    public void show(Integer[] a) {
        for (Integer anA : a) {
            StdOut.print(anA + "   ");
        }
        StdOut.println();
    }

    public boolean isSorted(Integer[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a, i, i - 1)) {
                return false;
            }
        }
        return true;
    }

    private void drawSort(Integer[] a) {
        StdDraw.setXscale(-1, a.length + 1);
        StdDraw.setYscale(-2, this.max + 1);

        for (int i = 0; i < a.length; i++) {
            double y =  a[i];
            if (exchIndexSet.contains(i)) {
                StdDraw.setPenColor(StdDraw.RED);
            } else if (compareIndexSet.contains(i)) {
                StdDraw.setPenColor(StdDraw.BLACK);
            } else {
                StdDraw.setPenColor(StdDraw.GRAY);
            }
            StdDraw.filledRectangle(i + 0.5, y / 2.0, 0.3, y / 2.0);
        }
    }

    private Integer getMaxValue(Integer[] a) {
        Integer max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) max = a[i];
        }
        return max;
    }
}
