public class swapNos {
    public static void main(String[] args) {
        int b = 8;
        int a = 5;
        System.out.println("Before Swapping values are: "+ "a ="+ a +" b ="+ b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping values are: "+"a ="+ a +" b ="+ b);

        
    }
}
