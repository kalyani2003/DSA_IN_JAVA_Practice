import java.util.Scanner;

public class printSumOdd{

        public static int printSum(int n){
            int sum =0;
            for(int i=0; i<=n; i++){
                if( i%2 != 0){
                    sum +=i;
                }
            }
            return sum;
        }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of all odd numbers is :"+ printSum(n));

    }


}