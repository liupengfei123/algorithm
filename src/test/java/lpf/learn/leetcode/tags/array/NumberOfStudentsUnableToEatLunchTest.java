package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class NumberOfStudentsUnableToEatLunchTest {

    @Test
    public void test1(){
        NumberOfStudentsUnableToEatLunch test = new NumberOfStudentsUnableToEatLunch();
        Assert.assertEquals(0, test.countStudents(new int[]{1,1,0,0}, new int[]{0,1,0,1}));
    }

    @Test
    public void test2(){
        NumberOfStudentsUnableToEatLunch test = new NumberOfStudentsUnableToEatLunch();
        Assert.assertEquals(3, test.countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1}));
    }
}
