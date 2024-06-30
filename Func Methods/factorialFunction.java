import java.util.Scanner;

public class factorialFunction {

    public static int findFactorial(int n){
        int fact = 1;
        for(int i = n; i>1; i--){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFactorial(n));

    }
}
