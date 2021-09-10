package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class FindTheStudentThatWillReplaceTheChalkTest {

    @Test
    public void test1(){
        FindTheStudentThatWillReplaceTheChalk test = new FindTheStudentThatWillReplaceTheChalk();
        Assert.assertEquals(0, test.chalkReplacer(new int[]{5,1,5}, 22));
    }

    @Test
    public void test2(){
        FindTheStudentThatWillReplaceTheChalk test = new FindTheStudentThatWillReplaceTheChalk();
        Assert.assertEquals(1, test.chalkReplacer(new int[]{3,4,1,2}, 25));
    }

}
