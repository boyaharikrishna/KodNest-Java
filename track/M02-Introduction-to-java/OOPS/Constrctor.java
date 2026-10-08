package OOPS;
class Parent {
Parent(int a){
super();
System.out.println("In side pare 1 para con");
}
}
class Child extends  Parent{
Child(){
super(10);
System.out.println("Inside child 0 para con");
}

}
public class Constrctor {
    public static void main(String[] args) {
        Child c1 = new Child();
    }
}
