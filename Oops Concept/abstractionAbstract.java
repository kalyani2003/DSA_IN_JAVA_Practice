public class abstractionAbstract{
    public static void main(String[] args) {
        Horse h = new Horse ();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();
        System.out.println(ch.color);
    }
}

 abstract class Animal {  // abstarct class 

    String color ;
    Animal (){   // constructor animal 
        color = "brown";
    }


    void eat () {
        System.out.println("animal eats ");
    }
    abstract void walk(); // walk is a abstract func ....idea implemented only here 
}

class Horse extends Animal {
        void changeColor(){
            color = " dark brown";  // but color returned is of parent class ..brown
        }

    void walk () {          // here we have must implemnted implementation of walk func
        System.out.println("walks on 4 legs ");
    }
}

class Chicken extends Animal {
    void changeColor(){
            color = " yellow";
    }

    void walk() {           // here we have must implemnted implementation of walk func
        System.out.println(" walks on 2 legs ");
    }
}