package stack;

import java.util.Stack;

public class IsPopOrder {

    public boolean IsPopOrder(int [] pushA,int [] popA){
        if(pushA.length <= 0 || popA.length <= 0 || popA.length != pushA.length)
            return false;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0, j = 0; i < pushA.length; i++){
            stack.push(pushA[i]);
            while (j < popA.length && !stack.empty() && popA[j] == stack.peek()){
                stack.pop();
                j++;
            }
        }
        return stack.empty();
    }
}
