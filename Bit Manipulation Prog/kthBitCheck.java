import java.util.Scanner;

public class kthBitCheck {

    public static int checkKthBit(int n, int k){
        if((n & (1<<k)) != 0){
            System.out.println("bit set = "+"1"); 
        } else{
            System.out.println("bit not set = "+"0");
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = checkKthBit(n, k);
        System.out.println(result);



        
    }
}
