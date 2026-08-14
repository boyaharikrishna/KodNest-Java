
class Emp {
    String name;
    int age;
    double height;

    Emp(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    Emp() {
        name = "Hair";
        age = 12;
        height = 5.5;
    }

    Emp(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class ConstructorOverLoad {
    public static void main(String[] args) {
        Emp e1 = new Emp("Krsihna", 25, 2.2);
        e1.display();
        Emp e2 = new Emp("maha dev");
        e2.display();
        Emp e3 = new Emp();
        e3.display();
    }
}
