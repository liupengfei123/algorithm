package lpf.learn.algorithms.sort.quick;

import lpf.learn.algorithms.sort.SortTemplate;
import lpf.learn.algorithms.sort.TestDataUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-01-16 15:19
 */
public class QuickTest {

    @Test
    public void quick1Test() {
        Quick sortTest = new Quick();
        testAll(sortTest);
    }

    @Test
    public void quick2Test() {
        Quick2 sortTest = new Quick2();
        testAll(sortTest);
    }

    @Test
    public void quickInsertionTest() {
        QuickInsertion sortTest = new QuickInsertion();
        testAll(sortTest);
    }

    @Test
    public void quick_2_3_17Test() {
        Quick_2_3_17 sortTest = new Quick_2_3_17();
        testAll(sortTest);
    }

    @Test
    public void quick3wayTest() {
        Quick3way sortTest = new Quick3way();
        testAll(sortTest);
    }

    @Test
    public void quick_2_3_18Test() {
        Quick_2_3_18 sortTest = new Quick_2_3_18();
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
        Integer[] arr = new Integer[]{1,234,12,41,5,1,6,714,724,713,72,436,800};
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
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
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
