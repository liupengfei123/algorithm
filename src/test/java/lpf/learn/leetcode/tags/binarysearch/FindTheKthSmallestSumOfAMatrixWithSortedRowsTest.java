package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class FindTheKthSmallestSumOfAMatrixWithSortedRowsTest {
    @Test
    public void test1(){
        FindTheKthSmallestSumOfAMatrixWithSortedRows test = new FindTheKthSmallestSumOfAMatrixWithSortedRows();
        Assert.assertEquals(7, test.kthSmallest(new int[][]{{1,3,11},{2,4,6}}, 5));
    }

    @Test
    public void test2(){
        FindTheKthSmallestSumOfAMatrixWithSortedRows test = new FindTheKthSmallestSumOfAMatrixWithSortedRows();
        Assert.assertEquals(17, test.kthSmallest(new int[][]{{1,3,11},{2,4,6}}, 9));
    }

    @Test
    public void test3(){
        FindTheKthSmallestSumOfAMatrixWithSortedRows test = new FindTheKthSmallestSumOfAMatrixWithSortedRows();
        Assert.assertEquals(9, test.kthSmallest(new int[][]{{1,10,10},{1,4,5},{2,3,6}}, 7));
    }

    @Test
    public void test4(){
        FindTheKthSmallestSumOfAMatrixWithSortedRows test = new FindTheKthSmallestSumOfAMatrixWithSortedRows();
        Assert.assertEquals(7, test.kthSmallest(new int[][]{{1,3,11},{2,4,6}}, 5));
    }

}
