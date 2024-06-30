import java.util.*;
public class ReverseNo {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any no :");
        int n = scan.nextInt();

        while(n> 0){
        int lastDigit = n % 10;     // we get last digit of any no.. REMAINDER 
        System.out.print(lastDigit );
        n = n /10;                  // we can remove the laast digit ..
        
        }
        System.out.println();
    }
}
