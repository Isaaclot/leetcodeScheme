package recursion;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/10/26 10:15 PM
 * @description
 */
public class LC_22_GenerateParenthesisTest {

    private LC_22_GenerateParenthesis generateParenthesis = new LC_22_GenerateParenthesis();

    @Test
    public void generateParenthesisTest() {
        List<String> result = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertThat(generateParenthesis.generateParenthesis(3), is(result));
    }
}
