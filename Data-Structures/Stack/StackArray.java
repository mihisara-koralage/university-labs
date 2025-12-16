public class StackArray {
    private int maxSize; 
    private int[] stackData;
    private int top;

    public StackArray(int s) {
        this.maxSize = s;
        stackData = new int[maxSize];
        top = -1;
    }
    //push elements
    public void push(int value) {
        if (!isFull()){
            stackData[++top] = value;
        }else{
            System.out.println("Stack is full");
        }
    }
    //pop elements
    public int pop() {
        if(!isEmpty()){
            return stackData[top--];
        }else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    // peek at top of stack
    public int peek() {
        if(!isEmpty()){
            return stackData[top];
        }else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == maxSize - 1;
    }
    
}
