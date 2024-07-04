
public class printNum1 {
    public static void printNumber(int n) {
        
        if(n == 0){
            return;  // Base condn
        }
        System.out.println(n);
        printNumber(n-1);   // Recursion
    }
    public static void main(String[] args) {
        int n =5;
        printNumber(n); // n=5
    }
    
}
