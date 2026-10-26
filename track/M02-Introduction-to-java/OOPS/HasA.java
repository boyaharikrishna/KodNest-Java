package OOPS;

class OS {
    OS() {
        System.out.println("Os is installed");
    }

    void checkOS() {
        System.out.println("Os is still installing");
    }
}

class Mobile {
    OS o = new OS();

    Mobile() {
        System.out.println("Mobile is create with os");
    }
}

public class HasA {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.o.checkOS();
        m= null;
            m.o.checkOS();
    }

}