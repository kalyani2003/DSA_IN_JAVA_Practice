import java.util.*;
public class FuncParameters {

    public static void PrintHelloWorld(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }

    public static int CalculateAdd(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any two nos :");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a + b;
        System.out.println("Sum is :"+sum);
        return sum;

    }
        public static void main(String args[]){
            PrintHelloWorld();
            CalculateAdd();
           
        }
        
    }

