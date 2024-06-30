import java.util.*;
public class Num {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of range :");
        int range = scan.nextInt();
        int i = 0;

        while(i<=range){
            System.out.println(i );
            i++;
        }
    }
    
}
