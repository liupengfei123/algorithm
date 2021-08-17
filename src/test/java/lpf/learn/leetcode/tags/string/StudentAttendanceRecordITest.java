package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class StudentAttendanceRecordITest {

    @Test
    public void test1() {
        StudentAttendanceRecordI temp = new StudentAttendanceRecordI();
        Assert.assertTrue(temp.checkRecord("PPALLP"));
    }

    @Test
    public void test2() {
        StudentAttendanceRecordI temp = new StudentAttendanceRecordI();
        Assert.assertFalse(temp.checkRecord("PPALLL"));
    }

}
