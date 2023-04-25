package lpf.learn.leetcode.tags.sort;

import org.junit.Assert;
import org.junit.Test;

public class SortThePeopleTest {
    @Test
    public void test1(){
        SortThePeople test = new SortThePeople();
        Assert.assertArrayEquals(new String[]{"Mary","Emma","John"}, test.sortPeople(new String[]{"Mary","John","Emma"}, new int[]{180,165,170}));
    }

    @Test
    public void test2(){
        SortThePeople test = new SortThePeople();
        Assert.assertArrayEquals(new String[]{"Bob","Alice","Bob"}, test.sortPeople(new String[]{"Alice","Bob","Bob"}, new int[]{155,185,150}));
    }

    @Test
    public void test3(){
        SortThePeople test = new SortThePeople();
        Assert.assertArrayEquals(new String[]{"Bob","Bob","Alice","Emma","John","Mary"},
                test.sortPeople(new String[]{"Mary","John","Emma","Alice","Bob","Bob"}, new int[]{1,2,3,4,5,6}));
    }

    @Test
    public void test4(){
        SortThePeople test = new SortThePeople();
        Assert.assertArrayEquals(new String[]{"EPCFFt","RPJOFYZUBFSIYp","VOYGWWNCf","Vk","Sgizfdfrims","IEO","QTASHKQ","WSpmqvb"},
                test.sortPeople(new String[]{"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"}, new int[]{17233,32521,14087,42738,46669,65662,43204,8224}));
    }

    @Test
    public void test5(){
        CarFleet test = new CarFleet();
        Assert.assertEquals(0, test.carFleet(12, new int[]{}, new int[]{}));
    }
}
