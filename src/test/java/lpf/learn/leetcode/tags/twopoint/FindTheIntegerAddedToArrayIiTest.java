package lpf.learn.leetcode.tags.twopoint;


import org.junit.Assert;
import org.junit.Test;

public class FindTheIntegerAddedToArrayIiTest {

    @Test
    public void test1(){
        FindTheIntegerAddedToArrayIi test = new FindTheIntegerAddedToArrayIi();
        Assert.assertEquals(4, test.minimumAddedInteger(new int[]{9,4,3,9,4}, new int[]{7,8,8}));
    }

    @Test
    public void test2(){
        FindTheIntegerAddedToArrayIi test = new FindTheIntegerAddedToArrayIi();
        Assert.assertEquals(2, test.minimumAddedInteger(new int[]{3,5,5,3}, new int[]{7,7}));
    }


    @Test
    public void test3(){
        FindTheIntegerAddedToArrayIi test = new FindTheIntegerAddedToArrayIi();
        Assert.assertEquals(-2, test.minimumAddedInteger(new int[]{4,20,16,12,8}, new int[]{14,18,10}));
    }

    @Test
    public void test4(){
        FindTheIntegerAddedToArrayIi test = new FindTheIntegerAddedToArrayIi();
        Assert.assertEquals(-93, test.minimumAddedInteger(new int[]{7,7,100}, new int[]{7}));
    }

    @Test
    public void test5(){
        FindTheIntegerAddedToArrayIi test = new FindTheIntegerAddedToArrayIi();
        Assert.assertEquals(0, test.minimumAddedInteger(new int[]{4,6,3,1,4,2,10,9,5}, new int[]{5,10,3,2,6,1,9}));
    }
}
