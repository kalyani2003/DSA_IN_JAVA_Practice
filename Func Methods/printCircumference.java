import java.util.Scanner;

public class printCircumference {

    public static float circumferenceOfCircle(int r){
        float circumference = (float) (2* 3.14 * r);
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
    System.out.println("Circumference of circle is :" + circumferenceOfCircle(r) );
    }
}
