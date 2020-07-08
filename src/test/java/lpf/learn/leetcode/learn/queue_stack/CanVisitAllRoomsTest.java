package lpf.learn.leetcode.learn.queue_stack;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CanVisitAllRoomsTest {

    @Test
    public void test() {
        CanVisitAllRooms temp = new CanVisitAllRooms();

        List<List<Integer>> list1 = new LinkedList<>();
        list1.add(Arrays.asList(1));
        list1.add(Arrays.asList(2));
        list1.add(Arrays.asList(3));
        list1.add(Collections.EMPTY_LIST);
        Assert.assertTrue(temp.canVisitAllRooms(list1));


        List<List<Integer>> list2= new LinkedList<>();
        list2.add(Arrays.asList(1,3));
        list2.add(Arrays.asList(3, 0, 1));
        list2.add(Arrays.asList(2));
        list2.add(Arrays.asList(0));
        Assert.assertFalse(temp.canVisitAllRooms(list2));
    }


}
