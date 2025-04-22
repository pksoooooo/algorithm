class MyQueue {

    private Stack<Integer> stack;
    private Stack<Integer> temp;

    public MyQueue() {
        this.stack = new Stack<>();
        this.temp = new Stack<>();
    }

    public void push(int x) {

        if (empty()) {
            stack.push(x);
            return;
        }

        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        temp.push(x);
        
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

    }

    public int pop() {
        if (empty()) {
            return -1;
        }

        return stack.pop();

    }

    public int peek() {
        if (empty()) {
            return -1;
        }

        return stack.peek();

    }

    public boolean empty() {
        return stack.isEmpty() ? true : false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */