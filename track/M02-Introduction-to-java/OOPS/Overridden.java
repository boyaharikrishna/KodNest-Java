package OOPS;

class Developer {
    void work() {
        System.out.println("Developer doing work");
    }

    void project() {
        System.out.println("Developer doing projece");

    }
}

class JavaDeveloper extends Developer {
    @Override
    void work() {
        System.out.println("JavaDeveloper doing work");

    }

    @Override
    void project() {
        System.out.println("JavaDeveloper doing project");

    }
}

class PythonDeveloper extends Developer {
    @Override
    void work() {
        System.out.println("PyhonDeveloper doing work");

    }

    @Override
    void project() {
        System.out.println("PyhonDeveloper doing project");

    }
}

public class Overridden {
    public static void main(String[] args) {
        JavaDeveloper j = new JavaDeveloper();
        accessMesthod(j);
        PythonDeveloper p = new PythonDeveloper();
        accessMesthod(p);
    }

    public static void accessMesthod(Developer d) {
        d.work();
        d.project();

    }
}
