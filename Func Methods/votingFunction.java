import java.util.Scanner;

public class votingFunction {

    public static int voting(int age){
        if(age<18){
            System.out.println("Person is not able to vote");
        }else {
            System.out.println("person is able to vote");
        }
        return age;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        System.out.println(voting(age));
    }
}
