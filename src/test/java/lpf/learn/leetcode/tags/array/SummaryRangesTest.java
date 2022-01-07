package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class SummaryRangesTest {

    @Test
    public void test1(){
        SummaryRanges test = new SummaryRanges();
        List<String> list = Arrays.asList("0->2", "4->5", "7");
        Assert.assertEquals(list, test.summaryRanges(new int[]{0,1,2,4,5,7}));
    }

    @Test
    public void test2(){
        SummaryRanges test = new SummaryRanges();
        List<String> list = Arrays.asList("0","2->4","6","8->9");
        Assert.assertEquals(list, test.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }

    @Test
    public void test3(){
        SummaryRanges test = new SummaryRanges();
        List<String> list = Collections.emptyList();
        Assert.assertEquals(list, test.summaryRanges(new int[]{}));
    }

    @Test
    public void test4(){
        SummaryRanges test = new SummaryRanges();
        List<String> list = Collections.singletonList("-1");
        Assert.assertEquals(list, test.summaryRanges(new int[]{-1}));
    }

    @Test
    public void test5(){
        SummaryRanges test = new SummaryRanges();
        List<String> list = Collections.singletonList("0");
        Assert.assertEquals(list, test.summaryRanges(new int[]{0}));
    }

}
