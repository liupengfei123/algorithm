package lpf.learn.leetcode.tags.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class MajorityElementIiTest {
    @Test
    public void test1(){
        MajorityElementIi test = new MajorityElementIi();

        Assert.assertEquals(Collections.singletonList(3), test.majorityElement(new int[]{3,2,3}));
    }

    @Test
    public void test2(){
        MajorityElementIi test = new MajorityElementIi();

        Assert.assertEquals(Collections.singletonList(1), test.majorityElement(new int[]{1}));
    }

    @Test
    public void test3(){
        MajorityElementIi test = new MajorityElementIi();

        Assert.assertEquals(Arrays.asList(1,2), test.majorityElement(new int[]{1,1,1,3,3,2,2,2}));
    }
}
