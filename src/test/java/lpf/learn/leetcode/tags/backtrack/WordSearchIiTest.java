package lpf.learn.leetcode.tags.backtrack;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class WordSearchIiTest {
    @Test
    public void test1(){
        WordSearchIi test = new WordSearchIi();

        String[] expected = new String[]{"eat","oath"};

        MatcherAssert.assertThat(test.findWords(new char[][]{{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}},
                new String[]{"oath","pea","eat","rain"}), Matchers.containsInAnyOrder(expected));
    }

    @Test
    public void test2(){
        WordSearchIi test = new WordSearchIi();

        String[] expected = new String[]{};

        MatcherAssert.assertThat(test.findWords(new char[][]{{'a','b'},{'c','d'}},
                new String[]{"abcb"}), Matchers.containsInAnyOrder(expected));
    }

    @Test
    public void test3(){
        WordSearchIi test = new WordSearchIi();

        String[] expected = new String[]{"a"};

        MatcherAssert.assertThat(test.findWords(new char[][]{{'a'}},
                new String[]{"a"}), Matchers.containsInAnyOrder(expected));
    }
}
