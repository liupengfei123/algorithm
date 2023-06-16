package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class ParallelCoursesIiTest {

    @Test
    public void test1(){
        ParallelCoursesIi test = new ParallelCoursesIi();
        Assert.assertEquals(3, test.minNumberOfSemesters(4, new int[][]{{2,1},{3,1},{1,4}}, 2));
    }

    @Test
    public void test2(){
        ParallelCoursesIi test = new ParallelCoursesIi();
        Assert.assertEquals(4, test.minNumberOfSemesters(5, new int[][]{{2,1},{3,1},{4,1},{1,5}}, 2));
    }

    @Test
    public void test3(){
        ParallelCoursesIi test = new ParallelCoursesIi();
        Assert.assertEquals(6, test.minNumberOfSemesters(11, new int[][]{}, 2));
    }

    @Test
    public void test4(){
        ParallelCoursesIi test = new ParallelCoursesIi();
        Assert.assertEquals(3, test.minNumberOfSemesters(13, new int[][]{{12,8},{2,4},{3,7},{6,8},{11,8},{9,4},{9,7},{12,4},{11,4},{6,4},{1,4},{10,7},{10,4},{1,7},{1,8},{2,7},{8,4},{10,8},{12,7},{5,4},{3,4},{11,7},{7,4},{13,4},{9,8},{13,8}}, 9));
    }
}
