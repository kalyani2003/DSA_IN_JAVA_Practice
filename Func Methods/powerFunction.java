import java.util.Scanner;

public class powerFunction {

    public static int findPower(int x, int n){
            int result =1;
        for(int i =0; i<n; i++){
            result = result * x;
        }
    return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
    
        System.out.println("Power of Number is: "+ findPower(x, n));

    }
}
