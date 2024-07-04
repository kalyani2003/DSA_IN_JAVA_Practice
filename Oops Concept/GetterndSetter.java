public class GetterndSetter {
    public static void main(String[] args) {
        Pen p1 =new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pen{

    private String color;
    private int Tip;

    String getColor(){    //getter()
        return this.color;
    }

    int getTip(){
        return this.Tip;
    }

    void setColor(String newColor){   //Setter()
    this.color = newColor;
    }

    void setTip(int newTip){
        this.Tip = newTip;
    }
}
