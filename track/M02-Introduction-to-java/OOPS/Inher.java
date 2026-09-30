package OOPS;
class Car{
    String name = "Benz";
    void display(){
        System.out.println("Car name is : "+name);
    }
}
class Bike extends Car{
    String name = "JAWA";
    void displayName(){
        System.out.println("Bike name is : "+name);
    }

}

public class Inher {
    public static void main(String[] args) {
        Bike  c = new Bike();
        c.display();
        c.displayName();
    }
}
