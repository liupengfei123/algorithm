package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class largeGroupPositionsTest {

    @Test
    public void test1(){
        List<List<Integer>> temp = new ArrayList<>();
        temp.add(Arrays.asList(3, 6));
        largeGroupPositions test = new largeGroupPositions();
        Assert.assertEquals(temp, test.largeGroupPositions("abbxxxxzzy"));
    }

    @Test
    public void test2(){
        List<List<Integer>> temp = new ArrayList<>();
        largeGroupPositions test = new largeGroupPositions();
        Assert.assertEquals(temp, test.largeGroupPositions("abc"));
    }

    @Test
    public void test3(){
        List<List<Integer>> temp = new ArrayList<>();
        temp.add(Arrays.asList(3,5));
        temp.add(Arrays.asList(6,9));
        temp.add(Arrays.asList(12,14));
        largeGroupPositions test = new largeGroupPositions();
        Assert.assertEquals(temp, test.largeGroupPositions("abcdddeeeeaabbbcd"));
    }
    @Test
    public void test4(){
        List<List<Integer>> temp = new ArrayList<>();
        temp.add(Arrays.asList(0,2));
        largeGroupPositions test = new largeGroupPositions();
        Assert.assertEquals(temp, test.largeGroupPositions("aaa"));
    }

}
