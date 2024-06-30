import java.util.*;
public class BinaryDecimal {
    public static void binToDec(int n){
        int myNum = n;
        int pow = 0;
        int decNum = 0;

        while(n >0){
            int lastDigit =n % 10;
            decNum = decNum + (lastDigit *(int) Math.pow(2, pow)); //(2, pow       
               pow++;                                        // base is 2 nd pow is its power
        n = n /10;

        }
        System.out.println("Decimal of "+ myNum + " =" + decNum);
    }
    public static void main(String[] args) {
        binToDec(101);
    }
}
