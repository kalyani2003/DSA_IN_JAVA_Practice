import java.util.*;
public class FuncParameters1 {
    public static int CalculateAdd(int a, int b){  //  called parameters or Formal parameters
        int sum = a + b;
        System.out.println("Sum is :"+ sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter any two nos :");
        int a = scan.nextInt();
        int b = scan.nextInt();
        CalculateAdd(a,b);      // called Arguments or actual parameters...

    }
}
