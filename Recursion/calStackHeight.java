
public class calStackHeight {
    public static int calHeight(int x, int n) {
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int pow_nm= calHeight(x, n-1);
        int pow = x * pow_nm;
        System.out.println(pow);

    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans = calHeight(x, n)
        System.out.println(ans);

    }
    
}
