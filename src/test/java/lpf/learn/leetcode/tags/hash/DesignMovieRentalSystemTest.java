package lpf.learn.leetcode.tags.hash;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DesignMovieRentalSystemTest {
    @Test
    public void test1(){
        DesignMovieRentalSystem test = new DesignMovieRentalSystem(3, new int[][]{{0, 1, 5},{0, 2, 6},{0, 3, 7},{1, 1, 4},{1, 2, 7},{2, 1, 5}});

        List<Integer> search = test.search(1);
        Assert.assertEquals(Arrays.asList(1, 0, 2), search);

        test.rent(0, 1);
        test.rent(1, 2);

        List<List<Integer>> report = test.report();
        List<List<Integer>> expectedExpected = new ArrayList<>();
        expectedExpected.add(Arrays.asList(0, 1));
        expectedExpected.add(Arrays.asList(1, 2));
        Assert.assertEquals(expectedExpected, report);

        test.drop(1, 2);

        List<Integer> search2 = test.search(2);
        Assert.assertEquals(Arrays.asList(0, 1), search2);
    }

    @Test
    public void test2(){
        DesignMovieRentalSystem test = new DesignMovieRentalSystem(3, new int[][]{{0,418,3},{9,5144,46},{2,8986,29},{6,1446,28},{3,8215,97},{7,9105,34},{6,9105,30},{5,1722,94},{9,528,40},{3,850,77},{3,7069,40},{8,1997,42},{0,8215,28},{7,4050,80},{4,7100,97},{4,9686,32},{4,2566,93},{2,8320,12},{2,5495,56}});

        List<Integer> search = test.search(7837);
        Assert.assertEquals(Collections.emptyList(), search);

        List<Integer> search2 = test.search(5495);
        Assert.assertEquals(Collections.singletonList(2), search2);

        test.rent(4,7100);

        List<Integer> search3 = test.search(9105);
        Assert.assertEquals(Arrays.asList(6,7), search3);

        List<Integer> search4 = test.search(1446);
        Assert.assertEquals(Collections.singletonList(6), search4);

        List<List<Integer>> report = test.report();
        List<List<Integer>> expectedExpected = new ArrayList<>();
        expectedExpected.add(Arrays.asList(4, 7100));
        Assert.assertEquals(expectedExpected, report);

        List<Integer> search5 = test.search(9869);
        Assert.assertEquals(Collections.emptyList(), search5);

        test.drop(4,7100);
    }
}
