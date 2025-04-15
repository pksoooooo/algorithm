class MyQueue {

    private Stack<Integer> stack;
    private Stack<Integer> temp;

    public MyQueue() {
        this.stack = new Stack<>();
        this.temp = new Stack<>();
    }
    
    public void push(int x) {

        if(empty()) {
            stack.push(x);
            return;
        }
        while(!empty()) {
            temp.push(stack.pop());
        }

        temp.push(x);
        while(!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        
        
    }
    
    public int pop() {
        if(!empty()) {
            return stack.pop();
        }

        return -1;
        
    }
    
    public int peek() {
        if(!empty()) {
            return stack.peek();
        }

        return -1;
    }
    
    public boolean empty() {
        return stack.isEmpty() ? true : false;
    }
}