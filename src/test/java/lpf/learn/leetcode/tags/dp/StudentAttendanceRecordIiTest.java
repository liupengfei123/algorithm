package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class StudentAttendanceRecordIiTest {
    @Test
    public void test1(){
        StudentAttendanceRecordIi test = new StudentAttendanceRecordIi();
        Assert.assertEquals(3, test.checkRecord(1));
    }

    @Test
    public void test2(){
        StudentAttendanceRecordIi test = new StudentAttendanceRecordIi();
        Assert.assertEquals(8, test.checkRecord(2));
    }

    @Test
    public void test3(){
        StudentAttendanceRecordIi test = new StudentAttendanceRecordIi();
        Assert.assertEquals(3536, test.checkRecord(10));
    }

    @Test
    public void test4(){
        StudentAttendanceRecordIi test = new StudentAttendanceRecordIi();
        Assert.assertEquals(985598218, test.checkRecord(100));
    }

    @Test
    public void test5(){
        StudentAttendanceRecordIi test = new StudentAttendanceRecordIi();
        Assert.assertEquals(183236316, test.checkRecord(10101));
    }

    @Test
    public void test6(){
        StudentAttendanceRecordIi test = new StudentAttendanceRecordIi();
        Assert.assertEquals(602635744, test.checkRecord(10001));
    }



}
