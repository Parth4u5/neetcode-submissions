class MinStack {

    class pair{
        int value;
        int minsoFar;
        pair(int value , int minsoFar){
            this.value = value;
            this.minsoFar = minsoFar;
        }
    }
    Stack<pair> stack;
    public MinStack() {
       stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new pair(val , val));
        }else{
            int currentMin = stack.peek().minsoFar;
            int newMin = Math.min(val , currentMin);
            stack.push(new pair(val , newMin));
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().value;
    }
    
    public int getMin() {
        return stack.peek().minsoFar;
    }
}
