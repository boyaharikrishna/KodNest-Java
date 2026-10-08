package OOPS;

class Animal {
    void eat() {
        System.out.println("Animal is Eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger is Haunted a deer and eat");
    }

    @Override
    void sleep() {
        System.out.println("Tiger is Sleeping");
    }

}

class Ox extends Animal {
    @Override
    void eat() {
        System.out.println("ox is eating a grass");
    }

    @Override
    void sleep() {
        System.out.println("Ox is Sleeping");
    }
}

public class OverAnimal {
    public static void main(String[] args) {

        Tiger t = new Tiger();
        t.eat();
        t.sleep();
        Ox o = new Ox();
        o.eat();
        o.sleep();
    }
}
