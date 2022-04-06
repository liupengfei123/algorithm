package lpf.learn.leetcode.tags.string;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class LetterCombinationsOfAPhoneNumberTest {

    @Test
    public void test1() {
        LetterCombinationsOfAPhoneNumber temp = new LetterCombinationsOfAPhoneNumber();
        String[] expected = new String[]{"ad","ae","af","bd","be","bf","cd","ce","cf"};

        MatcherAssert.assertThat(temp.letterCombinations("23"), Matchers.containsInAnyOrder(expected));
    }

    @Test
    public void test2() {
        LetterCombinationsOfAPhoneNumber temp = new LetterCombinationsOfAPhoneNumber();
        String[] expected = new String[]{};

        MatcherAssert.assertThat(temp.letterCombinations(""), Matchers.containsInAnyOrder(expected));
    }

    @Test
    public void test3() {
        LetterCombinationsOfAPhoneNumber temp = new LetterCombinationsOfAPhoneNumber();
        String[] expected = new String[]{"a","b","c"};

        MatcherAssert.assertThat(temp.letterCombinations("2"), Matchers.containsInAnyOrder(expected));
    }

    @Test
    public void test4() {
        LetterCombinationsOfAPhoneNumber temp = new LetterCombinationsOfAPhoneNumber();
        String[] expected = new String[]{"adwm","adwn","adwo","adxm","adxn","adxo","adym","adyn","adyo","adzm","adzn","adzo","aewm","aewn","aewo","aexm","aexn","aexo",
                "aeym","aeyn","aeyo","aezm","aezn","aezo","afwm","afwn","afwo","afxm","afxn","afxo","afym","afyn","afyo","afzm","afzn","afzo","bdwm","bdwn",
                "bdwo","bdxm","bdxn","bdxo","bdym","bdyn","bdyo","bdzm","bdzn","bdzo","bewm","bewn","bewo","bexm","bexn","bexo","beym",
                "beyn","beyo","bezm","bezn","bezo","bfwm","bfwn","bfwo","bfxm","bfxn","bfxo","bfym","bfyn","bfyo","bfzm","bfzn","bfzo",
                "cdwm","cdwn","cdwo","cdxm","cdxn","cdxo","cdym","cdyn","cdyo","cdzm","cdzn","cdzo","cewm","cewn","cewo","cexm","cexn",
                "cexo","ceym","ceyn","ceyo","cezm","cezn","cezo","cfwm","cfwn","cfwo","cfxm","cfxn","cfxo","cfym","cfyn","cfyo","cfzm","cfzn","cfzo"};

        MatcherAssert.assertThat(temp.letterCombinations("2396"), Matchers.containsInAnyOrder(expected));
    }

    @Test
    public void test5() {
        LetterCombinationsOfAPhoneNumber temp = new LetterCombinationsOfAPhoneNumber();
        String[] expected = new String[]{"tpwm","tpwn","tpwo","tpxm","tpxn","tpxo","tpym","tpyn","tpyo","tpzm","tpzn",
                "tpzo","tqwm","tqwn","tqwo","tqxm","tqxn","tqxo","tqym","tqyn","tqyo","tqzm","tqzn","tqzo","trwm","trwn",
                "trwo","trxm","trxn","trxo","trym","tryn","tryo","trzm","trzn","trzo","tswm","tswn","tswo","tsxm","tsxn",
                "tsxo","tsym","tsyn","tsyo","tszm","tszn","tszo","upwm","upwn","upwo","upxm","upxn","upxo","upym","upyn",
                "upyo","upzm","upzn","upzo","uqwm","uqwn","uqwo","uqxm","uqxn","uqxo","uqym","uqyn","uqyo","uqzm","uqzn",
                "uqzo","urwm","urwn","urwo","urxm","urxn","urxo","urym","uryn","uryo","urzm","urzn","urzo","uswm","uswn",
                "uswo","usxm","usxn","usxo","usym","usyn","usyo","uszm","uszn","uszo","vpwm","vpwn","vpwo","vpxm","vpxn",
                "vpxo","vpym","vpyn","vpyo","vpzm","vpzn","vpzo","vqwm","vqwn","vqwo","vqxm","vqxn","vqxo","vqym","vqyn",
                "vqyo","vqzm","vqzn","vqzo","vrwm","vrwn","vrwo","vrxm","vrxn","vrxo","vrym","vryn","vryo","vrzm","vrzn",
                "vrzo","vswm","vswn","vswo","vsxm","vsxn","vsxo","vsym","vsyn","vsyo","vszm","vszn","vszo"};

        MatcherAssert.assertThat(temp.letterCombinations("8796"), Matchers.containsInAnyOrder(expected));
    }
}
