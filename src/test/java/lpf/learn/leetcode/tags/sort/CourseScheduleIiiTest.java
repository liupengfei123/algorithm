package lpf.learn.leetcode.tags.sort;

import org.junit.Assert;
import org.junit.Test;

public class CourseScheduleIiiTest {
    @Test
    public void test1(){
        CourseScheduleIii test = new CourseScheduleIii();
        Assert.assertEquals(3, test.scheduleCourse(new int[][]{{100, 200},{200, 1300},{1000, 1250},{2000, 3200}}));
    }

    @Test
    public void test2(){
        CourseScheduleIii test = new CourseScheduleIii();
        Assert.assertEquals(0, test.scheduleCourse(new int[][]{{3,2},{4,3}}));
    }

    @Test
    public void test3(){
        CourseScheduleIii test = new CourseScheduleIii();
        Assert.assertEquals(1, test.scheduleCourse(new int[][]{{1,2}}));
    }

    @Test
    public void test4(){
        CourseScheduleIii test = new CourseScheduleIii();
        Assert.assertEquals(2, test.scheduleCourse(new int[][]{{1,2},{2,3}}));
    }

    @Test
    public void test5(){
        CourseScheduleIii test = new CourseScheduleIii();
        Assert.assertEquals(4, test.scheduleCourse(new int[][]{{2,3},{6,8},{6,11},{3,12},{3,13},{3,14},{6,16},{7,16},{10,16},{10,19}}));
    }

    @Test
    public void test6(){
        CourseScheduleIii test = new CourseScheduleIii();
        Assert.assertEquals(5, test.scheduleCourse(new int[][]{{5,15},{3,19},{6,7},{2,10},{5,16},{8,14},{10,11},{2,19}}));
    }
}
