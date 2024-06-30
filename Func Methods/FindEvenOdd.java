import java.util.Scanner;

public class FindEvenOdd {

    public static int evenOdd(int n){
        if(n%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        System.out.println(evenOdd(n));
    }
}
