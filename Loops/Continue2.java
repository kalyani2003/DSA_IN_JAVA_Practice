import java.util.*;
public class Continue2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Enter any no : ");
            int n = scan.nextInt();

            if(n %10 == 0){
                continue;
            }
            System.out.println("Your no is " + n);
        }while(true);
    }
}
