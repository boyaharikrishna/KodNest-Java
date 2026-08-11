class Employee {
    int id;
    String name;
    double salary;

    void work() {
        System.out.println("Employee is working");
    }
}

public class EmpApplication {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "Hari";
        e1.salary = 50000.0;

        System.out.println("ID: " + e1.id);
        System.out.println("Name: " + e1.name);
        System.out.println("Salary: " + e1.salary);
        e1.work();
        Employee e2 ;
        e2 = e1;
        e2.id = 12;
        e2.name = "krsishna";

        System.out.println(e2.id);
        System.out.println(e2.name);
        e2.work();

        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();
    }
}
