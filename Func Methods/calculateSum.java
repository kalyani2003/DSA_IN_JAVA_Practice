import java.util.*;
public class calculateSum{
    public static int findSum(int a, int b){
                int sum =a+b;
                return sum;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a= scan.nextInt();
        int b = scan.nextInt();
        
        int sum = findSum(a, b);

        System.out.println("sum is :"+ sum);
        findSum(a,b);
    }
}