package recursion;

import java.util.*;

/**
 * @author alis
 * @date 2019/10/29 12:17 AM
 * @description
 */
public class LC_17_LetterCombinations {


    /**
     * 12:37 AM	info
     * Success:
     * Runtime:1 ms,faster than 98.88% of Java online submissions.
     * Memory Usage:36.1 MB, less than 73.28% of Java online submissions.
     * <p>
     * 分治/回溯(递归)核心思想
     * 将输入号码，这个操作看作是填格子，每个格子仅容纳有限种类情况，每填一个格子，就是一层递归，
     * 而填每个格子的可能输入字母，就是这个电话号码字母组合的子问题，处理好每个子问题之后，再整合每个子问题，成为结果
     */
    public List<String> letterCombinationConquer(String inputStr) {
        if (null == inputStr || inputStr.length() == 0) return Collections.emptyList();
        // pre data
        Map<String, Object> keyMap = new HashMap<>();
        keyMap.put("2", "abc");
        keyMap.put("3", "def");
        keyMap.put("4", "ghi");
        keyMap.put("5", "jkl");
        keyMap.put("6", "mno");
        keyMap.put("7", "pqrs");
        keyMap.put("8", "tuv");
        keyMap.put("9", "wxyz");
        List<String> result = new ArrayList<>();
        combinationStr(inputStr, 0, "", result, keyMap);
        return result;
    }

    private void combinationStr(String inputStr, int level, String currentStr, List<String> result, Map<String, Object> keyMap) {
        // terminator
        if (level == inputStr.length()) {
            result.add(currentStr);
            return;
        }
        // process split subProblems
        for (char c : String.valueOf(keyMap.get(inputStr.charAt(level) + "")).toCharArray()) {
            combinationStr(inputStr, level + 1, currentStr + c, result, keyMap);
        }
    }


}
