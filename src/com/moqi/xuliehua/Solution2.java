package com.moqi.xuliehua;

import java.util.Stack;

public class Solution2 {
    /**
     * 思路：新建一个辅助栈 min 来存放最小值。
     * 入栈时，与辅助栈顶比较大小，如果小就入辅助栈min ；如果大就入栈data。
     *
     * 出栈时，注意辅助栈min 和 栈data 都要出栈。
     * */
    private Stack<Integer> data = new Stack<>();
    private Stack<Integer> min = new Stack<>();
    public void push(int node) {
        data.push(node);
        if (min.isEmpty() || node <= min.peek()) {
            min.push(node);
        }
    }

    public void pop() {
        if (!data.peek().equals(min.peek())) {
            data.pop();
        } else {
            data.pop();
            min.pop();
        }
    }

    public int top(Stack<Integer> data) {
        return data.peek();
    }

    public int min(Stack<Integer> min) {
        return min.peek();
    }
}