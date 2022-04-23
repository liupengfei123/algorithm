package lpf.learn.leetcode.game.spring2022;

import org.junit.Assert;
import org.junit.Test;

public class Task6UEx57Test {
    @Test
    public void test1(){
        Task6UEx57 test = new Task6UEx57();
        Assert.assertEquals(1, test.conveyorBelt(new String[]{">>v", "v^<", "<><"}, new int[]{0, 1}, new int[]{2, 0}));
    }

    @Test
    public void test2(){
        Task6UEx57 test = new Task6UEx57();
        Assert.assertEquals(0, test.conveyorBelt(new String[]{">>v",">>v","^<<"}, new int[]{0, 0}, new int[]{1, 1}));
    }

    @Test
    public void test3(){
        Task6UEx57 test = new Task6UEx57();
        Assert.assertEquals(3, test.conveyorBelt(new String[]{">^^>","<^v>","^v^<"}, new int[]{0, 0}, new int[]{1, 3}));
    }

    @Test
    public void test4(){
        Task6UEx57 test = new Task6UEx57();
        Assert.assertEquals(3, test.conveyorBelt(new String[]{">^^>","<^v>","^v^<"}, new int[]{0, 0}, new int[]{1, 3}));
    }
}
