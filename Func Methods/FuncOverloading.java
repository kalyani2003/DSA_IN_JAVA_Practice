import java.util.*;
public class FuncOverloading {
    public static int sum (int a,int b){   
        return a + b;
    }

    public static int sum( int a, int b, int c){    // use same function but diffrent 
        return a + b + c;                           // parameters called function overloading
    }
    public static void main(String[] args) {
        System.out.println(sum(5,5));
        System.out.println(sum(5,5,5));
    }
}
