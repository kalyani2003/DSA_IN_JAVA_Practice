import java.util.Scanner;

public class fibbonacci {
    public static int printFibonnaci(int count){

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        System.out.println(n1+" "+n2);

        for(int i=2; i<count; i++){
            n3 = n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
        return n3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        System.out.println(printFibonnaci(count));

    }
}
