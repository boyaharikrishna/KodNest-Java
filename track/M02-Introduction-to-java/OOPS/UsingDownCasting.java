package OOPS;

class Pare {
    void dis1() {
        System.out.println("inside par dis1");
    }

    void dis2() {
        System.out.println("inside par dis2");

    }
}

class Chil1 extends Pare {
    @Override
    void dis2() {
        System.out.println("inside chil1 dis1");
    }

    void dis3() {
        System.out.println("inside chil1 dis2");

    }
}

class Chil2 extends Pare {
    @Override

    void dis2() {
        System.out.println("inside chil2 dis1");
    }

    void dis3() {
        System.out.println("inside chil2 dis2");

    }
}

public class UsingDownCasting {
    public static void main(String[] args) {
        Chil1 ch1 = new Chil1();
        accessMethod(ch1);
        Chil2 ch2 = new Chil2();
        accessMethod(ch2);
    }

    public static void accessMethod(Pare p) {
        p.dis1();
        p.dis2();

        if (p instanceof Chil1) {
            ((Chil1) (p)).dis3();
        } else {
            ((Chil2) (p)).dis3();

        }
    }
}
