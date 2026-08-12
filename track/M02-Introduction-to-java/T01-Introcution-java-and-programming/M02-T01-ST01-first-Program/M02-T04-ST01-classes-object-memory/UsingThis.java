class Hari {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class UsingThis {

    public static void main(String[] args) {

        Hari s1 = new Hari();

        s1.input("Hari", 20, 5.5);

        s1.display();
    }
}