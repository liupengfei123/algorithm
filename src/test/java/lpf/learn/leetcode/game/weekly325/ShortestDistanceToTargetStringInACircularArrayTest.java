package lpf.learn.leetcode.game.weekly325;

import org.junit.Assert;
import org.junit.Test;

public class ShortestDistanceToTargetStringInACircularArrayTest {
    @Test
    public void test1(){
        ShortestDistanceToTargetStringInACircularArray test = new ShortestDistanceToTargetStringInACircularArray();
        Assert.assertEquals(1, test.closetTarget(new String[]{"hello","i","am","leetcode","hello"}, "hello", 1));
    }

    @Test
    public void test2(){
        ShortestDistanceToTargetStringInACircularArray test = new ShortestDistanceToTargetStringInACircularArray();
        Assert.assertEquals(1, test.closetTarget(new String[]{"a","b","leetcode"}, "leetcode", 0));
    }

    @Test
    public void test3(){
        ShortestDistanceToTargetStringInACircularArray test = new ShortestDistanceToTargetStringInACircularArray();
        Assert.assertEquals(-1, test.closetTarget(new String[]{"i","eat","leetcode"}, "ate", 0));
    }

}
