import java.util.*;
public class BreakNo {
    public static void main(String args[]){

        for( int i= 1; i <10; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }  
        System.out.println("IM AM OUT OF THE LOOP");
      }
}
