public class multipleInheritance {
    public static void main(String[] args) {
        Dog sheru = new Dog();
        sheru.eat();
        sheru.legs =4;
        System.out.println(sheru.legs);
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breaths");
    }
}

class Mammal extends Animal{
    int legs;

}

class Dog extends Mammal {
String breed;
}
