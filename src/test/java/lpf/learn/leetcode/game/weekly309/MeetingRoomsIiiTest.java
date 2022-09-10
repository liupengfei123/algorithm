package lpf.learn.leetcode.game.weekly309;

import org.junit.Assert;
import org.junit.Test;

public class MeetingRoomsIiiTest {
    @Test
    public void test1(){
        MeetingRoomsIii test = new MeetingRoomsIii();
        Assert.assertEquals(0, test.mostBooked(2, new int[][]{{0,10},{1,5},{2,7},{3,4}}));
    }

    @Test
    public void test2(){
        MeetingRoomsIii test = new MeetingRoomsIii();
        Assert.assertEquals(1, test.mostBooked(3, new int[][]{{1,20},{2,10},{3,5},{4,9},{6,8}}));
    }

    @Test
    public void test3(){
        MeetingRoomsIii test = new MeetingRoomsIii();
        Assert.assertEquals(0, test.mostBooked(4, new int[][]{{18,19},{3,12},{17,19},{2,13},{7,10}}));
    }

    @Test
    public void test4(){
        MeetingRoomsIii test = new MeetingRoomsIii();
        Assert.assertEquals(0, test.mostBooked(4, new int[][]{{48,49},{22,30},{13,31},{31,46},{37,46},{32,36},{25,36},{49,50},{24,34},{6,41}}));
    }
}