package lpf.learn.leetcode.tags.hash;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class RepeatedDnaSequencesTest {
    @Test
    public void test1(){
        RepeatedDnaSequences test = new RepeatedDnaSequences();

        String[] expected = {"AAAAACCCCC", "CCCCCAAAAA"};

        MatcherAssert.assertThat(test.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"), Matchers.containsInAnyOrder(expected));
    }

    @Test
    public void test2(){
        RepeatedDnaSequences test = new RepeatedDnaSequences();

        String[] expected = {"AAAAAAAAAA"};

        MatcherAssert.assertThat(test.findRepeatedDnaSequences("AAAAAAAAAAAAA"), Matchers.containsInAnyOrder(expected));
    }

    @Test
    public void test3(){
        RepeatedDnaSequences test = new RepeatedDnaSequences();

        String[] expected = {"AAAAAAAAAA"};

        MatcherAssert.assertThat(test.findRepeatedDnaSequences("AAAAAAAAAAA"), Matchers.containsInAnyOrder(expected));
    }
}
