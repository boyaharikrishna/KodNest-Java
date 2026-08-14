
class Persons {
    String name;
    int age;
    double height;

    Persons(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("his name is : " + name);
        System.out.println("his age is: " + age);
        System.out.println("his height is: " + height);
    }
}

public class UisngConstructor {
    public static void main(String[] args) {
        Persons p = new Persons("Krsihna", 21, 5.5);
        p.display();
    }
}
