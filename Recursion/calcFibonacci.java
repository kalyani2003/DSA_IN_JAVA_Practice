
public class calcFibonacci {
    public static void printFibnc(int a, int b, int n){
        if(n==0){
            return 
        }
                int c = a+b;
                System.out.println(c);
                printFibnc(b, c, n-1); // replace  a b c 
    }
    public static void main(String[] args) {
        int a=0, b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        printFibnc(a, b, n-2);

    }
    
}
