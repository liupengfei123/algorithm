package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class SingleElementInASortedArrayTest {
    @Test
    public void test1(){
        SingleElementInASortedArray test = new SingleElementInASortedArray();
        Assert.assertEquals(2, test.singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }

    @Test
    public void test2(){
        SingleElementInASortedArray test = new SingleElementInASortedArray();
        Assert.assertEquals(5, test.singleNonDuplicate(new int[]{1,1,3,3,4,4,5,8,8}));
    }

    @Test
    public void test3(){
        SingleElementInASortedArray test = new SingleElementInASortedArray();
        Assert.assertEquals(10, test.singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
    }

    @Test
    public void test4(){
        SingleElementInASortedArray test = new SingleElementInASortedArray();
        Assert.assertEquals(4, test.singleNonDuplicate(new int[]{3,3,4,7,7,11,11}));
    }


    @Test
    public void test5(){
        SingleElementInASortedArray test = new SingleElementInASortedArray();
        Assert.assertEquals(1, test.singleNonDuplicate(new int[]{1}));
    }

    @Test
    public void test6(){
        SingleElementInASortedArray test = new SingleElementInASortedArray();
        Assert.assertEquals(2, test.singleNonDuplicate(new int[]{1,1,2}));
    }
}
