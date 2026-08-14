class Person{
String name;
int age;
double height;
void input(String name,int age,double height){
    this.name = name;
    this.age=age;
    this.height=height;
}
void display(){
    System.out.println("his name is : " +name);
    System.out.println("his age is: "+age);
    System.out.println("his height is: " +height);
}
}
public class UsingThiss {
    public static void main(String[] args) {
        Person p = new Person();
        p.input("Krsihna", 21, 5.5);
        p.display();
    }
}
