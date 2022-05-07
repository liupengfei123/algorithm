package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class MinimumGeneticMutationTest {

    @Test
    public void test1() {
        MinimumGeneticMutation temp = new MinimumGeneticMutation();
        Assert.assertEquals(-1, temp.minMutation("AACCGGTT", "AACCGGTA", new String[0]));
    }

    @Test
    public void test2() {
        MinimumGeneticMutation temp = new MinimumGeneticMutation();
        Assert.assertEquals(1, temp.minMutation("AACCGGTT", "AACCGGTA", new String[]{"AACCGGTA"}));
    }

    @Test
    public void test3() {
        MinimumGeneticMutation temp = new MinimumGeneticMutation();
        Assert.assertEquals(2, temp.minMutation("AACCGGTT", "AAACGGTA", new String[]{"AACCGGTA","AACCGCTA","AAACGGTA"}));
    }

    @Test
    public void test4() {
        MinimumGeneticMutation temp = new MinimumGeneticMutation();
        Assert.assertEquals(3, temp.minMutation("AAAAACCC", "AACCCCCC", new String[]{"AAAACCCC","AAACCCCC","AACCCCCC"}));
    }


    @Test
    public void test5() {
        MinimumGeneticMutation temp = new MinimumGeneticMutation();
        Assert.assertEquals(3, temp.minMutation("AAAAACCC", "AACCCCCC", new String[]{"AAAACCCC","AAACCCCC","AACCCCCC","AAAACACC","AAACCACC","AACCCACC"}));
    }
}
