package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class ExecutionOfAllSuffixInstructionsStayingInAGridTest {

    @Test
    public void test1() {
        ExecutionOfAllSuffixInstructionsStayingInAGrid temp = new ExecutionOfAllSuffixInstructionsStayingInAGrid();
        Assert.assertArrayEquals(new int[]{1,5,4,3,1,0}, temp.executeInstructions(3, new int[]{0, 1}, "RRDDLU"));
    }

    @Test
    public void test2() {
        ExecutionOfAllSuffixInstructionsStayingInAGrid temp = new ExecutionOfAllSuffixInstructionsStayingInAGrid();
        Assert.assertArrayEquals(new int[]{4,1,0,0}, temp.executeInstructions(2, new int[]{1, 1}, "LURD"));
    }

    @Test
    public void test3() {
        ExecutionOfAllSuffixInstructionsStayingInAGrid temp = new ExecutionOfAllSuffixInstructionsStayingInAGrid();
        Assert.assertArrayEquals(new int[]{0,0,0,0}, temp.executeInstructions(1, new int[]{0, 0}, "LRUD"));
    }


}
