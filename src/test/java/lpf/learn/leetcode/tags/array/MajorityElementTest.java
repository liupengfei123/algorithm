package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MajorityElementTest {

    @Test
    public void test1(){
        MajorityElement test = new MajorityElement();
        Assert.assertEquals(1, test.majorityElement(new int[]{1}));
    }

    @Test
    public void test2(){
        MajorityElement test = new MajorityElement();
        Assert.assertEquals(3, test.majorityElement(new int[]{3,2,3}));
    }

    @Test
    public void test3(){
        MajorityElement test = new MajorityElement();
        Assert.assertEquals(2, test.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    @Test
    public void test4(){
        MajorityElement test = new MajorityElement();
        Assert.assertEquals(2, test.majorityElement(new int[]{2,2,1,1,3,2,2}));
    }
}
