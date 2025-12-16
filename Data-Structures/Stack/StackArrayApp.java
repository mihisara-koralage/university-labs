public class StackArrayApp {
public static void main(String[] args) {
        StackArray s1 = new StackArray(3);
        
        s1.push(1);
        s1.push(2);
        s1.push(3);
        System.out.println(s1.peek());
        s1.pop();
        System.out.println(s1.peek());
        s1.push(4);
        System.out.println(s1.peek());
        s1.push(5);
        
    }
    
}
