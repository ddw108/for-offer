package stack;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> data = new Stack<>();
    private Stack<Integer> min = new Stack<>();

    public void push(int node){
        data.push(node);
        if(!min.empty()){
            if(node < min.peek())
                min.push(node);
            else
                min.push(min.peek());
        }else
            min.push(node);
    }

    public void pop(){
        data.pop();
        min.pop();
    }

    public int top(){
        return data.peek();
    }

    public int min(){
        return min.peek();
    }
}
