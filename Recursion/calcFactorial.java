
public class calcFactorial {
    public static int printFact(int n){
        if(n==1 || n==0){
            return 1;
        }
       int fact_nm = printFact(n-1);
       int fact= n * fact_nm;
       System.out.println(fact);
    }
    public static void main(String[] args) {
        int n=5;
        int ans = printFact(n);
        System.out.println(ans);
    }
    
}
