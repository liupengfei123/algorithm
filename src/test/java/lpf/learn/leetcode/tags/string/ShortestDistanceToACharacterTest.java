package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class ShortestDistanceToACharacterTest {

    @Test
    public void test1() {
        ShortestDistanceToACharacter temp = new ShortestDistanceToACharacter();
        Assert.assertArrayEquals(new int[]{0}, temp.shortestToChar("b", 'b'));
    }

    @Test
    public void test2() {
        ShortestDistanceToACharacter temp = new ShortestDistanceToACharacter();
        Assert.assertArrayEquals(new int[]{3,2,1,0}, temp.shortestToChar("aaab", 'b'));
    }

    @Test
    public void test3() {
        ShortestDistanceToACharacter temp = new ShortestDistanceToACharacter();
        Assert.assertArrayEquals(new int[]{3,2,1,0,1,0,0,1,2,2,1,0}, temp.shortestToChar("loveleetcode", 'e'));
    }

    @Test
    public void test4() {
        ShortestDistanceToACharacter temp = new ShortestDistanceToACharacter();
        Assert.assertArrayEquals(new int[]{3,2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2}, temp.shortestToChar("aaabbbbbbbbbbbbbaa", 'b'));
    }

    @Test
    public void test5() {
        ShortestDistanceToACharacter temp = new ShortestDistanceToACharacter();
        Assert.assertArrayEquals(new int[]{14,13,12,11,10,9,8,7,6,5,4,3,2,1,0,1,1,0,1,0,1,1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17}, temp.shortestToChar("loveleeagaqlhlublunubzuyndlampaldkhtcode", 'u'));
    }
}
