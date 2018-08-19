package stack;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int res = 0;
        while(!stack1.empty()){
            int node = stack1. peek();
            stack2.push(node);
            stack1.pop();
        }
        res = stack2. peek();
        stack2.pop();
        while(!stack2.empty()){
            int node = stack2. peek();
            stack1.push(node);
            stack2.pop();
        }
        return res;
    }
}
