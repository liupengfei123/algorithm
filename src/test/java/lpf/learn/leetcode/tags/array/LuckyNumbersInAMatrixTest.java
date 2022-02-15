package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class LuckyNumbersInAMatrixTest {

    @Test
    public void test1(){
        LuckyNumbersInAMatrix test = new LuckyNumbersInAMatrix();
        List<Integer> list = Collections.singletonList(15);
        Assert.assertEquals(list, test.luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}}));
    }

    @Test
    public void test2(){
        LuckyNumbersInAMatrix test = new LuckyNumbersInAMatrix();
        List<Integer> list = Collections.singletonList(12);
        Assert.assertEquals(list, test.luckyNumbers(new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}}));
    }

    @Test
    public void test3(){
        LuckyNumbersInAMatrix test = new LuckyNumbersInAMatrix();
        List<Integer> list = Collections.singletonList(7);
        Assert.assertEquals(list, test.luckyNumbers(new int[][]{{7,8},{1,2}}));
    }

    @Test
    public void test4(){
        LuckyNumbersInAMatrix test = new LuckyNumbersInAMatrix();
        List<Integer> list = Collections.singletonList(1);
        Assert.assertEquals(list, test.luckyNumbers(new int[][]{{1}}));
    }

}
