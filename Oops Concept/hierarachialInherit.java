public class hierarachialInherit {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        
    }
}

class Animal {
    String color ;

        void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breaths");
    }
}

class Mammal extends Animal {
    void walks(){
        System.out.println("Walks");
    }
}

class Fish extends Animal {
    void Swim(){
        System.out.println(" Swims");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println("Flies");
    }
}

