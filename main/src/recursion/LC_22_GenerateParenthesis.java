package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alis
 * @date 2019/10/26 10:19 PM
 * @description
 */
public class LC_22_GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        _generate(result, 0, 0, n, "");
        return result;
    }

    /**
     * 思路：记录两种括号的数量，根据合法括号的括号数量关系来组合括号(没一层添加括号，左括号不能超过括号对数，右括号不能超过左括号数量)
     * terminator：如果当前组装出来d字符串 长度达到目标长度，则输出
     * process：本层处理的逻辑：将本次格子可能填入的情况填进去，不过需要符合合法括号的规则，
     * 加左括号的时候，只要左括号数量没超过总括号对数，都可以增加
     * 加右括号的时候，右括号比左括号少的时候，就可以添加(没一层都遵守这个规则，不会出现左右括号不成对的情况，因为从0开始就遵守这个规则)
     */
    private void _generate(List<String> result, int left, int right, int max, String str) {
        if (str.length() == 2 * max) {
            result.add(str);
            return;
        }
        if (left < max) {
            _generate(result, left + 1, right, max, str + "(");
        }
        if (right < left) {
            _generate(result, left, right + 1, max, str + ")");
        }
    }
}
