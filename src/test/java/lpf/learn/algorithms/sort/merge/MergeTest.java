package lpf.learn.algorithms.sort.merge;

import lpf.learn.algorithms.sort.SortTemplate;
import lpf.learn.algorithms.sort.TestDataUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-01-16 15:19
 */
public class MergeTest {



    @Test
    public void merge1Test() {
        Merge sortTest = new Merge();
        testAll(sortTest);
    }

    @Test
    public void merge2Test() {
        Merge2 sortTest = new Merge2();
        testAll(sortTest);
    }

    @Test
    public void mergeInsertionTest() {
        MergeInsertion sortTest = new MergeInsertion();
        testAll(sortTest);
    }

    @Test
    public void merge2_2_8Test() {
        Merge2_2_8 sortTest = new Merge2_2_8();
        testAll(sortTest);
    }

    @Test
    public void merge2_2_10Test() {
        Merge2_2_10 sortTest = new Merge2_2_10();
        testAll(sortTest);
    }


    private void testAll(SortTemplate sortTest) {
        this.test1(sortTest);
        this.test2(sortTest);
        this.test3(sortTest);
        this.test4(sortTest);
        this.test5(sortTest);
        this.test6(sortTest);
        this.test7(sortTest);
        this.test8(sortTest);
        this.test9(sortTest);
    }

    private void test1(SortTemplate sortTest) {
        Integer[] arr = new Integer[]{1,234,12,41,5,1,6,714,724,713,72,436};
        sortTest.sort(arr);
        sortTest.show(arr);
        Assert.assertTrue(sortTest.isSorted(arr));
    }

    private void test2(SortTemplate sortTest) {
        Integer[] arr = new Integer[]{9,8,7,6,5,4,3,2,1,0,-1,-2,-3,-4};
        sortTest.sort(arr);
        sortTest.show(arr);
        Assert.assertTrue(sortTest.isSorted(arr));
    }

    private void test3(SortTemplate sortTest) {
        Integer[] arr = new Integer[]{1,2,41,41,5,73,2,3,6,27,12,4,61,23};
        sortTest.sort(arr);
        sortTest.show(arr);
        Assert.assertTrue(sortTest.isSorted(arr));
    }

    private void test4(SortTemplate sortTest) {
        String[] arr = new String[]{"asd", "daq", "weqwe", "qwx", "qwx", "qwxca", "qwqe", "kuh", "cgadsf", "xfwe"};
        sortTest.sort(arr);
        sortTest.show(arr);
        Assert.assertTrue(sortTest.isSorted(arr));
    }

    private void test5(SortTemplate sortTest) {
        Integer[] arr = TestDataUtils.createRandomIntArray(100, 80);
        sortTest.sort(arr);
        sortTest.show(arr);
        Assert.assertTrue(sortTest.isSorted(arr));
    }

    private void test6(SortTemplate sortTest) {
        Integer[] arr = TestDataUtils.createRandomIntArray(1000, 20000);
        sortTest.sort(arr);
        sortTest.show(arr);
        Assert.assertTrue(sortTest.isSorted(arr));
    }

    private void test7(SortTemplate sortTest) {
        Integer[] arr = TestDataUtils.createRandomIntArray(20000, 20000);
        sortTest.sort(arr);
        sortTest.show(arr);
        Assert.assertTrue(sortTest.isSorted(arr));
    }

    private void test8(SortTemplate sortTest) {
        Integer[] arr = TestDataUtils.createOrderlyIntArray(20000);
        sortTest.sort(arr);
//        sortTest.show(arr);
        Assert.assertTrue(sortTest.isSorted(arr));
    }

    private void test9(SortTemplate sortTest) {
        Integer[] arr = TestDataUtils.createOrderlyIntArray(200000);
        sortTest.sort(arr);
//        sortTest.show(arr);
        Assert.assertTrue(sortTest.isSorted(arr));
    }
}
