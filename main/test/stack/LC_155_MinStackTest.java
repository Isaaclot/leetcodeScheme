package stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author alis
 * @date 2019/10/21 1:12 PM
 * @description
 */
public class LC_155_MinStackTest {

    private LC_155_MinStack minStack = new LC_155_MinStack();

    @Test
    public void minStackGetMin(){
        minStack.push(2);
        minStack.push(4);
        minStack.push(3);
        assertEquals(minStack.getMin(), 2);
    }
}
