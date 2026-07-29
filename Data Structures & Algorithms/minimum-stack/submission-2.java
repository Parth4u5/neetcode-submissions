class MinStack {

    class pairs{
        int value;
        int minimum;
        pairs(int value , int minimum){
            this.value = value;
            this.minimum = minimum;
        }
    }
    Stack<pairs> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new pairs(val , val));
        }else{
            int currentMin = stack.peek().minimum;
            int newMin = Math.min(val , currentMin);
            stack.push(new pairs(val , newMin));
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().value;
    }
    
    public int getMin() {
        return stack.peek().minimum; 
    }
}
