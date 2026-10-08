package OOPS;

class Parentt {
    void dis1() {
        System.out.println("Inside Parent display 1");
    }

    void dis2() {
        System.out.println("Inside Parent display2");
    }
}

class Childd extends Parentt {
    @Override
    void dis2() {

        System.out.println("inside Child display 2");
    }

    void dis3() {
        System.out.println("Inside Child display 3");
    }
}

public class Overriden {
    public static void main(String[] args) {
        Childd c = new Childd();
        c.dis1();
        c.dis2();
        c.dis3();
    }
}

