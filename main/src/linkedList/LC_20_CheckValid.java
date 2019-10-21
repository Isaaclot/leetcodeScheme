package linkedList;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author alis
 * @date 2019/10/20 12:09 PM
 * @description
 */
public class LC_20_CheckValid {
    public boolean isValid(String s) {
        Stack<Character> chs = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                chs.push(c);
            } else if (c == '[') {
                chs.push(c);
            } else if (c == '{') {
                chs.push(c);
            } else if (chs.isEmpty() || chs.pop() != map.get(c)) {
                return false;
            }
        }
        return chs.isEmpty();
    }
}
