package lpf.learn.leetcode.tags.string;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class CamelcaseMatchingTest {

    @Test
    public void test1() {
        CamelcaseMatching temp = new CamelcaseMatching();

        Boolean[] expected = {true,false,true,true,false};

        MatcherAssert.assertThat(temp.camelMatch(new String[]{"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}, "FB"),
                Matchers.contains(expected));
    }

    @Test
    public void test2() {
        CamelcaseMatching temp = new CamelcaseMatching();

        Boolean[] expected = {true,false,true,false,false};

        MatcherAssert.assertThat(temp.camelMatch(new String[]{"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}, "FoBa"),
                Matchers.contains(expected));
    }

    @Test
    public void test3() {
        CamelcaseMatching temp = new CamelcaseMatching();

        Boolean[] expected = {false,true,false,false,false};

        MatcherAssert.assertThat(temp.camelMatch(new String[]{"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}, "FBT"),
                Matchers.contains(expected));
    }
}
