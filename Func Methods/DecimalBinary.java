import java.util.*;
public class DecimalBinary {

    public static void DecToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum =0;
        
        while(n>0){
            int rem = n %2;   // will get remainder from here
            binNum = binNum + (rem * (int) Math.pow(10,pow)); // formula for Decimal to Binary 

            pow ++;
            n = n/2;  // will get quotient frm here
        }
        System.out.println(" Bin form is"+ myNum +"="+ binNum );
    }
    public static void main(String[] args) {
        DecToBin(4);
        DecToBin(7);
        DecToBin(12);
    }
}
