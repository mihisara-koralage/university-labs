public class StackArray {
    private int maxSize; 
    private int[] stackData;
    private int top;
    private int count;
    
    public StackArray(int s) {
        this.maxSize = s;
        stackData = new int[maxSize];
        top = -1;
        count = 0;
    }
    public void push(int value) {
        if (!isFull()){
            stackData[++top] = value;
            ++count;
        }else{
            System.out.println("Stack is full");
        }
    }
    public boolean isFull() {
        return top == maxSize - 1;
    }
    public void display(){
        while(count > 0){
            System.out.print(stackData[count-1]);
            --count;
        }
        System.out.println();
    }
}
