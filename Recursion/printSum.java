
public class printSum {
    public static void printSumNum(int n,int i, int sum){
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
                    sum += i;
                    printSumNum(n, i+1, sum);
    }
    public static void main(String[] args) {
        printSumNum(5, 1, 0);
    }
    
}
