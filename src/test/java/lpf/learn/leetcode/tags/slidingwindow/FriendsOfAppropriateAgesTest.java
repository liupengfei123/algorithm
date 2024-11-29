package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class FriendsOfAppropriateAgesTest {

    @Test
    public void test1(){
        FriendsOfAppropriateAges test = new FriendsOfAppropriateAges();
        Assert.assertEquals(2, test.numFriendRequests(new int[]{16,16}));
    }

    @Test
    public void test2(){
        FriendsOfAppropriateAges test = new FriendsOfAppropriateAges();
        Assert.assertEquals(2, test.numFriendRequests(new int[]{16,17,18}));
    }

    @Test
    public void test3(){
        FriendsOfAppropriateAges test = new FriendsOfAppropriateAges();
        Assert.assertEquals(3, test.numFriendRequests(new int[]{20,30,100,110,120}));
    }

    @Test
    public void test4(){
        FriendsOfAppropriateAges test = new FriendsOfAppropriateAges();
        Assert.assertEquals(3, test.numFriendRequests(new int[]{108,115,5,24,82}));
    }


    @Test
    public void test5(){
        FriendsOfAppropriateAges test = new FriendsOfAppropriateAges();
        Assert.assertEquals(0, test.numFriendRequests(new int[]{5}));
    }

    @Test
    public void test6(){
        FriendsOfAppropriateAges test = new FriendsOfAppropriateAges();
        Assert.assertEquals(0, test.numFriendRequests(new int[]{5,3,2,1,2}));
    }

}
