import java.util.Scanner;
public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        StackArray s1 = new StackArray(size);
        
        System.out.print("Enter integer number to convert to binary: ");
        int n = sc.nextInt();
        
        while(n > 0){
            int r = n%2;
            s1.push(r);
            n /= 2;
        }
        s1.display();
        
    }
    
}
