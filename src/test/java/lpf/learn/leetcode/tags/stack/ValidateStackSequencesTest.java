package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class ValidateStackSequencesTest {

    @Test
    public void test(){
        ValidateStackSequences test = new ValidateStackSequences();

        Assert.assertTrue(test.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
        Assert.assertFalse(test.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}));
    }
}
