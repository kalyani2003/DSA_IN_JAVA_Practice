import java.util.Scanner;

public class findGreaterNo {

    public static int greaterNo(int a, int b){
        if(a>b && b<a){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Greater No is :" + greaterNo(a, b));

    }
}
