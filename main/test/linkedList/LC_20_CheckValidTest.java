package linkedList;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author alis
 * @date 2019/10/20 12:08 PM
 * @description
 */
public class LC_20_CheckValidTest {

    private LC_20_CheckValid checkValid = new LC_20_CheckValid();

    @Test
    public void isValidTest() {
        assertTrue(checkValid.isValid("{}"));
        assertTrue(checkValid.isValid("()[]{}"));
    }
}
