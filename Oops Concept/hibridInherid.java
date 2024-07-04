
public class hibridInherid {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.swim ();
        shark.eat();

        }
    }


class Animal {
    String color;

    void eat (){
        System.out.println("Eats");
    }
}

class Fish extends Animal {
    void swim (){
        System.out.println("Swims");
    }
}

class Shark extends Fish {
    void type(){
        System.out.println("big fish");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println("Flies");
    }
}

class Peacock extends Bird {
    void category(){
        System.out.println("females");
    }
}

class Mammal extends Animal {
    void walk(){
        System.out.println("walks");
    }
}

class Dog extends Mammal {
    void roar(){
        System.out.println(" Roars");
    }
}

class Cat extends Mammal {
    void Sound (){
        System.out.println("Maew maew");
    }
}