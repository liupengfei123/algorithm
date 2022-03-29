package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class MaximizeTheConfusionOfAnExamTest {

    @Test
    public void test0() {
        MaximizeTheConfusionOfAnExam temp = new MaximizeTheConfusionOfAnExam();
        Assert.assertEquals(1, temp.maxConsecutiveAnswers("F", 1));
    }

    @Test
    public void test1() {
        MaximizeTheConfusionOfAnExam temp = new MaximizeTheConfusionOfAnExam();
        Assert.assertEquals(4, temp.maxConsecutiveAnswers("TTFF", 2));
    }

    @Test
    public void test2() {
        MaximizeTheConfusionOfAnExam temp = new MaximizeTheConfusionOfAnExam();
        Assert.assertEquals(3, temp.maxConsecutiveAnswers("TFFT", 1));
    }

    @Test
    public void test3() {
        MaximizeTheConfusionOfAnExam temp = new MaximizeTheConfusionOfAnExam();
        Assert.assertEquals(5, temp.maxConsecutiveAnswers("TTFTTFTT", 1));
    }

    @Test
    public void test4() {
        MaximizeTheConfusionOfAnExam temp = new MaximizeTheConfusionOfAnExam();
        Assert.assertEquals(8, temp.maxConsecutiveAnswers("TTFTFTFFFTFTFFTFTFTFTTTTFF", 2));
    }

    @Test
    public void test5() {
        MaximizeTheConfusionOfAnExam temp = new MaximizeTheConfusionOfAnExam();
        Assert.assertEquals(24, temp.maxConsecutiveAnswers("TTFTFTFFFTFFTFTFTTFTFTFTFTFTFTFTFTFTFTTFTFTFTFTTFTFTFTFTFFTFTFTFTTTTFF", 10));
    }

    @Test
    public void test6() {
        MaximizeTheConfusionOfAnExam temp = new MaximizeTheConfusionOfAnExam();
        Assert.assertEquals(43, temp.maxConsecutiveAnswers("TTFTFTFFFTFFTFTFTTFTFTFTFTFTFTFTFTFTFTTFTFTFTFTTFTFTFTFTFFTFTFTFTTTTFF", 19));
    }

    @Test
    public void test7() {
        MaximizeTheConfusionOfAnExam temp = new MaximizeTheConfusionOfAnExam();
        Assert.assertEquals(2, temp.maxConsecutiveAnswers("TF", 2));
    }
}
