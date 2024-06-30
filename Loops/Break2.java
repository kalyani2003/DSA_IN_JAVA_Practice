import java.util.*;
public class Break2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println(" Enter any no : ");
            int n = scan.nextInt();

            if(n % 5 == 0){
                break;
            }
            System.out.println("Your no is : " + n);
        }while(true);
    }
}
