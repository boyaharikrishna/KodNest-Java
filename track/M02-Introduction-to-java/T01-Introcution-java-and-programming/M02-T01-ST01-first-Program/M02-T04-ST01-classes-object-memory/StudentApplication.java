class Student {
    int roll;
    String name;
    double height;

    void run() {
        System.out.println("Student is running");
    }

    void sleep() {
        System.out.println("Student is sleeping");
    }
}

class StudentApplication {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.roll = 10;
        s1.name = "hari";
        s1.height = 2.2;

        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);

        s1.run();
        s1.sleep();

        Student s2  = new Student();
        s2.roll = 20;
        s2.name = "krishna";
        s2.height = 5.2;

        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.height);

        s2.run();
        s2.sleep();

    }
}