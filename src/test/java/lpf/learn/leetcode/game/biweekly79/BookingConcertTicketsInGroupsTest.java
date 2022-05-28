package lpf.learn.leetcode.game.biweekly79;

import org.junit.Assert;
import org.junit.Test;

public class BookingConcertTicketsInGroupsTest {
    @Test
    public void test1(){
        BookingConcertTicketsInGroups test = new BookingConcertTicketsInGroups(2, 5);

        Assert.assertArrayEquals(new int[]{0, 0}, test.gather(4, 0));

        Assert.assertArrayEquals(new int[0], test.gather(2, 0));

        Assert.assertEquals(true, test.scatter(5, 1));

        Assert.assertEquals(false, test.scatter(5, 1));
    }

    @Test
    public void test2(){
        BookingConcertTicketsInGroups test = new BookingConcertTicketsInGroups(2, 5);

        Assert.assertArrayEquals(new int[]{0, 0}, test.gather(4, 0));

        Assert.assertArrayEquals(new int[0], test.gather(2, 0));

        Assert.assertEquals(false, test.scatter(2, 0));

        Assert.assertEquals(true, test.scatter(1, 0));
    }

    @Test
    public void test3(){
        BookingConcertTicketsInGroups test = new BookingConcertTicketsInGroups(2, 5);

        Assert.assertArrayEquals(new int[]{0, 0}, test.gather(4, 0));

        Assert.assertArrayEquals(new int[0], test.gather(2, 0));

        Assert.assertEquals(false, test.scatter(2, 0));

        Assert.assertEquals(true, test.scatter(3, 1));
    }

}
