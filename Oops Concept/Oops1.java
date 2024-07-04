public class Oops1{
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a Pen object p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        
        p1.setTip(5);
        System.out.println(p1.Tip);
    }
}

class Pen {
    String color ;
    int Tip;

    void setColor(String newColor){
        color =newColor;
    }

    void setTip(int newTip){
        Tip = newTip;
    }
}