package stack;

import java.util.Stack;

/**
 * @author alis
 * @date 2019/10/21 1:15 PM
 * @description
 */
public class LC_155_MinStack {

    /**
     * 数据栈
     */
    Stack<Integer> data;
    /**
     * 辅助栈
     */
    Stack<Integer> helper;

    /**
     * initialize your data structure here.
     */
    public LC_155_MinStack() {
        data = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        // 入栈
        data.push(x);
        if (helper.isEmpty() || helper.peek() > x) {
            helper.push(x);
        } else {
            helper.push(helper.peek());
        }
    }

    public void pop() {
        if (!data.isEmpty()) {
            return;
        }
        data.pop();
        helper.pop();
    }

    public int top() {
        if (data.isEmpty()) return 0;
        return data.peek();
    }

    public int getMin() {
        if (helper.isEmpty()) return 0;
        return helper.peek();
    }

}
